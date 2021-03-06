package com.spread.ydy.java8.chap06;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

public class Transactions {

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

        // 按value分组
        //Map<Integer, List<Transaction>> transactionsByValue = transactions.stream().collect(Collectors.groupingBy(Transaction::getValue));
        // 按year分组
        Map<Integer, List<Transaction>> transactionsByValue = transactions.stream().collect(groupingBy(Transaction::getYear));
        System.out.println(transactionsByValue);
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