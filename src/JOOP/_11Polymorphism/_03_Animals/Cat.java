package JOOP._11Polymorphism._03_Animals;

public class Cat extends Animal{
    public Cat(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String explainSelf(){
        return super.explainSelf() + "\nMEOW";
    }
}
