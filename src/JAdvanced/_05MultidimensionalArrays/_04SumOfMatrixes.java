package JAdvanced._05MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _04SumOfMatrixes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputDimentions1 = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstMatrixRows = inputDimentions1[0];
        int firstMatrixCols = inputDimentions1[1];

        int[][] firstMatrix = new int[firstMatrixRows][];


        for (int i = 0; i <firstMatrixRows ; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            firstMatrix[i]=arr;
        }

        System.out.println(firstMatrixRows);
        System.out.println(firstMatrixCols);

        int sum=0;

        for (int rows = 0; rows < firstMatrixRows; rows++) {
            for (int cols = 0; cols <firstMatrixCols ; cols++) {
                sum+=firstMatrix[rows][cols];
            }
        }
        System.out.println(sum);
        






    }
}
