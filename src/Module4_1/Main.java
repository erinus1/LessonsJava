package Module4_1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {

            System.out.println("Enter rectangle's length: ");
            double length = in.nextDouble();

            if (length < 0) {
                throw new Exception("Length must not be a negative one");
            }

            System.out.println("Enter rectangle's breadth: ");
            double breadth = in.nextDouble();

            if (breadth < 0) {
                throw new Exception("Breadth must not be a negative one");
            }

            Area area = new Area();
            System.out.println("Rectangle is " + area.rectangleArea(length, breadth));


            System.out.println("Enter squeare's side: ");
            double side = in.nextDouble();


            System.out.println("Squeare is " + area.squeareArea(side));


            System.out.println("Enter circle's radius: ");
            double radius = in.nextDouble();

            System.out.println("circle is" + area.circleArea(radius));

        } catch (InputMismatchException e) {
            System.out.println("Not legal symbols");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("The end.");
        }

    }
}