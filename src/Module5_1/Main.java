package Module5_1;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println("Area of triangle is " + triangle.calculate(0,0,0));

        try {
            if (triangle.area == 0) throw new InvalidAreaException();
        }

        catch (InvalidAreaException exc){
            System.out.println("Catch an exeption: InvalidAreaException");
        }
    }
    private static class InvalidAreaException extends Throwable {
        public InvalidAreaException() {
        }
    }
}
