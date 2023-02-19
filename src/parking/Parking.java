package parking;
import java.util.ArrayList;


public class Parking {
    private ArrayList<Car> data;
    private String type;
    private int capacity;

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCount() {
        return this.data.size();
    }

    public Parking(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public Car getCar(String manufacturer, String model) {
        for (Car car : this.data){
            if(car.getManufacturer().equals(manufacturer) && car.getModel().equals(model)) {
                return car;
            }
        }
        return null;
    }

    public Car getLatestCar() {
        if (this.getCount()==0){
            return null;
        }

        Car newest = this.data.get(0);
        for (int i = 1; i < this.data.size(); i++) {
            if (this.data.get(i).getYear() > newest.getYear()) {
                newest = this.data.get(i);
            }
        }
        return newest;

    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The cars are parked in: %s%n", this.getType()));
        this.data.forEach(s -> sb.append(s.toString()).append(System.lineSeparator()));
        return sb.toString();
    }


    public boolean remove(String manufacturer, String model){
        for (Car car: this.data){
            if (car.getManufacturer().equals(manufacturer) && car.getModel().equals(model)){
                this.data.remove(car);
                return true;
            }
        }

        return false;
    }

    public void add(Car car) {
        if(this.getCount() >= this.getCapacity()) {
            return;
        }
        this.data.add(car);
    }


}
