package JOOP._11Polymorphism._04_WildFaromFood;

public class Tiger extends Feline{
    private String livingRegion;



    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {

    }
}
