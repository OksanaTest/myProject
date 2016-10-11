package com.examplesHorstmann.collections;
/*
p.699
 */
import java.util.*;

public class LinkedListsMerger {
    public static void main(String[] args) {
        List<String> listFirst = new LinkedList<>();
        listFirst.add("Abby");
        listFirst.add("Tom");
        listFirst.add("Erica");
        listFirst.add("Magda");
        listFirst.add("Julia");

        List<String> listSecond = new LinkedList<>();
        listSecond.add("AbbySecond");
        listSecond.add("TomSecond");
        listSecond.add("EricaSecond");

        //union words from two lists

        ListIterator<String> listFirstItr = listFirst.listIterator();
        Iterator<String> listSecondItr = listSecond.iterator();

        while(listSecondItr.hasNext()){
            listFirstItr.next();
            listFirstItr.add(listSecondItr.next());
        }
        System.out.println(listFirst);
        System.out.println("LinkedList second is: " + listSecond);
        //remove each second word from listSecond
        listSecondItr = listSecond.iterator();
        while(listSecondItr.hasNext()){
            listSecondItr.next();//skip one element
            if(listSecondItr.hasNext()){//verify list has one more element
                listSecondItr.next();
                listSecondItr.remove();//remove element was iterated in the step after
            }
        }
        System.out.println("LinkedList second after each second element removing is: " + listSecond);

    }
}
