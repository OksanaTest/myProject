package com.examplesShildt.collections.comparators.lambdaExpession;

import java.util.TreeSet;

/*
p.618
 */
public class MyCompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts =
                new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("D");
        ts.add("F");
        for (String element: ts) {
            System.out.println(element);
        }
    }
}
