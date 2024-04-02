package btIshape;

public class Circle implements IShape{
    double radius;

    public Circle(double radsius) {
        this.radius = radsius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius *this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
}