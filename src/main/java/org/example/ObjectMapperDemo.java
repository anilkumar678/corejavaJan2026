package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ObjectMapperDemo {
    public static void main(String[] args) throws Exception{

List<Integer> listOfNumbers=List.of(10,22,33,14,37,16);
List<Integer> startResult=listOfNumbers.stream().map(String::valueOf).filter(n->n.startsWith("1")).
        map(Integer::valueOf).collect(Collectors.toList());
startResult.forEach(System.out::println);



    }
}
