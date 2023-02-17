package Packages._05MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _05MaximumSumOf2X2Submatrix {
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
        int maxRow =0;
        int maxCol=0;
        int maxSum =Integer.MIN_VALUE;
        for (int rows = 0; rows < firstMatrixRows-1; rows++) {
            for (int cols = 0; cols <firstMatrixCols-1; cols++) {
                int currentSum = firstMatrix[rows][cols]+firstMatrix[rows][cols+1]
                +firstMatrix[rows+1][cols]+firstMatrix[rows+1][cols+1];

                if (currentSum>maxSum){
                    maxSum=currentSum;
                    maxRow=rows;
                    maxCol=cols;
                }
            }
        }
        System.out.printf("%d %d %n%d %d %n%d",
        firstMatrix[maxRow][maxCol],firstMatrix[maxRow][maxCol+1],
        firstMatrix[maxRow+1][maxCol],firstMatrix[maxRow+1][maxCol+1],
        maxSum);

    }
}
