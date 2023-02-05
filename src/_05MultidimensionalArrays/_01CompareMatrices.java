package _05MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _01CompareMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] inputDimentions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int matrixRows = inputDimentions[0];
        int matrixCols = inputDimentions[1];

        int[][] firstMatrix = new int[matrixRows][];




    }
}
