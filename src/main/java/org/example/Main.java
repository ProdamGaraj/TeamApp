package org.example;

import org.springframework.scheduling.annotation.Async;

public class Main {
    @Async
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}