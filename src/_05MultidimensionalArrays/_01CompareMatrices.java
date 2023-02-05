package _05MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _01CompareMatrices {
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


        int[] inputDimentions2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int secondMatrixRows = inputDimentions2[0];
        int secondMatrixCols = inputDimentions2[1];

        int[][] secondMatrix = new int[secondMatrixRows][];

        for (int i = 0; i <secondMatrixRows ; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            secondMatrix[i]=arr;
        }

        boolean compare = compare(firstMatrix,secondMatrix);

        if (compare){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }

    }


    private static boolean compare(int[][] firstMatrix, int[][] secondMatrix){
    if (firstMatrix.length!=secondMatrix.length){
        return false;
    }

        for (int row = 0; row <firstMatrix.length ; row++) {
            if (firstMatrix[row].length!=secondMatrix[row].length){
                return false;
            }

            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col]!= secondMatrix[row][col]){
                    return false;
                }
            }
            
        }


        return true;
    }
}
