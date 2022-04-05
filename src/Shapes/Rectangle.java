package Shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(){}

    public Rectangle(double length, double width) {
        this. width = width;
        this.length = length;
    };

        public double getPerimeter() {
           return (2 * this.length) + (2 * this.width);
        }

        public double getArea () {
            return this.length * this.width;
        }


}
