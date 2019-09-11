package Module6_1;

public class CompressorStr {

    public String compress(String toArray) {

        StringBuilder stringBuilder = new StringBuilder();
        int[] numb = {0, 2, 1, 3, 4, 5, 6, 7, 8, 9};
        //boolean isNumbers = false;

        for(int i = 0; i < toArray.length(); i++) {
            int count = 1;
            while (i < (toArray.length() - 1) && toArray.charAt(i) == toArray.charAt(i +1)){
                count++;
                i++;
            }
            for(int b = 0; b < numb.length; b++)
                //while (toArray.length() == numb.length)
            if(numb[b] == numb.length){
                stringBuilder.append("/");
            }

            stringBuilder.append(count);
            stringBuilder.append(toArray.charAt(i));
        }
        return stringBuilder.toString();
    }


}
