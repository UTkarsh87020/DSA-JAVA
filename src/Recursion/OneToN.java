package Recursion;

import java.util.Scanner;

public class OneToN {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();

        print(n);

    }

    public static void print(int n) {
        if (n==0) return;
        print(n-1);
        System.out.println(n+" ");

    }
}