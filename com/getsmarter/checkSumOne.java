package com.getsmarter;

import java.util.HashSet;
import java.util.Set;

public class checkSumOne {
    public boolean isTrue(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(n-i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
