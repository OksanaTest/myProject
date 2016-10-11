package com.examplesShildt.collections.comparators.compTreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*

 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());
        tm.put("Some Jon", 3434.34);
        tm.put("Some Mary", 123.22);
        tm.put("Some Shad", 1378.00);
        tm.put("Some Larry", 99.22);
        tm.put("Some Smith", - 19.08);
        //elements set
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        //output elements
        for (Map.Entry<String, Double> me: set) {
            System.out.println(me.getKey() + "\t" + me.getValue());
        }
        System.out.println();
        //put 100 to Some Jon account
        double balance = tm.get("Some Jon");
        tm.put("Some Jon", balance + 100);
        System.out.println("Some Jon account new balance is: " +
        + tm.get("Some Jon"));
    }
}
