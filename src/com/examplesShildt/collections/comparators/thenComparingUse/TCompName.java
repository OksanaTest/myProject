package com.examplesShildt.collections.comparators.thenComparingUse;

import java.util.Comparator;

/*
p.621
 */
public class TCompName implements Comparator<String>{
    public int compare(String aStr,String bStr){
        return aStr.compareTo(bStr);
    }
}
