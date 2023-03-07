package JOOP._11Polymorphism._02_Shapes_Abstract;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    protected void calculateArea() {
        setArea(width*height);
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(2*(width*height));
    }
}
