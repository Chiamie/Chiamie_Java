import java.util.Scanner;

public class TicTacToe {
    static Board board = new Board(3);


    public static boolean gameOver(Game play){
        if(!board.hasAnyMoveBeenMade()) return false;
        return play.isGameOver() || board.isFull();
    }

    public static String declareWinner(Player currentPlayer){
        if (board.isFull()) return "There is no winner";
        else
            return "The loser is" + currentPlayer.getName();
    }

    public static void displayBoard() {
        System.out.print(board);
    }

    public static String determinePlayOrder(String[] player1Details, String[] player2Details) {
        String firstToPlay;
        String secondToPlay;
        int result = player1Details[1].compareTo(player2Details[1]);
        if (result > 0) {
            firstToPlay = player1Details[0];
            secondToPlay = player2Details[0];
        } else {
            firstToPlay = player2Details[0];
            secondToPlay = player1Details[0];
        }
        return firstToPlay + " " + secondToPlay;
    }

    public static void assignSymbolsToPlayers(String[] player1Details, String[] player2Details) {
        String playOrder = determinePlayOrder(player1Details, player2Details);
        String[] firstToPlay = playOrder.split(" ");
        if (firstToPlay[0].equals(player1Details[0])) {
            player1Details[2] = "X";
            player2Details[2] = "O";
        } else {
            player1Details[2] = "O";
            player2Details[2] = "X";
        }
    }

    public static String[][] registerPlayers() {
        Scanner input = new Scanner(System.in);

        String[] player1Details = new String[3];
        String[] player2Details = new String[3];
        System.out.println("Enter your name: ");
        String player1Name = input.next();
        System.out.println("Select number from 1 to 5: ");
        int player1NumberSelection = input.nextInt();

        player1Details[0] = player1Name;
        player1Details[1] = String.valueOf(player1NumberSelection);

        System.out.println("Enter your computer name: ");
        String player2Name = input.next();
        System.out.println("Select number from 1 to 5: ");
        int player2NumberSelection = input.nextInt();
        while (player2NumberSelection == player1NumberSelection) {
            System.out.print("Select number from 1 to 5: ");
            player2NumberSelection = input.nextInt();
        }

        player2Details[0] = player2Name;
        player2Details[1] = String.valueOf(player2NumberSelection);

        return new String[][]{player1Details, player2Details};
    }
}






