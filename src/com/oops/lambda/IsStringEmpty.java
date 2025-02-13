package com.oops.lambda;

import java.util.function.Predicate;

public class IsStringEmpty {
    public static void main(String[] args) {

        Predicate<String> isEmpty = str->str.isEmpty();

        System.out.println("String is Empty ? "+isEmpty.test(""));

    }
}
