package Module6_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CompressorStr str = new CompressorStr();

        System.out.println("Enter your string: ");
        String string = sc.nextLine();

        System.out.print("Compression " + str.compress(string));

    }
  }

