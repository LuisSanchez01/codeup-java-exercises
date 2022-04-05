package Shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;



    public Quadrilateral(double length, double width) {
        this. width = width;
        this.length = length;
    };

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
