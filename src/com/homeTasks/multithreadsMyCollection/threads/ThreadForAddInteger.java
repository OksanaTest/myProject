package com.homeTasks.multithreadsMyCollection.threads;

import com.homeTasks.multithreadsMyCollection.MyCollectionImplementation;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadForAddInteger implements Runnable{
    private String name;
    public Thread t;
    final private MyCollectionImplementation<Integer> myCollectionImplementation;
    final private BlockingQueue<MyCollectionImplementation<Integer>> interThreadQueue
            = new LinkedBlockingQueue<>();

    public ThreadForAddInteger(MyCollectionImplementation<Integer> myCollectionImplementation, String name){
        this.name = name;
        this.myCollectionImplementation = myCollectionImplementation;
        t = new Thread(this, name);
        t.start();
    };
    @Override
    public void run() {
            for (int i = 0; i < 4; i++){
                myCollectionImplementation.add(i);
            }
    }
}
