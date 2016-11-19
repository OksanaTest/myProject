package com.homeTasks.multithreadsMyCollection;

import com.homeTasks.multithreadsMyCollection.threads.*;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class MyCollectionRunner {
    public static void main(String[] args) throws InterruptedException{
        final MyCollectionImplementation<Integer> myCollectionImplementation =
                new MyCollectionImplementation<>(2);
        final MyCollectionImplementation<Double> doubleMyCollectionImplementation =
                new MyCollectionImplementation<>(5);

        ThreadForAddInteger threadForAdd = new ThreadForAddInteger(myCollectionImplementation,
                "ThreadForAddInteger");
        ThreadForAddDouble threadForAddDouble = new ThreadForAddDouble(doubleMyCollectionImplementation,
                "ThreadForAddDouble");
        threadForAdd.t.join();
        threadForAddDouble.t.join();

        ThreadForRemoveInteger threadForRemoveInteger = new ThreadForRemoveInteger(myCollectionImplementation,
               "ThreadForRemoveInteger");
        ThreadForRemoveDouble threadForRemove = new ThreadForRemoveDouble(doubleMyCollectionImplementation,
                "ThreadForRemoveDouble");
        threadForRemoveInteger.t.join();
        threadForRemove.t.join();

        new ThreadForSize(doubleMyCollectionImplementation, "Double size ");
        new ThreadForToString(myCollectionImplementation, "Integer");
        new ThreadForSize(myCollectionImplementation, "Integer size ");
        new ThreadForToString(doubleMyCollectionImplementation, "Double");
    }
}
