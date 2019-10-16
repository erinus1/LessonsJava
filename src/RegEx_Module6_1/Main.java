package RegEx_Module6_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an email: ");
        String email = scanner.nextLine();

        String pattern = "";

        Pattern res = Pattern.compile(pattern);
        Matcher m = res.matcher(email);

    }

}
