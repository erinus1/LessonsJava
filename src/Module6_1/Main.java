package Module6_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CompressorStr str = new CompressorStr();

        System.out.println("To Input: ");
        String resultSt = sc.nextLine();
        System.out.println("Compressed to " + str.compress(resultSt));

    }
  }

