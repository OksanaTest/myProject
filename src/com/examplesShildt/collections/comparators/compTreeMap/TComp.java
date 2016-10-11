package com.examplesShildt.collections.comparators.compTreeMap;

import java.util.Comparator;

/*
p.619
 */
public class TComp implements Comparator<String>{
    public int compare(String aStr, String bStr){
        int i, j, k;
        //first surname element index
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0){
            return aStr.compareTo(bStr);
        }
        else return k;
    }
}
