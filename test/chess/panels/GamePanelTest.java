/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.panels;

import chess.Position;
import chess.SideColor;
import chess.pieces.Chessman;
import java.awt.Graphics;
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
public class GamePanelTest {
    
    public GamePanelTest() {
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
     * Test of oponentTurn method, of class GamePanel.
     */
    @Test
    public void testOponentTurn() {
        System.out.println("oponentTurn");
        GamePanel instance = new GamePanelImpl();
        instance.oponentTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class GamePanel.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        GamePanel instance = new GamePanelImpl();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadImages method, of class GamePanel.
     */
    @Test
    public void testLoadImages() {
        System.out.println("loadImages");
        GamePanel instance = new GamePanelImpl();
        instance.loadImages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MouseListner method, of class GamePanel.
     */
    @Test
    public void testMouseListner() {
        System.out.println("MouseListner");
        GamePanel instance = new GamePanelImpl();
        instance.MouseListner();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkChessmanMove method, of class GamePanel.
     */
    @Test
    public void testCheckChessmanMove() {
        System.out.println("checkChessmanMove");
        Position newPosition = null;
        GamePanel instance = new GamePanelImpl();
        instance.checkChessmanMove(newPosition);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of castling method, of class GamePanel.
     */
    @Test
    public void testCastling() {
        System.out.println("castling");
        Position newPosition = null;
        Chessman piece = null;
        Chessman[][] board = null;
        GamePanel.castling(newPosition, piece, board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveChessman method, of class GamePanel.
     */
    @Test
    public void testMoveChessman() {
        System.out.println("moveChessman");
        Position newPosition = null;
        Position oldPosition = null;
        GamePanel instance = new GamePanelImpl();
        instance.moveChessman(newPosition, oldPosition);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllMoves method, of class GamePanel.
     */
    @Test
    public void testGetAllMoves() {
        System.out.println("getAllMoves");
        SideColor col = null;
        Chessman[][] board = null;
        ArrayList<Position> expResult = null;
        ArrayList<Position> result = GamePanel.getAllMoves(col, board);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSafeMoves method, of class GamePanel.
     */
    @Test
    public void testGetAllSafeMoves() {
        System.out.println("getAllSafeMoves");
        SideColor col = null;
        Chessman[][] board = null;
        GamePanel instance = new GamePanelImpl();
        ArrayList<Position> expResult = null;
        ArrayList<Position> result = instance.getAllSafeMoves(col, board);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findKing method, of class GamePanel.
     */
    @Test
    public void testFindKing() {
        System.out.println("findKing");
        Chessman[][] board = null;
        SideColor col = null;
        Position expResult = null;
        Position result = GamePanel.findKing(board, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of check method, of class GamePanel.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        Chessman[][] board = null;
        SideColor col = null;
        boolean expResult = false;
        boolean result = GamePanel.check(board, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preventCheck method, of class GamePanel.
     */
    @Test
    public void testPreventCheck() {
        System.out.println("preventCheck");
        ArrayList<Position> moves = null;
        Chessman[][] board = null;
        Chessman piece = null;
        ArrayList<Position> expResult = null;
        ArrayList<Position> result = GamePanel.preventCheck(moves, board, piece);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preventCheckCastling method, of class GamePanel.
     */
    @Test
    public void testPreventCheckCastling() {
        System.out.println("preventCheckCastling");
        Position p = null;
        Chessman[][] tempBoard = null;
        Chessman piece = null;
        boolean expResult = false;
        boolean result = GamePanel.preventCheckCastling(p, tempBoard, piece);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkmate method, of class GamePanel.
     */
    @Test
    public void testCheckmate() {
        System.out.println("checkmate");
        SideColor col = null;
        Chessman[][] board = null;
        GamePanel instance = new GamePanelImpl();
        instance.checkmate(col, board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkStalemate method, of class GamePanel.
     */
    @Test
    public void testCheckStalemate() {
        System.out.println("checkStalemate");
        SideColor col = null;
        Chessman[][] board = null;
        GamePanel instance = new GamePanelImpl();
        instance.checkStalemate(col, board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeFrame method, of class GamePanel.
     */
    @Test
    public void testCloseFrame() {
        System.out.println("closeFrame");
        GamePanel instance = new GamePanelImpl();
        instance.closeFrame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GamePanelImpl extends GamePanel {

        public void oponentTurn() {
        }
    }
    
}
