package com.spread.ydy.java8.chap12;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.time.temporal.TemporalAdjusters.nextOrSame;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;

public class DateTest {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2019, 7, 20);
        LocalDate date2 = date1.with(nextOrSame(DayOfWeek.SUNDAY));
        LocalDate date3 = date2.with(lastDayOfMonth());
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        TemporalAdjuster nextWorkingDay = new NextWorkingDay();
        LocalDate date4 = date1.with(nextWorkingDay);
        System.out.println(date4);
        LocalDate date5 = date2.with(nextWorkingDay);
        System.out.println(date5);
        LocalDate date6 = date3.with(nextWorkingDay);
        System.out.println(date6);
    }

}
