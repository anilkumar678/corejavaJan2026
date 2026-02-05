package org.example;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> option1=Optional.of("anilkumar");
        Optional<String> option2=Optional.ofNullable(null);
        System.out.println(option1.get());
        System.out.println(option2.orElse("anil"));
    }
}
