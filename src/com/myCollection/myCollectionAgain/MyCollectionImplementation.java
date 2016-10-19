package com.myCollection.myCollectionAgain;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyCollectionImplementation<E> implements MyCollectionAgain<E> {
    private Node<E> last;// looks like this field and one more below should be marked as a transient
    private Node<E> first;
    private int n;

    public MyCollectionImplementation() {
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
        if (n < 10) {
            Node<E> anlast = last;
            last = new Node<>();
            last.setElement(item);
            last.setNext(null);
            if (isEmpty()) {
                first = last;}
            else anlast.setNext(last);
            n++;
        } else {
            first = first.getNext();
            Node<E> anlast = last;
            last = new Node<>();
            last.setElement(item);
            last.setNext(null);
            anlast.setNext(last);
        }
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        if (!isEmpty())
            for (E element : this) {
                s.append(element + " ");
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
        public boolean hasNext(){
            return current != null;}

        @Override
        public E next() {
            if (!hasNext()) throw new NoSuchElementException();
            E element = current.getElement();
            current = current.getNext();
            return element;
        }
    }

}

