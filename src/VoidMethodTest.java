
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class VoidMethodTest {
    private VoidMethodClass lstPersons = new VoidMethodClass();

    @Before
    public void initialize()
    {
        lstPersons.add("Chetan");
        lstPersons.add("Aditya");
        lstPersons.add("Parth");
    }

    @After
    public void destroy() {lstPersons.removeAll(); }

    @Test
    public void testSizeMethod(){
        int expected=3;
        Assert.assertEquals(expected,lstPersons.size());
    }
    @Test
    public void testAddMethod(){
    lstPersons.add("Ritesh");
    int expected=4;
        Assert.assertEquals(expected,lstPersons.size());
    }

    @Test
    public  void testRemoveMethodWorking(){
        lstPersons.remove("Chetan");
        int expected =2;
        Assert.assertEquals(expected,lstPersons.size());
    }
    @Test(expected = NoSuchElementException.class)
    public  void testRemoveMethodForException(){
        lstPersons.remove("Abc");
        int expected =2;
        Assert.assertEquals(expected,lstPersons.size());
    }
}
