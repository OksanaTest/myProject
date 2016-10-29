package com.homeTasks.multithreadsMyCollection.threads;

import com.homeTasks.multithreadsMyCollection.MyCollectionImplementation;

public class ThreadForToString implements Runnable {
    private String name;
    public Thread t;
    final private MyCollectionImplementation myCollectionImplementation;

    public ThreadForToString(MyCollectionImplementation myCollectionImplementation, String name){
        this.name = name;
        this.myCollectionImplementation = myCollectionImplementation;
        t = new Thread(this, name);
        t.start();
    };
    @Override
    public void run() {
           synchronized (myCollectionImplementation){
                /*
        этот блок, похоже, лишний для этой задачи,
        достаточно join() в MyCollectionRunner
        */
               System.out.println("collection " + Thread.currentThread().getName() + " elements are: " +
                       myCollectionImplementation.toString() + "\n");
           }
    }
}

