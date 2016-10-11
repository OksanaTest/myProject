package com.examplesShildt.collections.comparators.myComp;

import java.util.Comparator;

/*
p.617
 */
public class MyComp implements Comparator<String>{
    public int compare(String a, String b){
        String aStr, bStr;
        aStr = a;
        bStr = b;
        return bStr.compareTo(aStr);
    }
}
