/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import chess.pieces.Chessman;
import java.util.ArrayList;
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
public class AITest {
    
    public AITest() {
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
     * Test of minMax method, of class AI.
     */
    @Test
    public void testMinMax() {
        System.out.println("minMax");
        Chessman[][] board = null;
        SideColor col = null;
        int alpha = 0;
        int beta = 0;
        Move expResult = null;
        Move result = AI.minMax(board, col, alpha, beta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of min method, of class AI.
     */
    @Test
    public void testMin() {
        System.out.println("min");
        int depth = 0;
        SideColor col = null;
        Chessman[][] board = null;
        int alpha = 0;
        int beta = 0;
        int expResult = 0;
        int result = AI.min(depth, col, board, alpha, beta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of max method, of class AI.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        int depth = 0;
        SideColor col = null;
        Chessman[][] board = null;
        int alpha = 0;
        int beta = 0;
        int expResult = 0;
        int result = AI.max(depth, col, board, alpha, beta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class AI.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        Chessman[][] board = null;
        Position newPosition = null;
        int expResult = 0;
        int result = AI.getScore(board, newPosition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveChessmanAI method, of class AI.
     */
    @Test
    public void testMoveChessmanAI() {
        System.out.println("moveChessmanAI");
        Position newPosition = null;
        Position oldPosition = null;
        Chessman[][] board = null;
        AI.moveChessmanAI(newPosition, oldPosition, board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAIMoves method, of class AI.
     */
    @Test
    public void testGetAIMoves() {
        System.out.println("getAIMoves");
        SideColor col = null;
        Chessman[][] board = null;
        ArrayList<Move> expResult = null;
        ArrayList<Move> result = AI.getAIMoves(col, board);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
