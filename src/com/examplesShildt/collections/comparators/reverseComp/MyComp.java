package com.examplesShildt.collections.comparators.reverseComp;

import java.util.Comparator;

/*
p.618
 */
public class MyComp implements Comparator<String>{
    public int compare(String a, String b){
        String aStr, bStr;
        aStr = a;
        bStr = b;
        return aStr.compareTo(bStr);
    }
}
