package com.examplesShildt.collections.comparators.thenComparingUse;

import java.util.Comparator;

/*
p.621
 */
public class TCompSurname implements Comparator<String>{
    public int compare(String aStr, String bStr){
        int i, j;
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareTo(bStr.substring(j));

    }
}
