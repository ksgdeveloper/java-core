package com.shree.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Program01FunctionalInterfaceDemo {


    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4);

        Predicate<Integer> IsintegerPredicate = x -> x % 2 == 0;
        Function<Integer, Integer> integerIntegerFunction = x-> x*x;
        Consumer<Integer> println = System.out::println;

        numbers.stream()
                .filter(IsintegerPredicate)
                .map(integerIntegerFunction)
                .forEach(println);

    }
}
