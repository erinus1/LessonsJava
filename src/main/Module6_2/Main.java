package Module6_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Decode str = new Decode();

        System.out.println("To Input: ");
        String resultSt = sc.nextLine();
        System.out.println("DeCompressed to " + str.decompress(resultSt));

    }
}
