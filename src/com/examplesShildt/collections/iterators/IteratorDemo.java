package com.examplesShildt.collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Queue;

/*
p.595
 */
public class IteratorDemo {
    public static  void main(String[] args) {
        //create array list
        ArrayList<String> al = new ArrayList<>();
        //input elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        //use iterator to output array list elements
        System.out.println("initial array list is: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
        //elements modification
        ListIterator<String> litr = al.listIterator();
        while(litr.hasNext()){
            String element = litr.next();
            litr.set(element + "+");
        }
        System.out.println("array list modified is: ");
        itr = al.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + "\t");
        }
        System.out.println();
        //reverse order elements display
        System.out.println("reverse order elements in the array list is:");
        while(litr.hasPrevious()){
            System.out.print(litr.previous() + "\t");
        }
        System.out.println();
        //Queue
    }
}
