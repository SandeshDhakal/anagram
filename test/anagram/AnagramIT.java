/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author suman
 */
public class AnagramIT {
    
    public AnagramIT() {
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
     * Test of main method, of class Anagram.
     */
    

    /**
     * Test of sorting method, of class Anagram.
     */
    @Test
    public void testString() {
        System.out.println("Testing normal String");
        String[] str = {"hello","ho"};
        String[] expResult = {"ehllo","ho"};
        String[] result = Anagram.sorting(str);
        assertArrayEquals(expResult, result);
        
    }
     /**
     * Test of sorting method, of class Anagram.
     */
    
     @Test
    public void testWhitespace() {
        System.out.println("Testing Whitespace");
        String[] str = {"hel lo","ho"};
        String[] expResult = {" ehllo","ho"};
        String[] result = Anagram.sorting(str);
        assertArrayEquals(expResult, result);
        
    }
@Test
    public void testIntegerAndCharacter() {
        System.out.println("Testing Integer And Character");
        String[] str = {"hel5lo","ho"};
        String[] expResult = {"5ehllo","ho"};
        String[] result = Anagram.sorting(str);
        assertArrayEquals(expResult, result);
        
    }
   
    
}
