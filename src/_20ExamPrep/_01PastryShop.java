package _20ExamPrep;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _01PastryShop {

    private static final int BISCUIT_VALUE = 25;
    private static final int CAKE_VALUE = 50;
    private static final int PASTRY_VALUE = 75;
    private static final int PIE_VALUE = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] liquidInfo = scanner.nextLine().split("\\s+");
        Deque<Integer> liquids = new ArrayDeque<>();
         
        for (String liquid: liquidInfo){
            liquids.offer(Integer.parseInt(liquid));
        }

        String[] ingridientsInfo = scanner.nextLine().split("\\s+");
        Deque<Integer> ingridients = new ArrayDeque<>();

        for (String ingridient: ingridientsInfo){
               ingridients.push(Integer.parseInt(ingridient));
        }

        int biscuitCount=0, cakeCount=0, pastryCount=0, pieCount = 0;

       while (!liquids.isEmpty() && !ingridients.isEmpty() ){
           Integer liquid = liquids.poll();
           Integer ingredient = ingridients.pop();
            int posibleDish = liquid + ingredient;

            switch (posibleDish){
                case BISCUIT_VALUE: biscuitCount++;break;
                case CAKE_VALUE: cakeCount++;break;
                case PASTRY_VALUE: pastryCount++;break;
                case PIE_VALUE: pieCount++;break;
                default: ingridients.push(ingredient+3);break;
            }


       }




    }
}
