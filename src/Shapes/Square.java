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

}
