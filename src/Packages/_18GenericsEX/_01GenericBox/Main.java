package Packages._18GenericsEX._01GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String data = scanner.nextLine();
            Box<String> box = new Box<>(data);
            System.out.println(box);

        }





    }
}