package JOOP._11Polymorphism._03_Animals;

public class Dog extends Animal{
    public Dog(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String explainSelf(){
        return String.format("%s\nDJAFF",super.explainSelf());
    }
}
