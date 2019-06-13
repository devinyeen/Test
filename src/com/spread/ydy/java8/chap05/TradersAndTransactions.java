package com.spread.ydy.java8.chap05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TradersAndTransactions {

    public static void main(String[] args) {

        Traders raoul = new Traders("Raoul", "Cambridge");
        Traders mario = new Traders("Mario", "Milan");
        Traders alan = new Traders("Alan", "Cambridge");
        Traders brian = new Traders("Brian", "Cambridge");

        List<Transactions> Transactionss = Arrays.asList(
                new Transactions(brian, 2011, 300),
                new Transactions(raoul, 2012, 1000),
                new Transactions(raoul, 2011, 400),
                new Transactions(mario, 2012, 710),
                new Transactions(mario, 2012, 700),
                new Transactions(alan, 2012, 950));

        //找出2011年的所有交易并按交易额排序(从低到高)
        List<Transactions> tr2011 = Transactionss.stream()
                .filter(Transactions -> Transactions.getYear() == 2011)
                .sorted(Comparator.comparing(Transactions::getValue))
                .collect(Collectors.toList());

        for (Transactions Transactions2 : tr2011) {
            System.out.println(Transactions2);
        }
    }

}

class Traders {
    private final String name;
    private final String city;

    public Traders(String name, String city) {
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
        return this.getName() + " " + this.getCity();
    }

}

class Transactions {
    private final Traders Traders;
    private final int    year;
    private final int    value;

    public Transactions(Traders Traders, int year, int value) {
        super();
        this.Traders = Traders;
        this.year = year;
        this.value = value;
    }

    public Traders getTraders() {
        return Traders;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getTraders().toString() + " " + this.getYear() + " " + this.getValue();
    }

}