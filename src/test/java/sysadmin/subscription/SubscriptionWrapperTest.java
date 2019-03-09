package sysadmin.subscription;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author richa
 */
public class SubscriptionWrapperTest {
    
    public SubscriptionWrapperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of get method, of class SubscriptionWrapper.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        SubscriptionWrapper<String> instance = new SubscriptionWrapper<>("test");
        Object expResult = "test";
        String result = instance.get();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNotFound method, of class SubscriptionWrapper.
     */
    @Test
    public void testSetNotFound() {
        System.out.println("setNotFound");
        boolean notFound = false;
        SubscriptionWrapper<String> instance = new SubscriptionWrapper<>("test");
        instance.setNotFound(notFound);
        assertFalse(instance.isNotFound());
    }

    /**
     * Test of isNotFound method, of class SubscriptionWrapper.
     */
    @Test
    public void testIsNotFound() {
        System.out.println("isNotFound");
        SubscriptionWrapper<String> instance = new SubscriptionWrapper<>("test");
        instance.setNotFound(true);
        boolean expResult = true;
        boolean result = instance.isNotFound();
        assertEquals(expResult, result);
        
    }
    
}
