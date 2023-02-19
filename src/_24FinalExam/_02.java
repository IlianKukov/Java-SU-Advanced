package _24FinalExam;

import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] linesArr = scanner.nextLine().split("\\s+");
        int lines = Integer.parseInt(linesArr[0]);
        int rows = Integer.parseInt(linesArr[1]);
        char[][] board = new char[lines][rows];
        int obstacles =0;
        int touched=0;
        int moves=0;
        //read board
        for (int row = 0; row <lines ; row++) {
                board[row] = scanner.nextLine().replaceAll("\\s+","").toCharArray();
        }
        //find Starting point
        int subRow=-1, subCol=-1;
        for (int row = 0; row <board.length ; row++) {
            for (int col = 0; col <board[row].length ; col++) {
                if (board[row][col]=='B'){
                    subRow=row;
                    subCol=col;
                } else if (board[row][col]=='O') {
                    obstacles++;
                }
            }
        }


        String command = scanner.nextLine();
        while (!command.equals("Finish")){
            int previousCol = subCol;
            int previousRow = subRow;

            switch (command){
                case"up":subRow--;break;
                case"down":subRow++;break;
                case"left":subCol--;break;
                case"right":subCol++;break;
            }

            if (subCol<0 || subCol >=lines ||
                    subRow<0 || subRow>=rows){
                subCol =  previousCol;
                subRow = previousRow;
                command = scanner.nextLine();
                continue;
            } else if (board[subRow][subCol]=='O') {
                subCol =  previousCol;
                subRow = previousRow;
                command = scanner.nextLine();
                continue;
            } else if (board[subRow][subCol]=='P') {
                moves++;
                touched++;
                if (touched==3){
                    break;
                }
            }else {
                moves++;
            }


            command = scanner.nextLine();
        }

        System.out.println("Game over!");
        System.out.print("Touched opponents: " + touched);
        System.out.print(" Moves made: " + moves);

    }
}
