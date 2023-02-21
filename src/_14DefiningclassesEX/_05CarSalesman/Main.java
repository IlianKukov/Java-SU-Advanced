package _14DefiningclassesEX._05CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Engine> engines = new ArrayList<>();

        int engineCount = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=engineCount; i++) {
            String[] enginedata = scanner.nextLine().split("\\s+");
            //required
            String model=enginedata[0];
            int power=Integer.parseInt(enginedata[1]);
            //optional
            int displacement=0;
            String efficiency=null;

            if (enginedata.length==4){
                displacement=Integer.parseInt(enginedata[1]);
                efficiency=enginedata[2];
            } else if (enginedata.length==3) {

                if (Character.isDigit(enginedata[2].charAt(0))){
                    displacement=Integer.parseInt(enginedata[2]);
                }else {
                    efficiency=enginedata[2];
                }
            }

            Engine engine = new Engine(model, power, displacement, efficiency);
            engines.add(engine);
        }

        int carsCount = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=carsCount; i++) {
              String[] carData = scanner.nextLine().split("\\s+");
              //required
              String carModel=carData[0];
              String engineModel = carData[1];
              //optional
              int weight = 0;
              String color =null;

              if (carData.length==4){
                   weight = Integer.parseInt(carData[2]);
                   color = carData[3];
              }else if (carData.length==3){
                if (Character.isDigit(carData[2].charAt(0))){
                    weight = Integer.parseInt(carData[2]);
                }else {
                    color = carData[2];
                }

              }
        //Engine engine = new Engine(model, power, weight, color);
            Engine carEngine=null;
            for (Engine engine: engines){
                if (engineModel.equals(engine.getModel())){
                    carEngine=engine;
                    break;
                }
            }


            Car car = new Car(carModel, carEngine, weight, color);
            System.out.println(car);
        }



    }
}
