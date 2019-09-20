package Module5_1;
public class Main {

    public static void main(String[] args) {
        Point a = new Point(0,7);
        Point b = new Point(0,5);
        Point c = new Point(0,3);

        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Area of triangle is " + triangle.calculateArea());

        try {
            if (triangle.area <= 0) throw new InvalidAreaException();
        }
        catch (InvalidAreaException exc){
            System.out.println("Catch an exeption: InvalidAreaException");
        }
    }
}
