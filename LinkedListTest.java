import org.junit.*;

import java.util.LinkedList;

/**
 * Created by ITHILLEL7 on 08.12.2015.
 */
public class LinkedListTest {
/*
    @BeforeClass
    public static void setUpClass(){
        System.out.println("Setup Class");
    }

    @Before
    public void setUp() {
        System.out.println("Set Up");
    }


///

    @After
    public void tearDown() {
        System.out.println("Tear Down");
    }
    @AfterClass
    public static void tearDownClas(){
        System.out.println("Tear Down Class");
    }
*/

    MyLinkedList myLinkedList;

    @Before
    public void setUp(){
        myLinkedList = new MyLinkedList();
    }


    @Test
         public void testSizeEmpty() {
        //MyLinkedList myLinkedList = new MyLinkedList();
        int size = myLinkedList.size();
        Assert.assertEquals(0,size);
        /*
        LinkedList linkedList = new LinkedList();
        int size = linkedList.size();
        Assert.assertEquals(0,size);
        */
    }

    //@Ignore
    @Test
    public void testSizeNotEmpty() {
        //MyLinkedList myLinkedList = new MyLinkedList();
        Integer first = 1;
        Integer second = 2;
        myLinkedList.add(first);
        myLinkedList.add(second);
        int size = myLinkedList.size();
        Assert.assertEquals("OnExpected elements", 0, size);
        /*
        LinkedList linkedList = new LinkedList();
        Integer first = 1;
        Integer second = 2;
        linkedList.add(first);
        linkedList.add(second);
        */
    }
}
