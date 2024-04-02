package btIshape;

public class Rectangle implements   IShape {
    private double length;
    private double width;

    public  Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override  public double getArea(){
        return this.length * this.width;

    }
    @Override public double getPerimeter(){
        return 2 *(this.length + this.width);

    }
}
