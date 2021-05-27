package com.getsmarter;

public class Main {
    //Problem 001 variables
    //static int[] arr = new int[]{10, 15, 3, 7};
    //static int k = 17;

    //Problem 002 variables
    //static int[] TEST = new int[]{1,2,3,4,5};

    //Problem 007 variables
    //static String message = "783241";//2
    static String message = "38426221";//3

    public static void main(String[] args) {
	    // Problem 001
//        checkSumOne var = new checkSumOne();de
//        boolean x = var.isTrue(arr,k);
//        System.out.println(x);

        //Problem 002
        //productArrayTwo var = new productArrayTwo();
        //int[] arr = var.answer(TEST);
        //for (int i: arr) {System.out.print(i+"|"); }

        //Problem 007
        decodeMessageSeven var = new decodeMessageSeven();
        System.out.println(var.decode(message));
    }
}
