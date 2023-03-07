package JOOP._11Polymorphism._04_WildFaromFood;

public abstract class Animal{
    private String name;
    private String type;
    private Double weight;
    private Integer foodEaten;

    public Animal(String name, double weight) {

        this.name=name;
        this.weight=weight;

        //TODO: foodeaten = ??
    }

    public abstract void makeSound();
    public abstract void eat(Food food);
}
