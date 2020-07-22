/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.pieces;

import chess.Position;
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
public class ChessmanTest {
    
    public ChessmanTest() {
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
     * Test of loadImage method, of class Chessman.
     */
    @Test
    public void testLoadImage() {
        System.out.println("loadImage");
        Chessman instance = new ChessmanImpl();
        instance.loadImage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetMoves method, of class Chessman.
     */
    @Test
    public void testGetMoves() {
        System.out.println("GetMoves");
        Chessman[][] board = null;
        Chessman instance = new ChessmanImpl();
        ArrayList<Position> expResult = null;
        ArrayList<Position> result = instance.GetMoves(board);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ChessmanImpl extends Chessman {

        public void loadImage() {
        }

        public ArrayList<Position> GetMoves(Chessman[][] board) {
            return null;
        }
    }
    
}
