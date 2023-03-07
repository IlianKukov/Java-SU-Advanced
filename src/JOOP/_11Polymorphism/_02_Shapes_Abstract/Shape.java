package JOOP._11Polymorphism._02_Shapes_Abstract;

public abstract class Shape {
    private double perimeter;
    private double area;

    protected void setArea(double area) {
        this.area = area;
    }

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    protected abstract void calculateArea();
    protected abstract void calculatePerimeter();
}
