package com.examplesHorstmann.collections;
/*
p.695
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddRemoveElementsInTheLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Amy");
        list.add("Bob");
        list.add("Ted");
        list.add("Barbara");
        Iterator<String> itr = list.iterator();
        String first = itr.next();
        //String second = itr.next();
        itr.remove();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }
        System.out.println("element was deleted from LinkedList is " + first);
    }
}
