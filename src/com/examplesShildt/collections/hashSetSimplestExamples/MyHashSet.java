package com.examplesShildt.collections.hashSetSimplestExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MyHashSet {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("String");
        hs.add("TEST");
        hs.add("testTEST");
        hs.add("SomeString");

        System.out.println("HashSet " + hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("String");
        lhs.add("TEST");
        lhs.add("testTEST");
        lhs.add("SomeString");

        System.out.println("LinkedHashSet " + lhs);

    }
}

