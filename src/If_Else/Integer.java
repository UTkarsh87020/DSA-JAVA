package If_Else;

import java.util.Scanner;

public class Integer {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        double n = sc.nextDouble();
        int x = (int)n;
        if(n-x == 0)
            System.out.println("It is integer");
        else
            System.out.println("Not a integer");
    }
}
