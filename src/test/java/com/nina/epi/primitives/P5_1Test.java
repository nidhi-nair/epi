package com.nina.epi.primitives;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


/**
 * Unit test for simple App.
 */
public class P5_1Test {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCheckParityForZero() {
        assertTrue(P5_1.checkParity(0) == 0);
        assertTrue(P5_1.checkParity(3) == 0);
        assertTrue(P5_1.checkParity(63) == 0);
        assertTrue(P5_1.checkParity(5) == 0);
    }
}
