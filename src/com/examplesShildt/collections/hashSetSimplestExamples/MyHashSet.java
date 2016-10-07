package com.examplesShildt.collections.hashSetSimplestExamples;

import java.util.HashSet;

public class MyHashSet {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("String");
        hs.add("TEST");
        hs.add("testTEST");
        hs.add("SomeString");

        System.out.println(hs);
    }
}

