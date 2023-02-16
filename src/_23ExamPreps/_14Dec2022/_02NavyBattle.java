package _23ExamPreps._14Dec2022;

import java.util.Scanner;

public class _02NavyBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        char[][] board = new char[lines][];
        boolean dead = false;
        //read board
        for (int row = 0; row <lines ; row++) {
            board[row] = scanner.nextLine().toCharArray();
        }
        //find Starting point
        int subRow, subCol;
        for (int row = 0; row <board.length ; row++) {
            for (int col = 0; col <board[row].length ; col++) {
                if (board[row][col]=='S'){
                    subRow=row;
                    subCol=col;
                }
            }
        }

        while (!dead){
            String command = scanner.nextLine();

            switch (command){
                case"up":break;
                case"down":break;
                case"left":break;
                case"right":break;
            }


        }




    }
}
