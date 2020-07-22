/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.pieces;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author hp
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({chess.pieces.ChessmanTest.class, chess.pieces.KingTest.class, chess.pieces.QueenTest.class, chess.pieces.RookTest.class, chess.pieces.PawnTest.class, chess.pieces.KnightTest.class, chess.pieces.BishopTest.class})
public class PiecesSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
