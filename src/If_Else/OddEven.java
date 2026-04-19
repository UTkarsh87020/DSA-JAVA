package If_Else;

import java.util.Scanner;

public interface OddEven {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }


}
