package TicTacToe;

import java.util.*;

public class Tic_Tac_Toe {

    public static void fun(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void choice(char[][] gameBoard) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number to put your choice 1 to 9");
        int pos = scan.nextInt();
        System.out.println(pos);

        switch (pos) {
            case 1:

                if (gameBoard[0][0] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice(gameBoard);
                    break;
                }
                gameBoard[0][0] = 'X';
                break;
            case 2:
                if (gameBoard[0][2] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice(gameBoard);
                    break;
                }
                gameBoard[0][2] = 'X';
                break;
            case 3:
                if (gameBoard[0][4] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice(gameBoard);
                    break;
                }
                gameBoard[0][4] = 'X';
                break;
            case 4:
                if (gameBoard[2][0] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice(gameBoard);
                    break;
                }
                gameBoard[2][0] = 'X';
                break;
            case 5:
                if (gameBoard[2][2] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice(gameBoard);
                    break;
                }
                gameBoard[2][2] = 'X';
                break;
            case 6:
                if (gameBoard[2][4] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice(gameBoard);
                    break;
                }
                gameBoard[2][4] = 'X';
                break;
            case 7:

                if (gameBoard[4][0] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice(gameBoard);
                    break;
                }
                gameBoard[4][0] = 'X';
                break;
            case 8:
                if (gameBoard[4][2] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice(gameBoard);
                    break;
                }
                gameBoard[4][2] = 'X';
                break;
            case 9:

                if (gameBoard[4][4] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice(gameBoard);
                    break;
                }
                gameBoard[4][4] = 'X';
                break;
            default:
                System.out.println("enter again(invalid entry)");
                break;

        }
        // scan.close();
    }

    public static void choice1(char[][] gameBoard) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number to put your choice 1 to 9");
        int pos = scan.nextInt();
        System.out.println(pos);

        switch (pos) {
            case 1:

                if (gameBoard[0][0] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice1(gameBoard);
                    break;
                }
                gameBoard[0][0] = 'O';
                break;
            case 2:
                if (gameBoard[0][2] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice1(gameBoard);
                    break;
                }
                gameBoard[0][2] = 'O';
                break;
            case 3:
                if (gameBoard[0][4] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice1(gameBoard);
                    break;
                }
                gameBoard[0][4] = 'O';
                break;
            case 4:
                if (gameBoard[2][0] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice1(gameBoard);
                    break;
                }
                gameBoard[2][0] = 'O';
                break;
            case 5:
                if (gameBoard[2][2] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice1(gameBoard);
                    break;
                }
                gameBoard[2][2] = 'O';
                break;
            case 6:
                if (gameBoard[2][4] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice1(gameBoard);
                    break;
                }
                gameBoard[2][4] = 'O';
                break;
            case 7:

                if (gameBoard[4][0] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice1(gameBoard);
                    break;
                }
                gameBoard[4][0] = 'O';
                break;
            case 8:
                if (gameBoard[4][2] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice1(gameBoard);
                    break;
                }
                gameBoard[4][2] = 'O';
                break;
            case 9:

                if (gameBoard[4][4] != ' ') {
                    System.out.println("enter valid spaces that are left");
                    choice1(gameBoard);
                    break;
                }
                gameBoard[4][4] = 'O';
                break;
            default:
                System.out.println("enter again(invalid entry)");
                break;

        }
        // scan.close();
    }

    public static int enderx(char[][] gameBoard) {
        int flag = 0;
        if ((gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X')
                || (gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X')
                || (gameBoard[4][0] == 'X' && gameBoard[4][2] == 'X' && gameBoard[4][4] == 'X')) {
            flag = 1;
        }

        if ((gameBoard[0][0] == 'X' && gameBoard[2][0] == 'X' && gameBoard[4][0] == 'X')
                || (gameBoard[0][2] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][2] == 'X')
                || (gameBoard[0][4] == 'X' && gameBoard[2][4] == 'X' && gameBoard[4][4] == 'X')) {
            flag = 1;
        }
        if ((gameBoard[0][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][4] == 'X')
                || (gameBoard[0][4] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][0] == 'X')) {
            flag = 1;
        }

        if (flag == 1) {
            return 1;
        }
        return 24;
    }

    public static int endero(char[][] gameBoard) {
        int flag = 0;
        if ((gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4] == 'O')
                || (gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4] == 'O')
                || (gameBoard[4][0] == 'O' && gameBoard[4][2] == 'O' && gameBoard[4][4] == 'O')) {
            flag = 1;
        }

        if ((gameBoard[0][0] == 'O' && gameBoard[2][0] == 'O' && gameBoard[4][0] == 'O')
                || (gameBoard[0][2] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][2] == 'O')
                || (gameBoard[0][4] == 'O' && gameBoard[2][4] == 'O' && gameBoard[4][4] == 'O')) {
            flag = 1;
        }
        if ((gameBoard[0][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][4] == 'O')
                || (gameBoard[0][4] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][0] == 'O')) {
            flag = 1;
        }

        if (flag == 1) {
            return 1;
        }
        return 24;
    }

    public static void main(String[] args) {
        char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };
        fun(gameBoard);
        System.out.println();
        int flag = 0;
        int count = 1;
        while (count != 10) {
            if (count % 2 == 1) {
                choice(gameBoard);
            } else {
                choice1(gameBoard);
            }
            fun(gameBoard);

            if (enderx(gameBoard) == 1) {

                System.out.println("X wins");
                flag = 1;
                break;

            }
            if (endero(gameBoard) == 1) {

                System.out.println("O wins");
                flag = 1;
                break;

            }
            count += 1;
        }
        // choice(gameBoard);
        // fun(gameBoard);
        if (flag == 0) {
            System.out.println("game is drawn");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("enter any number to quit");
        int k = scan.nextInt();
        scan.close();

    }

}
