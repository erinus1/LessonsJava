package Module6_1;

public class CompressorStr {

    char searchChar = '/';

    public String compress(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        outerloop:
        for (int i = 0; i < string.length(); i++) {
            int count = 1;
            while (i < (string.length() - 1) && string.charAt(i) == string.charAt(i + 1)) {
                count++;
                i++;
            }
            if (string.length() - 1 == searchChar) //do not count slash
                continue;
        //stringBuilder
            stringBuilder.append(count).append(string.charAt(i));
    }
        for (int f = stringBuilder.length() - 1; f >= 0; f--) {
            if (Character.isDigit(stringBuilder.charAt(f--))) {
                stringBuilder.insert((stringBuilder.length() - 1), "/"); //add slash if is degit in the row
            }
            if (stringBuilder.length() - 1 == searchChar) {
                stringBuilder = stringBuilder.append("/");
            }
        }
        return stringBuilder.toString();
    }
}
        //System.out.println(stringBuilder.charAt(i));






