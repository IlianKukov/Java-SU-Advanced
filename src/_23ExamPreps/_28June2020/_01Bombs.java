package _23ExamPreps._28June2020;

import java.util.*;
import java.util.stream.Collectors;

public class _01Bombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> effects = new ArrayDeque<>();
        Deque<Integer> casings = new ArrayDeque<>();

        String[] bombLine = scanner.nextLine().split(", ");
        String[] castingLine = scanner.nextLine().split(", ");

        for (String bomb : bombLine) {
            effects.offer(Integer.parseInt(bomb));
        }

        for (String casting : castingLine) {
            casings.push(Integer.parseInt(casting)); // push when stack, offer when queue
        }
        int db =0, cb=0, sdb=0;
        boolean filled = false;
        while (!effects.isEmpty() && !casings.isEmpty()){
            int currentEffect = effects.peek();
            int currentCasting = casings.peek();
            int sum = currentEffect + currentCasting;

            switch (sum){
                case 40: db++;effects.pop();casings.poll();break;
                case 60: cb++;effects.pop();casings.poll();break;
                case 120: sdb++;effects.pop();casings.poll();break;
                default:casings.pop();casings.push(currentCasting-5);
            }

            if (db>=3 && cb>=3 && sdb>=3){
                filled=true;
                break;
            }
        }

        if (filled){
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        }else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }

        System.out.print("Bomb Effects: ");
        if (!effects.isEmpty()){
            String printer = effects.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.print(printer);
        } else {
            System.out.print("empty");
        }
        System.out.println();
        System.out.print("Bomb Casings: ");
        if (!casings.isEmpty()){
            String printer = casings.stream()
                    .map(String::valueOf)
            .collect(Collectors.joining(", "));
            System.out.print(printer);

        } else {
            System.out.print("empty");
        }
        System.out.println();
        System.out.println("Cherry Bombs: " + cb);
        System.out.println("Datura Bombs: " + db);
        System.out.println("Smoke Decoy Bombs: " + sdb);

    }
}
