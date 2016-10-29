package com.homeTasks.multithreadsMyCollection.threads;

import com.homeTasks.multithreadsMyCollection.MyCollectionImplementation;

public class ThreadForAddDouble implements Runnable {
    private String name;
    public Thread t;
    final private MyCollectionImplementation<Double> myCollectionImplementation;

    public ThreadForAddDouble(MyCollectionImplementation<Double> myCollectionImplementation, String name) {
        this.name = name;
        this.myCollectionImplementation = myCollectionImplementation;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        synchronized (myCollectionImplementation){
             /*
        этот блок, похоже, лишний для этой задачи,
        достаточно join() в MyCollectionRunner
        */
            for (double i = 0.5; i <= 9.3; i += 3) {
                myCollectionImplementation.add(i);
            }
        }
    }
}
