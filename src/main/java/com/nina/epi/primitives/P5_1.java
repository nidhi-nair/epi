package com.nina.epi.primitives;

import java.util.*;

public class P5_1 {

    public static short checkParity(long x) {
        short result = 0;
        while(x != 0) {
            result ^= 1;
            x = x & (x-1);
        }
        return result;
    }
}