package _24FinalExam;

import com.sun.source.tree.IfTree;

import java.util.*;
import java.util.stream.Collectors;

public class _01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> claimed = new ArrayList<>();

        Deque<Integer> text = new ArrayDeque<>();
        Deque<Integer> med = new ArrayDeque<>();

        String[] medLine = scanner.nextLine().split("\\s+");
        String[] textLine = scanner.nextLine().split("\\s+");

        for (String food : medLine) {
            text.offer(Integer.parseInt(food));
        }

        for (String stamina : textLine) {
            med.push(Integer.parseInt(stamina));
        }

        int p=0, b=0, m=0;
        while (!text.isEmpty() && !med.isEmpty()) {
            int textCurrent = text.peek();
            int medCurrent = med.peek();
//            int med1current = med1.pop();
//            int med2current = med2.poll();
            int sum = textCurrent + medCurrent;

            if (sum ==30 ){
                p++;
                text.pop();
                med.poll();
            }else if (sum ==40){
                b++;
                text.pop();
                med.poll();
            }else if (sum ==100){
                m++;
                text.pop();
                med.poll();
            }else if(sum >100){
                m++;
                text.pop();
                med.poll();
                int currentSum = sum-100;
                int medNext = med.peek() + currentSum;
                med.poll();
                med.push(medNext);

            }else {
                text.pop();
                int medNext = med.peek() + 10;
                med.poll();
                med.push(medNext);
            }

        }


        if (text.isEmpty() && med.isEmpty()){
            System.out.println("Textiles and medicaments are both empty.");
        }else {
            if (text.isEmpty()){
                System.out.println("Textiles are empty.");
            }else if (med.isEmpty()){
                System.out.println("Medicaments are empty.");
            }
        }

        Map<String , Integer> toPrint = new HashMap<>();


        if (m>b){
            if (m>0){
                System.out.printf("MedKit - %d%n", m);
                toPrint.put("Medikit", m);
            }

            if (b>0){
                System.out.printf("Bandage - %d%n", b);
                toPrint.put("Bandage", b);
            }

            if (p>0){
                System.out.printf("Patch - %d%n", p);
                toPrint.put("Patch", p);
            }
        } else if (b>m) {

            if (b > 0) {
                System.out.printf("Bandage - %d%n", b);
                toPrint.put("Bandage", b);
            }
            if (m > 0) {
                System.out.printf("MedKit - %d%n", m);
                toPrint.put("Medikit", m);
            }

        }
            if (p>0){
                System.out.printf("Patch - %d%n", p);
                toPrint.put("Patch", p);
            } else if (p>m) {

                if (b>0){
                    System.out.printf("Bandage - %d%n", b);
                    toPrint.put("Bandage", b);
                }
                if (p>0){
                    System.out.printf("Patch - %d%n", p);
                    toPrint.put("Patch", p);
                }

                if (m>0){
                    System.out.printf("MedKit - %d%n", m);
                    toPrint.put("Medikit", m);
                }

        }else {
            if (m>0){
                System.out.printf("MedKit - %d%n", m);
                toPrint.put("Medikit", m);
            }

            if (b>0){
                System.out.printf("Bandage - %d%n", b);
                toPrint.put("Bandage", b);
            }

            if (p>0){
                System.out.printf("Patch - %d%n", p);
                toPrint.put("Patch", p);
            }
        }


//        for( Map.Entry<String, Integer> entry : toPrint.entrySet() ){
//            System.out.println( entry.getKey() + " - " + entry.getValue() );
//        }


        if (!text.isEmpty()){
            System.out.printf("Textiles left: ");
            String printer = text.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.print(printer);
        }

        if (!med.isEmpty()){
            System.out.printf("Medicaments left: ");
            String printer = med.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
            System.out.print(printer);
        }


    }
}
