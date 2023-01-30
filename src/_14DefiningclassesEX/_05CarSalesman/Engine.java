package _14DefiningclassesEX._05CarSalesman;

public class Engine {
    private String model;
    private int power;
    private int displacement;

    public String getModel() {
        return model;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public int getDisplacement() {
        return displacement;
    }

    public int getPower() {
        return power;
    }

    private String efficiency;

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }
}
