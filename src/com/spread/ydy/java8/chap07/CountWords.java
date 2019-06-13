package com.spread.ydy.java8.chap07;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CountWords {

    public static void main(String[] args) {
        System.out.println("Found " + countWordsIteratively(SENTENCE) + " words");

        Stream<Character> stream = IntStream.range(0, SENTENCE.length()).mapToObj(SENTENCE::charAt);
        System.out.println("Found " + countWords(stream) + " words");

        stream = IntStream.range(0, SENTENCE.length()).mapToObj(SENTENCE::charAt);
        System.out.println("Found " + countWords(stream.parallel()) + " words");

        Spliterator<Character> spliterator = new WordCounterSpliterator(SENTENCE);
        stream = StreamSupport.stream(spliterator, true);
        System.out.println("Found " + countWords(stream) + " words");
    }

    // 但丁 神曲
    final static String SENTENCE = " Nel   mezzo del cammin  di nostra  vita " + "mi  ritrovai in una  selva oscura"
            + " che la  dritta  via era   smarrita ";

    /**
     * @param s
     * @return
     */
    public static int countWordsIteratively(String s) {
        int counter = 0;
        boolean lastSpace = true;
        // 逐个遍历String中的所有字符
        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                lastSpace = true;
            } else {
                // 上一个字符是空格，而当前遍历的字符不是空格时，将单词计数器加一
                if (lastSpace)
                    counter++;
                lastSpace = false;
            }
        }
        return counter;
    }

    private static int countWords(Stream<Character> stream) {
        WordCounter wordCounter = stream.reduce(new WordCounter(0, true), WordCounter::accumulate,
                WordCounter::combine);
        return wordCounter.getCounter();
    }
}

/**
 * 用来在遍历Character流时计数的类
 */
class WordCounter {
    private final int counter;
    private final boolean lastSpace;

    public WordCounter(int counter, boolean lastSpace) {
        this.counter = counter;
        this.lastSpace = lastSpace;
    }

    // 和迭代算法一样 accumulate 方法一个个遍历Character
    // 还是上面所述四种情况，只有第二种情况 counter 才能加1
    public WordCounter accumulate(Character c) {
        if (Character.isWhitespace(c)) {
            return lastSpace ? this : new WordCounter(counter, true);
        } else {
            // 上一个字符是空格，而当前遍历的字符不是空格时，将单词计数器加一
            return lastSpace ? new WordCounter(counter + 1, false) : this;
        }
    }

    // 合并两个 WordCounter，把其计数器加起来
    // 并行时合并的算法
    public WordCounter combine(WordCounter wordCounter) {
        // 仅需要计数器的总和，无需关心lastSpace
        return new WordCounter(counter + wordCounter.counter, wordCounter.lastSpace);
    }

    public int getCounter() {
        return counter;
    }
}

class WordCounterSpliterator implements Spliterator<Character> {

    private final String string;

    private int currentChar = 0;

    public WordCounterSpliterator(String string) {
        this.string = string;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Character> action) {
        // 处理当前字符
        // 个人理解，一步一步处理分支上的字符
        action.accept(string.charAt(currentChar++));
        // 如果还有字符要处理，则返回true
        return currentChar < string.length();
    }

    @Override
    public Spliterator<Character> trySplit() {
        int currentSize = string.length() - currentChar;
        if (currentSize < 10) {
            // 返回null 表示要解析的String已经足够小，可以顺序处理
            return null;
        }

        // 将试探拆分位置设定为要解析的String的中间
        for (int splitPos = currentSize / 2 + currentChar;
                splitPos < string.length(); splitPos++) {
            if (Character.isWhitespace(string.charAt(splitPos))) {
                // 创建一个新的 WordCounterSpliterator 来解析String从开始到拆分位置的部分
                Spliterator<Character> spliterator =
                        new WordCounterSpliterator(string.substring(currentChar, splitPos));

                // 将这个WordCounterSpliterator的起始位置设为拆分位置
                currentChar = splitPos;
                return spliterator;
            }
        }
        return null;
    }

    @Override
    public long estimateSize() {
        return string.length() - currentChar;
    }

    @Override
    public int characteristics() {
        return ORDERED + SIZED + SUBSIZED + NONNULL + IMMUTABLE;
    }
}