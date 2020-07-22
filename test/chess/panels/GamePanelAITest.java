/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.panels;

import chess.SideColor;
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
public class GamePanelAITest {
    
    public GamePanelAITest() {
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
     * Test of oponentTurn method, of class GamePanelAI.
     */
    @Test
    public void testOponentTurn() {
        System.out.println("oponentTurn");
        GamePanelAI instance = new GamePanelAI();
        instance.oponentTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRandom method, of class GamePanelAI.
     */
    @Test
    public void testGetRandom() {
        System.out.println("getRandom");
        int[] array = null;
        int expResult = 0;
        int result = GamePanelAI.getRandom(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AI method, of class GamePanelAI.
     */
    @Test
    public void testAI() {
        System.out.println("AI");
        SideColor col = null;
        GamePanelAI instance = new GamePanelAI();
        instance.AI(col);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newAI method, of class GamePanelAI.
     */
    @Test
    public void testNewAI() {
        System.out.println("newAI");
        SideColor col = null;
        GamePanelAI instance = new GamePanelAI();
        instance.newAI(col);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
