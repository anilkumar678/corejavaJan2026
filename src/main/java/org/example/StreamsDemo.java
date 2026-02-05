package org.example;

import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> list= List.of("anil","kumar","aravond","alekya");
        list.stream().filter(s->s.startsWith("a")).map(String::toUpperCase).forEach(System.out::println);

    }
}
