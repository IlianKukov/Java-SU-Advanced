package _23ExamPreps._14Dec2022;

import java.util.Scanner;

public class _02NavyBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        char[][] board = new char[lines][];
        int battlecruiser=0;
        int hits=0;
        //read board
        for (int row = 0; row <lines ; row++) {
            board[row] = scanner.nextLine().toCharArray();
        }
        //find Starting point
        int subRow=-1, subCol=-1;
        for (int row = 0; row <board.length ; row++) {
            for (int col = 0; col <board[row].length ; col++) {
                if (board[row][col]=='S'){
                    subRow=row;
                    subCol=col;
                    board[row][col]='-';
                } else if (board[row][col]=='C') {
                    battlecruiser++;
                }
            }
        }

//        int currentRow=-1, currentCol=-1;
        while (true){
            String command = scanner.nextLine();

            switch (command){
                case"up":subRow--;break;
                case"down":subRow++;break;
                case"left":subCol--;break;
                case"right":subCol++;break;
            }

            if (board[subRow][subCol]=='*'){
                hits++;
                board[subRow][subCol]='-';
                if (hits==3){
                    board[subRow][subCol]='S';
                    System.out.printf("%nMission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n",subRow,subCol);
                    printer(board);
                    break;
                }
            }else if (board[subRow][subCol]=='C'){
                battlecruiser--;
                board[subRow][subCol]='-';
                if (battlecruiser==0){
                    board[subRow][subCol]='S';
                    System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
                    printer(board);
                    break;
                }
            }


        }
    }
    private static void printer(char[][] board){

       for (int i = 0; i<board.length; i++) {
           for (int j = 0; j<board[i].length; j++) {
               System.out.print(board[i][j]);
           }
           System.out.println();
       }
    }


}
