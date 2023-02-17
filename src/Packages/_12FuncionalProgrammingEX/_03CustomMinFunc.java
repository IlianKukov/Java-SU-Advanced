package Packages._12FuncionalProgrammingEX;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _03CustomMinFunc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

//        System.out.println(Collections.min(numbers));
//        Consumer<List<Integer>> printMinNumber = list -> System.out.println(Collections.min(list));
//        printMinNumber.accept(numbers);


        Function<List<Integer>,Integer> minNumber = list -> Collections.min(list);

        Integer minElement = minNumber.apply(numbers);
        System.out.println(minElement);




    }
}
