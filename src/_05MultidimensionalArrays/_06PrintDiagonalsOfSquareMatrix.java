package _05MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inp = Integer.parseInt(scanner.nextLine());

        int[][] firstMatrix = new int[inp][];


        for (int i = 0; i <inp ; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            firstMatrix[i]=arr;
        }

        int diag = 0;
        for (int rows = 0; rows < inp; rows++) {
            System.out.print(firstMatrix[rows][diag] + " ");
            diag++;
        }
        System.out.println();

        diag = 0;
        for (int rows = inp; rows > 0; rows--) {
            System.out.print(firstMatrix[rows-1][diag] + " ");
            diag++;
        }





    }
}
