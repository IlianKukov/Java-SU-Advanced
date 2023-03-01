package JAdvanced._05MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputDimentions1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstMatrixRows = inputDimentions1[0];
        int firstMatrixCols = inputDimentions1[1];

        int[][] firstMatrix = new int[firstMatrixRows][];


        for (int i = 0; i <firstMatrixRows ; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            firstMatrix[i]=arr;
        }

        int searchNum = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (int row = 0; row < firstMatrixRows; row++) {
            for (int cols = 0; cols < firstMatrixCols; cols++) {
                if (firstMatrix[row][cols]==searchNum){
                    System.out.println(row + " " + cols);
                    found=true;
                }

            }

        }
        if (!found){
            System.out.println("not found");
        }



    }
}
