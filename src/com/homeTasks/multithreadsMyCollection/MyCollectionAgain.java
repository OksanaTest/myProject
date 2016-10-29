package com.homeTasks.multithreadsMyCollection;

public interface MyCollectionAgain<E> extends Iterable<E>{
    void add(E element);
    int size();
    boolean isEmpty();
}
