/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class SideColorTest {
    
    public SideColorTest() {
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
     * Test of values method, of class SideColor.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        SideColor[] expResult = null;
        SideColor[] result = SideColor.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class SideColor.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        SideColor expResult = null;
        SideColor result = SideColor.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of swapColor method, of class SideColor.
     */
    @Test
    public void testSwapColor() {
        System.out.println("swapColor");
        SideColor instance = null;
        SideColor expResult = null;
        SideColor result = instance.swapColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBetterString method, of class SideColor.
     */
    @Test
    public void testGetBetterString() {
        System.out.println("getBetterString");
        SideColor instance = null;
        String expResult = "";
        String result = instance.getBetterString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
