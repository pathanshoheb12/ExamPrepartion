package com.OOPS.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

interface SumOfTwoNumber {

    int addTwoIntegers(int number1, int number2);

}

public class sumOfTwoIntegers {
    public static void main(String[] args) {

        SumOfTwoNumber sum = (x, y) -> x + y;
        System.out.println(sum.addTwoIntegers(25, 32));

        BiFunction<Integer, Integer, Integer> sumOfTwoNumber = (x, y) -> x + y;

        Integer sumOfInteger = sumOfTwoNumber.apply(12, 12);
        System.out.println(sumOfInteger);

        BiConsumer<Integer,Integer> consumer = (y, x)-> System.out.println(y+x);
        consumer.accept(10,12);



    }
}
