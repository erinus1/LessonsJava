package Module4_1;


    public class Area extends Shape {
        @Override
        public  double rectangleArea(double length, double breadth) {

            return (length * breadth);
        }


        @Override
        public double squareArea(double side) {

            return Math.pow(side, 2);
        }

        @Override
        public double circleArea(double radius) {

            double area = Math.pow(radius, 2) * Math.PI;

            return area;
        }
    }

