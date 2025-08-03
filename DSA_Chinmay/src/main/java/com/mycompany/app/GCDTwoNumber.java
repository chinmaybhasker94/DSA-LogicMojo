package com.mycompany.app;

/***
 *     GCD of two numbers
***/

 public class GCDTwoNumber {

    public static void main( String[] args )
    {
        int a = 36; int b = 18;
        Integer res =  gcd(a,b);
        System.out.println("GCD of two number => "+res);

    }

    public static Integer gcd(int a, int b){
        int on1 = a;
        int on2 = b;
        while (b != 0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }
}
