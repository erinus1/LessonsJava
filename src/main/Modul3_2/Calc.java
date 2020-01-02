package main.Modul3_2;//module 2 task 2

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
    public static void main(String [] args){

        Accounting rate = new Accounting();
        Scanner in = new Scanner(System.in);

        try{
            System.out.println("Enter work hours: ");
            int workHours = in.nextInt();

            System.out.println("Enter paid hours: ");
            int paidHours = in.nextInt();

            System.out.println(rate.pay(workHours, paidHours));
        } catch (InputMismatchException a){
            System.out.println("Error. Enter number");
        }
    }
}
