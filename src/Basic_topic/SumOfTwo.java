package Basic_topic;

import java.util.Scanner;

public class SumOfTwo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int x2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int x3 = sc.nextInt();

        System.out.print("Sum of number is: ");
        System.out.println(x1 + x2 + x3);

    }
}
