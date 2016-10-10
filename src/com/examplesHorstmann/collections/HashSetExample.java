package com.examplesHorstmann.collections;
/*
p. 705
 */

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        long totalTime = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
                String word = in.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            if(in.next().equals("exit")){
                break;
            }
            }
            Iterator<String> itr = words.iterator();
            for (int i = 1; i <= 20 && itr.hasNext(); i++) {
                System.out.println(itr.next());
                System.out.println("....");
                System.out.println(words.size() + "\t" + "distinct word. " + totalTime + "\t" + "milliseconds.");
            }
        System.out.println(words);
        }
    }
