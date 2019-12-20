package Module5_1;

public class Triangle {
    double area;

    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateArea() {
        area = Math.abs((a.x-c.x)*(b.y-c.y)-(b.x-c.x)*(a.y-c.y)) / 2;
        return area;
    }
}