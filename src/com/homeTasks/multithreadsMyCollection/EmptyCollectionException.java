package com.homeTasks.multithreadsMyCollection;

public class EmptyCollectionException extends RuntimeException{
    public EmptyCollectionException(){
        System.err.print("[INFORMATION]: some collection is empty, no element to be showed, ");
    }
}
