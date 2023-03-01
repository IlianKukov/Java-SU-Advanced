package JAdvanced._23ExamPreps._28June2020.parking;

public class Car {
    private String manufacturer;
    private String model;
    private int year;

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }



//    public void setManufacturer(String manufacturer) {
//        this.manufacturer = manufacturer;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }

    public Car(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }


    @Override
    public String toString() {
        return String.format("%s %s (%s)", this.manufacturer, this.model, this.year);
    }



}
