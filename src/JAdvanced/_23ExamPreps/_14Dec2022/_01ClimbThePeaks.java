package JAdvanced._23ExamPreps._14Dec2022;

import java.util.*;

public class _01ClimbThePeaks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> claimed = new ArrayList<>();

        Deque<Integer> foods = new ArrayDeque<>();
        Deque<Integer> staminas = new ArrayDeque<>();

        String[] foodLine = scanner.nextLine().split(", ");
        String[] staminaLine = scanner.nextLine().split(", ");

        for (String food : foodLine) {
            foods.push(Integer.parseInt(food));
        }

        for (String stamina : staminaLine) {
            staminas.offer(Integer.parseInt(stamina));
        }

        boolean c1=true, c2=false, c3=false, c4=false, c5=false, success=false;
        while (!staminas.isEmpty() || !foods.isEmpty()){
            int currentFood =  foods.pop();
            int currentStamina =  staminas.poll();
            int sum = currentFood + currentStamina;

            if (sum >=80 && c1){
                claimed.add("Vihren");
                c1=false;
                c2=true;
            }else if (sum >=90 && c2){
                claimed.add("Kutelo");
                c2=false;
                c3=true;
            }else if (sum >=100 && c3){
                claimed.add("Banski Suhodol");
                c3=false;
                c4=true;
            }else if (sum >=60 && c4){
                claimed.add("Polezhan");
                c4=false;
                c5=true;
            }else if (sum >=70 && c5){
                claimed.add("Kamenitza");
                c5=false;
            }else {

            }

            if (claimed.size()==5){
                success=true;
                break;
            }

        }


        if (success){
            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
            System.out.println("Conquered peaks:");
            claimed.forEach(p -> System.out.println(p));

        }else {
            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
            if (claimed.size()!=0){
                System.out.println("Conquered peaks:");claimed.forEach(p -> System.out.println(p));
            }
        }


    }
}
