package test.myCollection.myCollectionAgain;


import com.myCollection.myCollectionAgain.MyCollectionImplementation;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyCollectionImplementationTests {
    private MyCollectionImplementation<Integer> myCollectionImplementation =
            new MyCollectionImplementation<>();
    private MyCollectionImplementation<String> stringMyCollectionImplementation =
            new MyCollectionImplementation<>();
    private MyCollectionImplementation<Integer> getMyCollectionImplementation =
            new MyCollectionImplementation<>();

    @Test
    public void isEmpty(){
        assertEquals(0, myCollectionImplementation.size());
    }
    @Test
    public void size(){
        myCollectionImplementation.add(23);
        assertEquals(1, myCollectionImplementation.size());
        stringMyCollectionImplementation.add("TEST");
        stringMyCollectionImplementation.add("TEST");
        assertEquals(2, stringMyCollectionImplementation.size());

        for(int i = 0; i < 12; i++){
            getMyCollectionImplementation.add(i);
        }
        assertEquals(10, getMyCollectionImplementation.size());

    }
    @Test
    public void add(){
        myCollectionImplementation.add(23);
        assertEquals("23 ", myCollectionImplementation.toString());
        stringMyCollectionImplementation.add("TEST");
        assertEquals("TEST ", stringMyCollectionImplementation.toString());
        stringMyCollectionImplementation.add("TEST_TEST");
        assertEquals( "TEST TEST_TEST ", stringMyCollectionImplementation.toString());

        for(int i = 0; i < 12; i++){
            getMyCollectionImplementation.add(i);
        }
        assertEquals("2 3 4 5 6 7 8 9 10 11 ", getMyCollectionImplementation.toString());
    }


}
