
package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testFound() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("abccdde","hhgghjkl"));
      assertTrue(new App().search(array, 2,'d'));
    }

    public void testNotFound() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("abccdde","hhgghjkl"));
      assertFalse(new App().search(array, 5,'d'));
    }

    public void testEmptyArray() {
      ArrayList<String> array = new ArrayList<>();
      assertFalse(new App().search(array, 2,'d'));
    }

    public void testNull() {
      assertFalse(new App().search(null, 2,'d'));
    }

    public void testZero(){
      ArrayList<String> array = new ArrayList<>();
      assertFalse(new App().search(array, 0,'d'));
    }

}
