package com.examplesShildt.collections.forEach;

import java.util.ArrayList;

/*
p.596
 */
public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<>();
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        System.out.println("initial array list is; ");
        for (int v: vals) {
            System.out.print(v + "\t");
        }
        System.out.println();
        int sum = 0;
        for (int v: vals) {
            sum += v;
        }
        System.out.println("elements sum for all array list element is: " + sum);
    }
}
