package com.myCollection.myCollectionAgain;

public class MyCollectionRunner {
    public static void main(String[] args) {
        MyCollectionImplementation<Integer> myCollectionImplementation =
                new MyCollectionImplementation<>();
        MyCollectionImplementation<Double> doubleMyCollectionImplementation =
                new MyCollectionImplementation<>(20);

        for (int i = 0; i <= 14; i++){
            myCollectionImplementation.add(i);
        }
        for (double i = 0.5; i < 8.5; i += 0.5){
            doubleMyCollectionImplementation.add(i);
        }

        System.out.println("collection with Integer elements size is: " +
                + myCollectionImplementation.size() + "\n" );
        System.out.println("collection with INTEGER elements is: " +
                  myCollectionImplementation.toString() + "\n");
        System.out.println("collection with Double elements size is: " +
                doubleMyCollectionImplementation.size() + "\n");
        System.out.println("collection with DOUBLE elements is: " + doubleMyCollectionImplementation.toString());
    }
}
