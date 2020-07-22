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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author hp
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({chess.GameFrameTest.class, chess.SideColorTest.class, chess.MenuTest.class, chess.MoveTest.class, chess.panels.PanelsSuite.class, chess.MainTest.class, chess.AITest.class, chess.pieces.PiecesSuite.class, chess.PositionTest.class})
public class ChessSuite {

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
