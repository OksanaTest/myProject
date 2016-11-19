package com.homeTasks.multithreadsMyCollection;

import javax.management.monitor.Monitor;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ForkJoinPool;

public class MyCollectionImplementation<E> implements MyCollectionAgain<E> {
    private transient Node<E> last;
    private transient Node<E> first;
    private int n;
    private int capacity;

    public MyCollectionImplementation() {
        this.capacity = 10;
        first = null;
        last = null;
        n = 0;
    }

    public MyCollectionImplementation(int capacity) {
        this.capacity = capacity;
        first = null;
        last = null;
        n = 0;
    }

    @Override
    public synchronized boolean isEmpty() {
        return (first == null) ;
    }

    @Override
    public synchronized int size() {
        return n;
    }

    @Override
    public synchronized void add(E item) {
        try {
            if (n < capacity && capacity > 1) {
                Node<E> anlast = last;
                last = new Node<>();
                last.setElement(item);
                last.setNext(null);
                if (isEmpty()) {
                    first = last;
                } else anlast.setNext(last);
                n++;
            }
            else if (n <= capacity && capacity == 1){
                last = new Node<>();
                last.setElement(item);
                last.setNext(null);
                first = last;
                n = 1;
            }
            else {
                first = first.getNext();
                Node<E> anlast = last;
                last = new Node<>();
                last.setElement(item);
                last.setNext(null);
                anlast.setNext(last);
            }
        } catch (NullPointerException e) {
            System.err.println("[WARNING]: some collection\'s capacity is zero or negative, " +
                    "default size 2 was selected");
            capacity = 2;
        }
    }

    @Override
    public synchronized boolean remove(E element){
        if(first == null) {
            return false;
        }
        else if (first == last && first.getElement().equals(element)) {
            first = null;
            last = null;
            n --;
            return true;
        }
        else if (first.getElement().equals(element)) {
            first = first.getNext();
            n --;
            return true;
        }
        Node<E> node = first;
        while (node.getNext() != null) {
            if (node.getNext().getElement().equals(element)) {
                if(last == node.getNext()) {
                    last = node;
                }
                node.setNext(node.getNext().getNext());
                n --;
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        if (!isEmpty()) {
            for (E element : this) {
                s.append(element + " ");
            }
        }
            return s.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new MyCollectionIterator<>(first);
    }

    private class MyCollectionIterator<E> implements Iterator<E> {
        private Node<E> current;

        public MyCollectionIterator(Node<E> first) {
            current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("[ERROR]: hasNext() " +
                            "RETURN EXCEPTION FOR EMPTY COLLECTION");
                }
                E element = current.getElement();
                current = current.getNext();
                return element;
        }
    }
}

