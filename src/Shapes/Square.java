package Shapes;

public class Square extends Rectangle {
       public Square(double side){
           super.length = side;
           super.width = side;
       }

    public double getPerimeter() {
        return 4 * super.length;
    }

    public double getArea () {
        return Math.pow(super.length, 2);
    }

}
