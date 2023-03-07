package JOOP._11Polymorphism._04_WildFaromFood;

public class Cat extends Feline{
    private String breed;

    public Cat(String name, double weight, String region, String breed) {
        super(name, weight, region);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("MEOW");
    }

    @Override
    public void eat(Food food) {

    }
}
