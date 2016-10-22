package com.homeTasks.myCollectionAgain;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyCollectionImplementation<E> implements MyCollectionAgain<E> {
    private Node<E> last;// looks like this field and one more below should be marked as a transient
    private Node<E> first;// if this class will implements Serializable
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
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public void add(E item) {
        try {
            if (n < capacity) {
                Node<E> anlast = last;
                last = new Node<>();
                last.setElement(item);
                last.setNext(null);
                if (isEmpty()) {
                    first = last;
                } else anlast.setNext(last);
                n++;
            } else {
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
    public String toString() {
        StringBuilder s = new StringBuilder();
        if (!isEmpty()) {
            for (E element : this) {
                s.append(element + " ");
            }
        } else {
            try {
                throw new EmptyCollectionException();
            } catch (EmptyCollectionException e) {
                System.err.println("EmptyCollectionException has been caught in the toString() method");
            }
            ;
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

