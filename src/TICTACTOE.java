import java.util.Scanner;

public class TICTACTOE {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        initializeBoard(board);
        String player1, player2;

        System.out.print("Enter player 1's name (X): ");
        player1 = scanner.nextLine();
        System.out.print("Enter player 2's name (O): ");
        player2 = scanner.nextLine();

        boolean player1Turn = true;
        boolean gameWon = false;
        int moves = 0;

        while (!gameWon && moves < 9) {
            printBoard(board);
            System.out.println((player1Turn ? player1 : player2) + "'s turn");

            int row = -1;
            int col = -1;

            while (row < 0 || col < 0 || board[row][col] != ' ') {
                System.out.print("Enter row (1-3): ");
                row = scanner.nextInt() - 1;
                System.out.print("Enter column (1-3): ");
                col = scanner.nextInt() - 1;

                if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') {
                    System.out.println("Invalid input or cell is already taken. Try again.");
                }
            }

            board[row][col] = player1Turn ? 'X' : 'O';
            gameWon = checkWin(board, row, col);
            player1Turn = !player1Turn;
            moves++;
        }

        printBoard(board);

        if (gameWon) {
            System.out.println((player1Turn ? player2 : player1) + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    private static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char current = board[i][j];
                String color = current == 'X' ? ANSI_RED : (current == 'O' ? ANSI_BLUE : "");
                System.out.print(color + current + ANSI_RESET);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }

    private static boolean checkWin(char[][] board, int row, int col) {
        char currentPlayer = board[row][col];
        boolean winRow = true, winCol = true, winDiag1 = true, winDiag2 = true;

        for (int i = 0; i < 3; i++) {
            if (board[row][i] != currentPlayer) winRow = false;
            if (board[i][col] != currentPlayer) winCol = false;
            if (board[i][i] != currentPlayer) winDiag1 = false;
            if (board[i][2 - i] != currentPlayer) winDiag2 = false;
        }

        return winRow || winCol || winDiag1 || winDiag2;
    }
}