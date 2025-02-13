package com.oops.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ListOfStringConvertToUpperCase {
    public static void main(String[] args) {

        List<String> listOfStrings = new ArrayList<String>();
        listOfStrings.add("apple");
        listOfStrings.add("mango");
        listOfStrings.add("orange");
        List<String> listOfStringsUpper = new ArrayList<String>();

        Function<List<String>, List<String>> function = listOfString ->
        {
            for (String str : listOfString) {
                listOfStringsUpper.add(str.toUpperCase());
            }

            return listOfStringsUpper;

        };

        function.apply(listOfStrings);
        System.out.println(listOfStringsUpper);
    }
}
