package com.getsmarter;

public class productArrayTwo {
    public int[] answer(int[] n){
        /* Brute Force */
        int[] arr = new int[n.length];
        int div = 1; int k = 0;

        for(int nums : n){
            div *= nums;
        }

        for(int i : n){
            arr[k] = div/i;
            k++;
        }
        return arr;
        /* Challenge no division*/

        //return arr;
    }
}
