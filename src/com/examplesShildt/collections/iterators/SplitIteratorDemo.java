package com.examplesShildt.collections.iterators;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Spliterator;

/*
p.598
 */
public class SplitIteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(16.0);
        vals.add(9.0);
        vals.add(4.0);
        vals.add(25.0);
        //call tryAdvance() for array list
        System.out.println("array list contains: ");
        Spliterator<Double> splitr = vals.spliterator();
        while(splitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        splitr = vals.spliterator();
        ArrayList<Double> sqrt = new ArrayList<>();
        while (splitr.tryAdvance((n) -> sqrt.add(Math.sqrt(n))));
        System.out.println("sqrt array list is: ");
        splitr = sqrt.spliterator();
        splitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
