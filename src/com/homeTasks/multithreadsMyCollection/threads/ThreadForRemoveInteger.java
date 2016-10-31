package com.homeTasks.multithreadsMyCollection.threads;

import com.homeTasks.multithreadsMyCollection.MyCollectionImplementation;

public class ThreadForRemoveInteger implements Runnable {
    private String name;
    public Thread t;
    private MyCollectionImplementation<Integer> myCollectionImplementation;

     public ThreadForRemoveInteger(MyCollectionImplementation<Integer> myCollectionImplementation, String name){
        this.myCollectionImplementation = myCollectionImplementation;
        this.name = name;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run(){
            myCollectionImplementation.remove(1);
    }
}
