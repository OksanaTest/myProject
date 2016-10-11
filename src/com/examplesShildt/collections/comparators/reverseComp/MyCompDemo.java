package com.examplesShildt.collections.comparators.reverseComp;

import java.util.TreeSet;

/*
p.618
 */
public class MyCompDemo {
    public static void main(String[] args) {
        MyComp mc = new MyComp();
        TreeSet<String> ts = new TreeSet<>(mc.reversed());
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("D");
        ts.add("F");
        for (String element: ts) {
            System.out.println(element + "\t");
        }
    }
}
