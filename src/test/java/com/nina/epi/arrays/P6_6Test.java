package com.nina.epi.primitives;

import com.nina.epi.arrays.P6_6;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;


/**
 * Unit test for simple App.
 */
public class P6_6Test {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMaxProfit() {
        assertTrue(P6_6.maxProfit(Arrays.asList(310, 315, 275, 295, 260, 270, 290, 230, 255, 250)) == 30);
    }
}
