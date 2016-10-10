package com.examplesHorstmann.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
p.695
several iterators can be as a reader
and only one can modify collection to avoid ConcurrentModificationException
 */
public class AddElementToLinkedList {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("Amy");
        list.add("Carl");
        list.add("Bob");
        list.add("Barbara");
        Iterator<String> itr = list.iterator();
        System.out.println("initial LinkedList is: ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("\n" + "output LinkedList without Iterator usage: ");
        System.out.println(list);

        ListIterator<String> listIterator = list.listIterator();
        listIterator.next();
        listIterator.next();
        listIterator.add("TEST");

        Iterator<String> itrAgain = list.iterator();
        System.out.println("\n" + "LinkedList after element TEST adding: ");
        while (itrAgain.hasNext()){
            System.out.println(itrAgain.next());
        }

    }
}

