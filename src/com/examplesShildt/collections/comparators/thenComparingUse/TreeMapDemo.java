package com.examplesShildt.collections.comparators.thenComparingUse;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
p.621
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm =
                new TreeMap<>(new TCompSurname().thenComparing(new TCompName()));
        tm.put("Some Jon", 3434.34);
        tm.put("Some Mary", 123.22);
        tm.put("Some Tad", 1378.00);
        tm.put("Some Larry", 99.22);
        tm.put("Some Smith", - 19.08);
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for (Map.Entry<String, Double> me: set) {
            System.out.println(me.getKey() + ": " +
            + me.getValue());
        }
        System.out.println();
        //put 100 to the Some Jon account
        Double balance = tm.get("Some Jon");
        tm.put("Some Jon", balance + 100);
        System.out.println("Some Jon new balance is: " + tm.get("Some Jon"));
    }
}
