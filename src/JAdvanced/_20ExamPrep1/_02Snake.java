package JAdvanced._20ExamPrep1;

import java.util.Scanner;

public class _02Snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int snakeCol=-1, snakeRow=-1;

        int lairStartRow=-1, lairStartCol=-1,
            lairEndRow=-1, lairEndCol=-1;

        char[][] board = new char[n][];

        for (int row = 0; row <n ; row++) {
            board[row] = scanner.nextLine().toCharArray();
        }

        //get the snake position by the letter 'S' (single quotes because it is a char array not String)
        for (int row = 0; row <board.length ; row++) {
            for (int col = 0; col <board[row].length ; col++) {
                if (board[row][col]=='S'){
                    snakeRow=row;
                    snakeCol=col;
                } else if (board[row][col]=='B') {
                    if (lairStartRow==-1){
                        lairStartRow = row;
                        lairStartCol = col;
                    } else {
                        lairEndRow = row;
                        lairEndCol = col;
                    }
                }
            }
        }


        boolean outBoard = false;
        int food = 0;
        while (!outBoard){
            if (board[snakeRow][snakeCol]=='*'){
                food++;
                board[snakeRow][snakeCol]='.';
            } else if (board[snakeRow][snakeCol]=='B') {
                board[snakeRow][snakeCol]='.';
                snakeRow=lairEndRow;
                snakeCol=lairEndCol;
                board[snakeRow][snakeCol]='S';
                continue;
            }else if (board[snakeRow][snakeCol]=='S'){
                board[snakeRow][snakeCol]='.';
            }else {
                board[snakeRow][snakeCol]='.';
            }

            if (food==10){
                board[snakeRow][snakeCol]='S';
                break;
            }

            String command = scanner.nextLine();

            switch (command){
                case "up": snakeRow--;
                    break;
                case "down": snakeRow++;
                    break;
                case "left": snakeCol--;
                    break;
                case "right": snakeCol++;
                    break;
            }


            if (snakeCol<0 || snakeCol >=n ||
            snakeRow<0 || snakeRow>=n){
                outBoard=true;
                continue;
            }



        }

        if (outBoard){
            System.out.println("Game over!");
        } else if (food>=10) {
            System.out.println("You won! You fed the snake.");
        }

        System.out.println("Food eaten: " + food);
        printer(board);

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
