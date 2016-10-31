package com.homeTasks.multithreadsMyCollection.threads;

import com.homeTasks.multithreadsMyCollection.MyCollectionImplementation;

public class ThreadForRemoveDouble implements Runnable {
    private String name;
    public Thread t;
    private MyCollectionImplementation<Double> myCollectionImplementation;

    public ThreadForRemoveDouble(MyCollectionImplementation<Double> myCollectionImplementation, String name){
        this.myCollectionImplementation = myCollectionImplementation;
        this.name = name;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run(){
            myCollectionImplementation.remove(1.0);
    }
}
