package Module4_1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Area {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double length;
        double breadth;

        try {

            System.out.println("Enter rectangle's length: ");
            length = in.nextDouble();

            if (length < 0) {
                throw new Exception("Length must not be a negative one");
            }

            System.out.println("Enter rectangle's breadth: ");
            breadth = in.nextDouble();

            if (breadth < 0) {
                throw new Exception("Breadth must not be a negative one");
            }

        Spesific rectangle = new Spesific();
        System.out.println("Rectangle is " + rectangle.rectangleArea(length, breadth));


        System.out.println("Enter squeare's side: ");
        double side = in.nextDouble();


        Spesific squeare = new Spesific();
        System.out.println("Squeare is " + squeare.squeareArea(side));


        System.out.println("Enter radius: ");
        double radius = in.nextDouble();

        Spesific circle = new Spesific();
        System.out.println("circle is" + circle.circleArea(radius));

        } catch (InputMismatchException e) {
            System.out.println("Not legal symbols");
            return;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        finally {
            System.out.println("The end.");
        }

    }
}