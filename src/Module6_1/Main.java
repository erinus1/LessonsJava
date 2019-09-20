package Module6_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CompressorStr str = new CompressorStr();

        System.out.println("Input: ");
        //String resultSt = sc.nextLine();
        //System.out.println("Compressed to " + str.compress(resultSt));
        System.out.println("Compressed to " + str.compress("ABf/45/")); //1A3a2B\2
    }
  }

