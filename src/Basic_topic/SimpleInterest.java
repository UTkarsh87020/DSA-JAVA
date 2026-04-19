package Basic_topic;


import java.util.Scanner;

public class SimpleInterest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value p: ");
        double p = sc.nextDouble();
        System.out.println("Enter the value r: ");
        double r = sc.nextDouble();
        System.out.println("Enter the value t: ");
        double t = sc.nextDouble();
        double SI = p*r*t/100;
        System.out.println(SI);

    }
}
