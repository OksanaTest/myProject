package com.examplesShildt.collections.LinkedListWithUserObjects;

import java.util.LinkedList;
import java.util.Spliterator;

/*
p.600
 */
public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();
        //input elements into LinkedList
        ml.add(new Address("West", "11 Oak Ave", "Urbana", "IL", "68090"));
        ml.add(new Address("Braun", "14 Oak Ave", "SomeValue", "SD", "11090"));
        ml.add(new Address("J.K. Lee", "5 Qwe Str", "SomeDistrict", "NY", "3490"));
        ml.add(new Address("R.H. Yellow", "18 Ret Str", "Urbana", "AK", "68920"));

        Spliterator<Address> splitr = ml.spliterator();
        splitr.forEachRemaining((n) -> System.out.println(n));
    }

}
