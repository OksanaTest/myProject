package com.examplesShildt.exceptions;
/*
p.271
 */
public class ThrowDemo {
    static void demoproc() {
        try{
            throw new NullPointerException("demonstration");
        } catch (NullPointerException e) {
            System.out.println("exception cauthg in the demoproc method");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e) {
            System.out.println("cauthg NullPointerException again" + e);
        }
    }
}
