package com.homeTasks.multithreadsMyCollection.threads;

import com.homeTasks.multithreadsMyCollection.MyCollectionImplementation;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadForAddDouble implements Runnable {
    private String name;
    public Thread t;
    final private MyCollectionImplementation<Double> myCollectionImplementation;
    final private BlockingQueue<MyCollectionImplementation<Double>> interThreadQueue
            = new LinkedBlockingQueue<>();

    public ThreadForAddDouble(MyCollectionImplementation<Double> myCollectionImplementation, String name) {
        this.name = name;
        this.myCollectionImplementation = myCollectionImplementation;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
            for (double i = -1.0; i <= 3.0; i += 1) {
                myCollectionImplementation.add(i);
            }
    }
}
