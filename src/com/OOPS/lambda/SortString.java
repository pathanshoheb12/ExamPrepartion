package com.OOPS.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class SortString {

    public static void main(String[] args) {

        List<String>listOFNames = new ArrayList<>();
        listOFNames.add("Raaj");
        listOFNames.add("Abhi");
        listOFNames.add("Sahil");
        listOFNames.add("Rahul");

        List<String> sortedNumber = new ArrayList<>();

        Function<List<String>,List<String>> listFunction = (names)->
        {
            for(String name : names) {
                sortedNumber.add(name);
            }
            Collections.sort(sortedNumber);
            return sortedNumber;
        };
        listFunction.apply(listOFNames);
        System.out.println(sortedNumber);
    }
}
