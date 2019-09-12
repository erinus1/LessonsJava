package Module6_1;

public class CompressorStr {
    StringBuilder stringBuilder = new StringBuilder();
    String[] numb = {"0", "2", "1", "3", "4", "5", "6", "7", "8", "9"};
    //char searchChar = '/';

    public String compress(String string) {

        for (int i = 0; i < string.length(); i++) {
            int count = 1;
            while (i < (string.length() - 1) && string.charAt(i) == string.charAt(i + 1)) {
                count++;
                i++;
            }
            stringBuilder = stringBuilder.append(count).append(string.charAt(i));
        }
        stringBuilder.
        return stringBuilder.toString();
    }
}




