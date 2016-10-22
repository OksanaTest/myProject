package com.myCollection.myCollectionAgain;

public class Node<E> {
    private E element;
    private Node<E> next;

    public Node<E> getNext() {
        return next;
    }

//test
    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
