package src.Modul_2;

import java.util.Arrays;

public class Modul2Task6 {

    public static void main(String[] args) {

        int[] data = {13, 147, 82, 82, 311};

        boolean isSorted = true;
        while (isSorted) {
            isSorted = false;

            for (int i = 0; i < (data.length - 1); i++) {
                if (data[i] > data[i + 1]) {
                    isSorted = true;
                    int temp = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(data));

        int a = data.length % 2;
        if (a == 0) {
            float median = (float) (data[data.length / 2] + data[(data.length / 2) - 1]) / 2; // (x [n/2] + x [(n/2) -1])/2
            System.out.println("Median of array is " + median);
        } else {
            int median = data[(data.length - 1) / 2];
            System.out.println("Median of array is " + median);
        }

        int sum = 0;

        for (int n = 0; n < data.length; n++) {
            sum += data[n];
        }
        float average = (float) sum / data.length;
        System.out.println("Average is " + average);

        //вычисляем моду

        int modaIs = 0;
        int maxCount = 0;

        for (int f = 0; f < data.length; ++f) {
            {
                int count = 0;
                for (int n = 0; n < data.length; ++n) {
                    if (data[n] == data[f])
                        ++count;

                    if (count > maxCount) {
                        maxCount = count;
                        modaIs = data[f];

                    }
                    }
                }
            }
        System.out.println("Moda is " + modaIs);
        }

    }






