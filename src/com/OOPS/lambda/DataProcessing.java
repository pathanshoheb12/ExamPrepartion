package com.OOPS.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataProcessing {

    public static void main(String[] args) {

        List<Integer> listOfInteger = new ArrayList<>();

        listOfInteger.add(1);
        listOfInteger.add(4);
        listOfInteger.add(5);
        listOfInteger.add(10);
        listOfInteger.add(7);
        DataProcessor doubleList = (list) -> list.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println("Doubles each number in the list : ");
        System.out.println(applyProcessor(doubleList, listOfInteger));

        DataProcessor filterProcess = (list)->list.stream().filter(x->x>5).collect(Collectors.toList());
        System.out.println("Filtering Numbers which is greater than 5 ");
        System.out.println(applyProcessor(filterProcess,listOfInteger));

    }

    public static List<Integer> applyProcessor(DataProcessor processor, List<Integer> data) {

        return processor.processData(data);
    }
}
