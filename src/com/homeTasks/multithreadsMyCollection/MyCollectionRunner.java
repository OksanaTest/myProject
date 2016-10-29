package com.homeTasks.multithreadsMyCollection;

import com.homeTasks.multithreadsMyCollection.threads.ThreadForAddDouble;
import com.homeTasks.multithreadsMyCollection.threads.ThreadForAddInteger;
import com.homeTasks.multithreadsMyCollection.threads.ThreadForSize;
import com.homeTasks.multithreadsMyCollection.threads.ThreadForToString;

public class MyCollectionRunner {
    public static void main(String[] args) throws InterruptedException{
        final MyCollectionImplementation<Integer> myCollectionImplementation =
                new MyCollectionImplementation<>(1);
        final MyCollectionImplementation<Double> doubleMyCollectionImplementation =
                new MyCollectionImplementation<>(5);

        ThreadForAddInteger threadForAdd = new ThreadForAddInteger(myCollectionImplementation,
                "ThreadForAddInteger");
        threadForAdd.t.join();
        ThreadForAddDouble threadForAddDouble = new ThreadForAddDouble(doubleMyCollectionImplementation,
                "ThreadForAddDouble");
        threadForAddDouble.t.join();
        new ThreadForSize(doubleMyCollectionImplementation, "ThreadForSizeDouble");
        new ThreadForToString(myCollectionImplementation, "ThreadForToString");
        new ThreadForSize(myCollectionImplementation, "ThreadForSizeInteger");
        new ThreadForToString(doubleMyCollectionImplementation, "ThreadForToStringDouble");
    }
}
