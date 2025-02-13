package com.oops.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListOfEven {
    public static void main(String[] args) {

        List<Integer>listOfNumbers = new ArrayList<>();
        listOfNumbers.add(2);
        listOfNumbers.add(1);
        listOfNumbers.add(3);
        listOfNumbers.add(4);


        List<Integer>listOfEvenNumber = new ArrayList<>();

        Predicate<Integer> isEven = n ->n%2==0;

        for(Integer num : listOfNumbers)
        {
            if(isEven.test(num))
            {
                listOfEvenNumber.add(num);
            }
        }

//        listOfNumbers.forEach(x->
//        {
//            if(isEven.test(x))
//            {
//               listOfEvenNumber.add(x);
//           }
//
//        });

        System.out.println(listOfEvenNumber);
    }
}
