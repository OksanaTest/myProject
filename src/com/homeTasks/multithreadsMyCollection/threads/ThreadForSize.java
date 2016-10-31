package com.homeTasks.multithreadsMyCollection.threads;

import com.homeTasks.multithreadsMyCollection.MyCollectionImplementation;

public class ThreadForSize implements Runnable {
    private String name;
    private Thread t;
    final private MyCollectionImplementation myCollectionImplementation;

    public ThreadForSize(MyCollectionImplementation myCollectionImplementation, String name)throws InterruptedException{
        this.name = name;
        this.myCollectionImplementation = myCollectionImplementation;
        t = new Thread(this, name);
        t.start();
    };
    @Override
    public void run() {
            System.out.println("collection " +Thread.currentThread().getName() + " is: " +
                    myCollectionImplementation.size() + "\n" );
        }
}
