package com.java.learning.lamda;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // return 1 o1>o2
                                            // return 0 o1=o2
                                            //return -1 o1<o2
            }
        };
        System.out.println("Result "+ comparator.compare(4,4));

    Comparator<Integer> comparatorlambda=(o1,o2)->{
        return o1.compareTo(o2);
    } ;
        System.out.println("comparator Result using Lambda " + comparatorlambda.compare(3,5));
    }

}
