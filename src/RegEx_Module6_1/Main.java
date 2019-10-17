package RegEx_Module6_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an email 1-30 (letters with special symbols:) ");
        //String email = scanner.nextLine();

        String patternEmail = "([a-zA-Z0-9]){1,30} [@]{1} ([a-z]){1,6}[\\.]([a-z]{2,5})";

        Pattern res = Pattern.compile(patternEmail);
        Matcher m = res.matcher("alex99");
        boolean result = m.matches();
        System.out.println("Email is valid: " + result);
    }

}
