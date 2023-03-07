package JOOP._11Polymorphism._02_Shapes_Abstract;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected void calculateArea() {
        setArea(Math.PI*radius*radius);
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(2*Math.PI*radius);
    }
}
