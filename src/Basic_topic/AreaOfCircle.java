package Basic_topic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaOfCircle {
    static void main(String[] args) {
        // area kya hota ? pi*r*r
       // int r = 5;
       // System.out.println(3.14*r*r); // value lo presize liya gya h
        Scanner sc = new Scanner(System.in); // input lene ke liye
        System.out.println("Enter Radius: ");
        double r = sc.nextDouble();
        double a = 3.14*r*r;
        System.out.println("Area is: ");
        System.out.println(a);
    }
}
