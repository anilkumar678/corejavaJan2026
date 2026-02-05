package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceDemo {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(2);
        service.submit(()-> System.out.println("first service running"));
        service.submit(()-> System.out.println("second Thread is running"));

        service.shutdown();
        service.submit(()-> System.out.println("second Thread is running"));
    }
}
