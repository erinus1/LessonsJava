package main.Modul_2;

public class Modul2Task4 {
    public static void main(String[] args) {

        int enterNum = 75;

        String numRow[] = {" ", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine", "ten", "eleven", "twelve", "thirteen"};

        String specificTens[] = {"twenty", "thirty", "four", "fifty"};

        String yourNum = " ";

        if (enterNum >= 14 || enterNum <= 19) {
            int teens = enterNum % 10;

            yourNum = " ";
            for (int i = 0; i < numRow.length; i++) {
                yourNum = numRow[teens];
            }
            System.out.println(yourNum + "teen ");
        }

        if (enterNum <= 20 || enterNum <= 99) {
            int hundr = ((enterNum / 10) + (enterNum % 10));

                System.out.println(hundr + " ");
            }
        }
    }