package Module6_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CompressorStr str = new CompressorStr();

        System.out.println("Enter your string: ");
        String resultSt = sc.nextLine();
        char[]toArray = resultSt.toCharArray(); //convert to array
        System.out.println(toArray);
        //System.out.println("Compressed to " + str.compress(toArray);

    }
  }

