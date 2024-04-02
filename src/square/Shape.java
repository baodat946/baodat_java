package square;

public abstract class Shape {

    protected String color;
    protected boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
    public static void main (String []arg){
        Circle circle = new Circle(5.0, "red", true);
        Rectangle rectangle = new Rectangle(4.0, 6.0, "blue", false);
        Square square = new Square(3.0, "green", true);
        // In thông tin của các đối tượng Shape
        System.out.println("Hình tròn:");
        System.out.println(circle);
        System.out.println("Diện tích: " + circle.getArea());
        System.out.println("Chu vi: " + circle.getPerimeter());

        System.out.println("\nHình chữ nhật:");
        System.out.println(rectangle);
        System.out.println("Diện tích: " + rectangle.getArea());
        System.out.println("Chu vi: " + rectangle.getPerimeter());

        System.out.println("\nHình vuông:");
        System.out.println(square);
        System.out.println("Diện tích: " + square.getArea());
        System.out.println("Chu vi: " + square.getPerimeter());

        // Thay đổi màu sắc của các đối tượng Shape
        circle.setColor("yellow");
        rectangle.setColor("orange");
        square.setColor("purple");

        // In thông tin sau khi thay đổi màu sắc
        System.out.println("\nThông tin sau khi thay đổi màu sắc:");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}