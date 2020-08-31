package com.nina.epi.primitives;

public class P5_2 {

    public static long swapBits(long x, int i, int j) {
        long result = 0;
        if((x>>>i & 1) != (x>>>j &1)) {
            long temp = 1L<<i | 1l<<j;
            result = x ^ temp;
        }
        return result;
    }
}
