package Module6_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CompressorStr str = new CompressorStr();

        System.out.println("Input: ");
        //String resultSt = sc.nextLine();
        //System.out.println("Compressed to " + str.compress(resultSt));
        System.out.println("Compressed to " + str.compress("E\\5"));

        //input: 52llk\\ >> Exception in thread "main" java.lang.NumberFormatException: For input string: "\"
    }
  }

