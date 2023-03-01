package JAdvanced._14DefiningclassesEX._03SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCars = Integer.parseInt(scanner.nextLine());
        Map<String,Car> carsWithNames = new LinkedHashMap<>();

        for (int i = 1; i <=countCars ; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String model = data[0];
            double fuelAmomunt = Double.parseDouble(data[1]);
            double fuelperkm =Double.parseDouble(data[2]);

            Car car = new Car(model,fuelAmomunt,fuelperkm);
            carsWithNames.put(model,car);

        }

        String command = scanner.nextLine();
        while (!command.equals("End")){
            String carModelToDrive = command.split("\\s+")[1];
            int kmToDrive = Integer.parseInt(command.split("\\s+")[2]);

            Car carToDrive = carsWithNames.get(carModelToDrive);

            if (!carToDrive.drive(kmToDrive)){
                System.out.println("Insufficient fuel for the drive");
            }

            command = scanner.nextLine();
        }


        for (Car currentCar: carsWithNames.values()){
            System.out.println(currentCar.toString());
        }

    }
}
