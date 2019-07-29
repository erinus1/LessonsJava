package src.Modul_2;

import java.util.Arrays;

public class Modul2Task7 {

    public static void main(String[] args) {

        int[] numbers = {5, 9, 3, 4, 1, 10, 7, 2, 8, 6};

        boolean isSort = true; //обход, были перестановки элементов за 1 цикл ?

        while (isSort) {
            isSort = false;

            for (int i = 0; i < (numbers.length - 1); i++) {

                if (numbers[i] > numbers[i + 1]) {
                    isSort = true;

                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));


        while (isSort) {
            isSort = false;

            for (int i = 0; i < (numbers.length - 1); i++) {

                if (numbers[i + 1] > numbers[i]) {
                    isSort = true;

                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));

    }
}



