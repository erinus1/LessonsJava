package main.java.MavenTask2;

import java.util.ArrayList;

public class Equation {

    public Equation() {
    }

    public static void main(String[] args) {
    }

    public ArrayList<Double> calculate(double a, double b, double c) {

        double d = b * b - 4 * a * c;

        double x1 = (-b - Math.sqrt(1.0 * d)) / (2 * a);
        double x2 = (-b + Math.sqrt(1.0 * d)) / (2 * a);

        ArrayList<Double> result = new ArrayList<>();

        result.add(x1);

        if (d > 0) {
            result.add(x2);
        }

        return result;
    }
}

