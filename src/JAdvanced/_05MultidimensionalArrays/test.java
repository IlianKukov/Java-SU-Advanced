package JAdvanced._05MultidimensionalArrays;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//        int[][] intMatrix =  {
//                {1,1,1},
//                {2,2,2,2},
//                {3,3,3,3,3}
//        };
//
//        int[][] intTestMatrix = new int[5][];
//
//        printMethod(intMatrix);

        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(parts[0]);
        int cols  = Integer.parseInt(parts[1]);

        int[][] data = new int[rows][cols];

        for (int i = 0; i <rows; i++) {
        String[] rowNums = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                data[i][j] = Integer.parseInt(rowNums[j]);
            }
        }

        printMethod(data);


    }

    private static void printMethod(int[][] intMatrix) {
        for (int row = 0; row < intMatrix.length ; row++) {
            for (int col = 0; col < intMatrix[row].length ; col++) {
                System.out.print(intMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
