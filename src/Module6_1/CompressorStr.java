package Module6_1;

public class CompressorStr {

    char searchChar = '\\';
    boolean isFound = false;

    public String compress(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i)) || string.charAt(i) == searchChar) {
                stringBuilder.insert(stringBuilder.length(), '\\');
            } else {
                int count = 1;

                while (i < (string.length() - 1) && string.charAt(i) == string.charAt(i + 1)) {
                    count++;
                    i++;

                }
                stringBuilder.append(count);
            }

            stringBuilder.append(string.charAt(i));
        }

        return stringBuilder.toString();
    }
}





