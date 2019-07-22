package Modul_2;

public class Modul2Task2 {

        public static void main(String[] args) {
            double a = 1;
            double b = 0;
            double c = -2;

            double d = b * b - 4 * a * c;

            double x1 = (-b - Math.sqrt(1.0 * d)) / (2 * a);
            double x2 = (-b + Math.sqrt(1.0 * d)) / (2 * a);

            String result = "no solution";

            if (d == 0){
                result = "One root:" + x1;
            }

            else if (d > 0){
                result = "two roots: " +x1 + " and " + x2;
            }

            System.out.print(result);



            }
        }






