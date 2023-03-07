package JOOP._11Polymorphism._02_Shapes_Abstract;

public class Main {
    public static void main(String[] args) {
        Shape ciricle = new Circle(10);
        Shape rectangle = new Rectangle(3,4);


        System.out.println(ciricle.getArea());
        System.out.println(ciricle.getPerimeter());

        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getPerimeter());



    }
}
