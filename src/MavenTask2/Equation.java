package MavenTask2;

public class Equation {

    Equation() {
    }

    public double calculate(double a, double b, double c) {

        double d = b * b - 4 * a * c;

        double x1 = (-b - Math.sqrt(1.0 * d)) / (2 * a);
        double x2 = (-b + Math.sqrt(1.0 * d)) / (2 * a);

            if (d == 0) {
                System.out.println("One root" + x1); //x1
            } else if (d > 0) {
                System.out.println("Two roots" + x1 + ", " + x2); //x1 + x2
            }
            return d;
        }
    }

