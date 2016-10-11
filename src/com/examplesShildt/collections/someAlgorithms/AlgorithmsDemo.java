package com.examplesShildt.collections.someAlgorithms;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/*
p.628
 */
public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);
        System.out.println("initial LinkedList is: ");
        for (int i : ll) {
            System.out.println(i + " ");
        }
        //comparator with elements reverse order
        Comparator<Integer> r = Collections.reverseOrder();
        //list sorting by that comparator
        Collections.sort(ll, r);
        System.out.println("reverse order for LinkedList elements: ");
        for (int i: ll) {
            System.out.println(i + " ");
        }
        Collections.shuffle(ll);
        System.out.println("shuffled LinkedList is: ");
        for (int i: ll) {
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("min: " + Collections.min(ll));
        System.out.println("max: " + Collections.max(ll));
    }
}
