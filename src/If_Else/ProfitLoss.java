package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SP: ");
        int sp = sc.nextInt();
        System.out.print("Enter CP: ");
        int cp = sc.nextInt();

//        if(sp>cp)
//            System.out.println("Profit"+(sp-cp));
//        if(cp>sp)
//            System.out.println("Loss"+(cp-sp));
//        if(sp == cp)
//            System.out.println("No Profit No Loss");
        if(sp>cp)

            System.out.println("Profit"+(sp-cp));
        else if(cp>sp)
            System.out.println("Loss"+(cp-sp));
        else
            System.out.println("No Profit No Loss");


    }

}
