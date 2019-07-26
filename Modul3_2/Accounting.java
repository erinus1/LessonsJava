package Modul3_2;/*task 2 Write a class named Accounting which contains a method named pay.
The method should accept a number of working hours and a per hour payment.
It should return a calculated payment. For example pay(1.5, 10)
should return 15.Write another class with the main method which will test the Accounting class by calling the pay method */

public class Accounting {

    public int pay(int workHours, int paidHours) {
        int sum = workHours * paidHours;
        return sum;
    }
}