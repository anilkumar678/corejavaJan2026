package org.example;

import java.time.LocalDate;
import java.time.Period;

public class DateExample {
    public static void main(String[] args) {
        LocalDate  now=LocalDate.now();
        LocalDate birthDay=LocalDate.of(1988,11,12);
        Period age=Period.between(now,birthDay);
        System.out.println("age is"+age);
        System.out.println("using inline commenting");
        System.out.println("copy1 from hello");
    }
}
