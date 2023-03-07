package JOOP._10InterfaceAndAbstractionEX._00_Review;

import java.util.Scanner;
public class ReviewMain {
    public static void main(String[] args) {
        CommandParser commandParser = new CommandParser("Beast!");
        Scanner scanner = new Scanner(System.in);
        boolean handledLastCommand = commandParser.parse(scanner.nextLine());


        while (!handledLastCommand){




            handledLastCommand = commandParser.parse(scanner.nextLine());
        }

    }
}
