package com.spread.ydy.java8.chap14;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class LazyList<T> implements MyList<T> {
    final T head;
    final Supplier<MyList<T>> tail;

    public LazyList(T head, Supplier<MyList<T>> tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public T head() {
        return head;
    }

    @Override
    public MyList<T> tail() {
        /**
         * 这里tail使用了一个Supplier方法提供了延迟性
         * 调用Supplier的get方法会触发延迟列表（LazyList）的节点创建，就像工厂会创建新的对象一样。
         */
        return tail.get();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * 延迟筛选器
     * 
     * @param p
     * @return
     */
    @Override
    public MyList<T> filter(Predicate<T> p) {
        return isEmpty() ? this : // 你可以返回一个新的Empty<>()，不过这和返回一个空对象的效果是一样的
                p.test(head()) ? new LazyList<>(head(), () -> tail().filter(p)) : tail().filter(p);
    }
}
