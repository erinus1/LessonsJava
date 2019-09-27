package Module6_1;

public class CompressorStr {

    char searchChar = '\\';
    boolean isFound = false;

    public String compress(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        outerloop:
        for (int i = 0; i < string.length(); i++) {
            int count = 1;
            if (string.charAt(i) == searchChar) { //do not count slash -WRONG
                continue; }
            while (i < (string.length() - 1) && string.charAt(i) == string.charAt(i + 1)) {
                count++;
                i++;

            }
                stringBuilder.append(count).append(string.charAt(i));

            if (Character.isDigit(string.charAt(i)) || string.charAt(i) == searchChar) {
                stringBuilder.insert(stringBuilder.length() - 1, '\\');
                }
            }
        return stringBuilder.toString();
    }
}





