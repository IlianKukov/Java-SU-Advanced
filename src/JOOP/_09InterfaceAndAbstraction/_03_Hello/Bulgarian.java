package JOOP._09InterfaceAndAbstraction._03_Hello;

public class Bulgarian implements Person {
    private String name;

    public Bulgarian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String sayHello() {
        return "Здравей!";
    }
}
