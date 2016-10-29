package com.homeTasks.multithreadsMyCollection.threads;

import com.homeTasks.multithreadsMyCollection.MyCollectionImplementation;

public class ThreadForAddInteger implements Runnable{
    private String name;
    public Thread t;
    final private MyCollectionImplementation<Integer> myCollectionImplementation;
    public ThreadForAddInteger(MyCollectionImplementation<Integer> myCollectionImplementation, String name){
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
            for (int i = 0; i <= 14; i++){
                myCollectionImplementation.add(i);
            }
        }
    }
}
