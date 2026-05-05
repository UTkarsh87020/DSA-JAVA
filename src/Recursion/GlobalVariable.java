package Recursion;

import java.util.Scanner;

public class GlobalVariable {
    static int x = 10;
    static void main(String[] args) {
        fun();
        x = 9;
        System.out.println( );

    }

    public static void fun() {
       x =20;
        System.out.println(x);
    }


}

