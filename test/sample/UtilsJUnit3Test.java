/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package sample;

import java.util.concurrent.TimeoutException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1DAW2425-05
 */
public class UtilsJUnit3Test {
    
    public UtilsJUnit3Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("* UtilsJUnit3Test: setUp() method");
    }
    
    @After
    public void tearDown() {
        System.out.println("* UtilsJUnit3Test: tearDown() method");
    }

    /**
     * Test of concatWords method, of class Utils.
     */
    @Test
        public void testHelloWorld() {
    System.out.println("* UtilsJUnit3Test: test method 1 - testHelloWorld()");
    assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
        
    }

    

    /**
     * Test of normalizeWord method, of class Utils.
     */
    @Test
   public void testTemporarilyDisabled() throws Exception { System.out.println(" UtilsJUnit3Test: test method 4 - checkExpectedException()"); assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308")); }
   
   
   
   public void testWithTimeout() throws InterruptedException, TimeoutException {
    System.out.println("* UtilsJUnit3Test: test method 2 - testWithTimeout()");
    final int factorialOf = 1 + (int) (30000 * Math.random());
    System.out.println("computing " + factorialOf + '!');
 Thread testThread = new Thread() {
        public void run() {
            System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
        }
    };

    testThread.start();
    Thread.sleep(1000);
    testThread.interrupt();

    if (testThread.isInterrupted()) {
        throw new TimeoutException("the test took too long to complete");
    }
}
public void testExpectedException() {
    System.out.println("* UtilsJUnit3Test: test method 3 - testExpectedException()");
    try { final int factorialOf = -5; System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf)); fail("IllegalArgumentException was expected"); } catch (IllegalArgumentException ex) { } }

}

