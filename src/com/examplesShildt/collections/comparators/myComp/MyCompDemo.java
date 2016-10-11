package com.examplesShildt.collections.comparators.myComp;

import java.util.TreeSet;

/*
p.617
 */
public class MyCompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        for (String element: ts) {
            System.out.println(element + "\t");
        }
    }
}
