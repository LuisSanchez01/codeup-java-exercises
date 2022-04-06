package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
//       Rectangle box1 = new Rectangle( 4,  5);
//            System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
//        }

        Measurable myShape;

        Square square = new Square(4);
        myShape = square;

        System.out.println("Square Area" + myShape.getArea());
        System.out.println("Square Perimeter" + myShape.getPerimeter());

        Rectangle rectangle = new Rectangle(3, 5);
        myShape = rectangle;

        System.out.println("Rectangle Area" + myShape.getArea());
        System.out.println("Rectangle Perimeter" + myShape.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());


    }
}


