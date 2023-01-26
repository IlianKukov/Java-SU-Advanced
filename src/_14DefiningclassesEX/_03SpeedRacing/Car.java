package _14DefiningclassesEX._03SpeedRacing;

public class Car {

    //Characteristics
    private String model;
    private double fuelAmonut;
    private double fuelperkm;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelperkm) {
        //Constructor
        this.model = model;
        this.fuelAmonut = fuelAmount;
        this.fuelperkm = fuelperkm;
        this.distanceTraveled=0;


    }

    public boolean drive (int kmDrive){
        double requiredFuel = kmDrive* this.fuelperkm;
        if (requiredFuel<=this.fuelAmonut){
            this.fuelAmonut-=requiredFuel;
            distanceTraveled+=kmDrive;
            return true;
        }else {
            return false;
        }

    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d",this.model, this.fuelAmonut,this.distanceTraveled);
    }
}
