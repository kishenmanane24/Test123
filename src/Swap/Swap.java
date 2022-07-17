package Swap;

import java.util.Scanner;

 class Swap {
    public static void main(String[] args) {
        int a , b ;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a > b) {
            int temp = a ;
            a = b;
            b = temp;
        }
        System.out.println(a);
        System.out.printf(String.valueOf(b));

    }
}
