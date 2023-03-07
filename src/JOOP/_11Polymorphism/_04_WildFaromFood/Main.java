package JOOP._11Polymorphism._04_WildFaromFood;

import java.lang.reflect.Type;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inp = scanner.nextLine();

        while (!inp.equals("END")){

            String[] animalParts = scanner.nextLine().split("\\s+");

            Animal animal = createAnimal(animalParts);

            inp = scanner.nextLine();
        }






    }

    private static Animal createAnimal(String[] animalParts) {
        AnimalType type = AnimalType.valueOf(animalParts[0]);

            if (type == AnimalType.Cat){
               return new Cat();
            } else if () {
                return new Cat();
            }

            return null;
    }
}
