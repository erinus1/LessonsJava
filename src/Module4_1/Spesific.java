package Module4_1;


    public class Spesific extends Shape {
        @Override
        public double rectangleArea(double length, double breadth) {

            return (length * breadth);
        }


        @Override
        public double squeareArea(double side) {

            return (side * 4);
        }

        @Override
        public double circleArea(double radius) {

            double area = radius * radius * Math.PI;
            return area;
        }
    }

