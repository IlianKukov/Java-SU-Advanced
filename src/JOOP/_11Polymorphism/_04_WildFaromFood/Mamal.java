package JOOP._11Polymorphism._04_WildFaromFood;

public abstract class Mamal extends Animal{
private String livingRegion;

public Mamal(String name, double weight, String region){
    super(name,weight);
    this.livingRegion = region;
}

}
