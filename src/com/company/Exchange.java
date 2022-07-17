package com.company;

public class Exchange {

    //Two variables, a and b, have been initialised here for you.
    // You must write a code to exchange the values of a and b.
    //Output a = 1 b = 2

    public static void main(String[] args) {
	// write your code here
        int a = 2;
        int b = 1;
        int c = a ;
         a = b;
         b = c;

        System.out.printf("a" + a);
        System.out.printf("b" + b);
    }
}
