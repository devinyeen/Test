package com.spread.ydy.java8.chap05;

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.List;
import java.util.Optional;
import static java.util.stream.Collectors.*;

public class TraderSAndrTransactions {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
                );
        // 5.1找出2011所有交易并按交易额排序
        List<Transaction> tr2001 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
        System.out.println(tr2001);

        // 5.2交易员分别都在哪些不同城市工作过
        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
        System.out.println(cities);

        // 5.3查找所有来自于剑桥的交易员 并按姓名排序
        List<Trader> cambridges = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader->trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());
        System.out.println(cambridges);

        // 5.4.1 返回所有交易员姓名字符串 按字母顺序排序
//        List<String> traders = transactions.stream()
//                .map(Transaction::getTrader)
//                .map(Trader::getName)
//                .distinct()
//                .sorted()
//                .collect(Collectors.toList());
        // 5.4.2 返回所有交易员姓名字符串 按字母顺序排序
//        String traders = transactions.stream()
//                .map(transaction -> transaction.getTrader().getName())
//                .distinct()
//                .sorted()
//                .reduce("", (n1, n2) -> n1 + n2);
//        System.out.println(traders);
        // 5.4.3 返回所有交易员姓名字符串 按字母顺序排序
        String traders = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(joining());
        System.out.println(traders);

        // 5.5 返回所有交易员姓名字符串 按字母顺序排序
        boolean milan = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milan);

        // 5.6 打印生活在剑桥的交易员的所有交易额
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(transaction->transaction.getValue())
                .forEach(System.out::println);

        // 5.7.1 所有叫哟中最高的交易是多少
        Optional<Integer> maxTr = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(maxTr.get());
        // 5.7.2 所有叫哟中最高的交易是多少
        Optional<Transaction> maxTr1 = transactions.stream()
                .max(comparing(Transaction::getValue));
        System.out.println(maxTr1.get().getValue());
    }

}

class Trader {
    private final String name;
    private final String city;

    public Trader(String name, String city) {
        super();
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader [name=" + name + ", city=" + city + "]";
    }
}

class Transaction {
    private final Trader trader;
    private final int year;
    private final int value;

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    public Transaction(Trader trader, int year, int value) {
        super();
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
    }
}