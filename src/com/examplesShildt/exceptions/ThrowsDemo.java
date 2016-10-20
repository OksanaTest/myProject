package com.examplesShildt.exceptions;
/*
p.274
 */
public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("in the throwOn()"); throw new IllegalAccessException("demonstration");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("exception has bee caught: " + e);
        }
    }
}
