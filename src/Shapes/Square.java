package Shapes;

public class Square extends Quadrilateral {
       public Square(double side){
           super(side, side);
       }

    public double getPerimeter() {
        return 4 * super.length;
    }

    public double getArea () {
        return Math.pow(super.length, 2);
    }

    public void setLength(double length) {
        this.length = length;
        this.width = width;
    }

    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }
}
