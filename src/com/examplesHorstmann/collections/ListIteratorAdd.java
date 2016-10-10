package com.examplesHorstmann.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
p.695
 */
public class ListIteratorAdd {
    public static void main(String[] args) {
        List<String> list = AddElement();
        System.out.println("LinkedList after TEST element adding is: " + "\n" + list);
    }
    private static List<String> LinkedListCreate (){
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
        System.out.println("output LinkedList without Iterator usage: ");
        System.out.println(list);
        return list;

    }
    private static List<String> AddElement (){
        List<String> list = LinkedListCreate();
        ListIterator<String> listIterator = list.listIterator();
        listIterator.next();
        listIterator.next();
        listIterator.add("TEST");
        return list;
    }
}
