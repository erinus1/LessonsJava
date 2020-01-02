package main.RegEx_Module6_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

    public static void main(String[] args) {

        String patternEmail = "(\\w[^%#!&]{1,30})@{1}(\\w){1,6}\\.(\\w){2,5}";
        Pattern res = Pattern.compile(patternEmail);
        Matcher em = res.matcher("affff2@yandex.com");
        boolean result = em.matches();
        System.out.println("Email is valid: " + result);

        String patterUrl = "(http(s)|ftp)?(ftp)?:\\D*\\d*\\D*.*";
        Pattern res1 = Pattern.compile(patterUrl);
        Matcher url = res1.matcher("https://uiregex.com/ru?match=sd_32f@com.ua&exact=%20&blocked=");
        boolean result1 = url.matches();
        System.out.println("URL is valid: " + result1);

        String patternIp = "[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}.[0-9]{1,3}";
        Pattern res3 = Pattern.compile(patternIp);
        Matcher ip = res3.matcher("192.168.41.4");
        boolean result3 = ip.matches();
        System.out.println("IP is valid: " + result3);

    }
}

