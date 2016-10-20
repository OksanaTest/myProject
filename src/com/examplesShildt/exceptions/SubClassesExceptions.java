package com.examplesShildt.exceptions;
/*
p.269
 */
public class SubClassesExceptions {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42/a;
        } catch (Exception e){
            System.out.println("Exception class exceptions catch");
        } //catch (ArithmeticException e){//compiler error, ArithmeticException has already been caught
            //System.out.println("this code part will not ever be run");
        //}
    }
}
