package RegEx_Module6_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an email 1-30 (letters with special symbols:) ");
        //String email = scanner.nextLine();

        String patternEmail = "([a-zA-Z0-9]){1,30}@{1} ([a-z]){1,6}\\.([a-z]{2,5})";

        Pattern res = Pattern.compile(patternEmail);
        Matcher m = res.matcher("alex27@yandex.com");
        boolean result = m.matches();
        System.out.println("Email is valid: " + result);

        System.out.println("Enter an url: ");
        //String url = scanner.nextLine();

        String patterUrl = "(^(http|https|ftp):\\.([a-z 0-9]){1,10})";
        Pattern res1 = Pattern.compile(patterUrl);
        Matcher url = res.matcher("https://rubular.com");
        boolean result1 = m.matches();
        System.out.println("url is valid: " + result1);

        String patternIp = "[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}.[0-9]{1,3}";
        Pattern res3 = Pattern.compile(patternIp);
        Matcher ip = res.matcher("192.168.410.144");
        boolean result3 = m.matches();
        System.out.println("IP is valid: " + result3);


    }

}
