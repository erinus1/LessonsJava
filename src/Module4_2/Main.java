package Module4_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        CreditAcc credit = new CreditAcc();


        System.out.println("Please enter your amount : ");

        int newAmount = sca.nextInt();

        credit.addMoney(newAmount);
        credit.printBalance();

        System.out.println("Enter your amount for withdrow: " );

        int toWithdraw = sca.nextInt();

        credit.withDraw(toWithdraw);
        credit.printBalance();






    }
}
