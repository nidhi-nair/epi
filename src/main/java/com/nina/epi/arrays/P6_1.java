package com.nina.epi.arrays;

import java.util.List;

public class P6_1 {

    public static void dutchFlagPartition(int pivotIndex, List<Integer> A) {
        int pivot = A.get(pivotIndex);

        int lower = 0, upper = A.size()-1, fixed = 0;

        while(fixed<upper) {
            if(A.get(fixed) > pivot) {
                int temp = A.get(upper);
                A.set(upper, A.get(fixed));
                A.set(fixed, temp);
                upper--;
            } else if(A.get(fixed)==pivot) {
                fixed++;
            } else {
                int temp = A.get(fixed);
                A.set(fixed,A.get(lower));
                lower++;
                fixed++;
            }
        }
    }
}
