package Module5_1;

public class Triangle{
    double area;

    public double calculate(double a, double b, double c) {
        double halfArea = (a + b + c) / 2;
        double geron = halfArea * ((halfArea - a) + (halfArea - b) + (halfArea - c));
        return area = Math.sqrt(geron);
    }
    }





