package main.Module6_2;

public class Decode {

    char searchChar = '\\';

    public String decompress(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        // "3" => "3"
        // "3h" => "hhh"
        // "3h\22b" => "hhh\2bb"

        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                if ((i + 1) >= string.length()) {
                    stringBuilder.append(string.charAt(i));
                } else if (!Character.isDigit(string.charAt(i + 1))) {
                    int count = Character.getNumericValue(string.charAt(i));
                    char symb = string.charAt(i + 1);

                    while (count > 0) {
                        stringBuilder.append(symb);
                        count--;
                    }
                    i++;
                } else {
                    stringBuilder.append(string.charAt(i));
                }
            } else if (string.charAt(i) == searchChar) {
                stringBuilder.append(string.charAt(i));
            }
        }
            return stringBuilder.toString();
        }

}

