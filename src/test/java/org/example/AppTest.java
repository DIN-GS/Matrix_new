package org.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testTransponyvanya() {
        int[][] mas = {{1, 2, 3}, {4,5,6}};
        int[][] mas2 = App.transponyvanya(mas);
        int[][] mas3 = {{1,4},{2,5},{3,6}};
        assertArrayEquals(mas3, mas2);
    }
}
