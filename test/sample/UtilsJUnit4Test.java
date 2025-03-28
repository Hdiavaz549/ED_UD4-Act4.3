package sample;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import sample.Utils;
import org.junit.Ignore;

/**
 *
 * @author coleg
 */
public class UtilsJUnit4Test {
    
    public UtilsJUnit4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("*UtilsJUnit4Test: @BeforeClass method");
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("*UtilsJUnit4Test: @AfterClass method");
    }
    
    @Before
    public void setUp() {
        System.out.println("*UtilsJUnit4Test: @Before method");
    }
    
    @After
    public void tearDown() {
        System.out.println("*UtilsJUnit4Test: @After method");
    }

    @Test
    public void helloWorldCheck(){
       System.out.println("* UtilsJUnit4Test: test method 1 - helloWorldCheck()");
       assertEquals("Hello, world!", Utils.concatWords("Hello",",","world","!"));
    }

    @Test ( timeout = 1000 )
    public void testWithTimeout(){
        System.out.println("* UtilsJUnit4Test: test method 2 - testWithTimeout()");
        final int factorialOf = 1 + (int) (30000*Math.random());
        System.out.println("informática" + factorialOf + "!");
        System.out.println(factorialOf + "!=" + Utils.computeFactorial(factorialOf));
       
    }
    
    @Test (expected = IllegalArgumentException.class) 
    public void checkExpectedException() {
        System.out.println("* UtilsJUnit4Test: test method 3 - checkExpectedException()");
        final int factorialOf = - 5 ;
        System.out.println(factorialOf + "!=" + Utils.computeFactorial(factorialOf));
    }
    
    @Test
    public void temporalmenteDisabledTest() throws Exception {
        System.out.println("* UtilsJUnit4Test: test method 4 - checkExpectedException()" );
        assertEquals("Malm\u00f6", Utils.normalizeWord( "Malmö\u0308"));
}
    
}
