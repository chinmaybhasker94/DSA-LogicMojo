package com.mycompany.app;

/***
 *     LCM of given array elements
 ***/


public class LCMOFArray {

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to return LCM of two numbers
    private static long lcm(long a, int b) {
        return (a * b) / gcd((int) a, b);
    }

    public static void main( String[] args ){
        Integer[] arr = {1 , 2 , 10 , 3};
        int n = arr.length;
        long result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = lcm(result, arr[i]);
            // Early exit if result exceeds limit (optional safety)
            if (result > Long.MAX_VALUE / arr[i]) {
                throw new ArithmeticException("Overflow in LCM computation");
            }
        }
        System.out.println(result);
    }

}
