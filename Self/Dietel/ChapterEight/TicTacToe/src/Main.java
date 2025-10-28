import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] player1Details = new String[3];
        String[] player2Details = new String[3];


        String[][] players = TicTacToe.registerPlayers();
        player1Details = players[0];
        player2Details = players[1];

        TicTacToe.assignSymbolsToPlayers(player1Details, player2Details);


        TicTacToe.displayBoard();


        Player player1 = new Player(player1Details[0], GameValues.valueOf(player1Details[2]));
        Player player2 = new Player(player2Details[0], GameValues.valueOf(player2Details[2]));
        Player firstToPlay;
        Player secondToPlay;

        Game play = new Game(TicTacToe.board, player1, player2);
        String[] playOrder = TicTacToe.determinePlayOrder(player1Details, player2Details).split(" ");

        if (player1.getName().equals(playOrder[0])) {
            firstToPlay = player1;
            secondToPlay = player2;
        } else {
            firstToPlay = player2;
            secondToPlay = player1;
        }


        int playerSelection;

        Player currentPlayer = firstToPlay;
        System.out.println(TicTacToe.board.isEmpty());
        while (!TicTacToe.gameOver(play)) {
            System.out.println(currentPlayer.getName() + " " + "Choose a number from 1 to 9");
            playerSelection = input.nextInt();
            try {
                play.move(playerSelection, currentPlayer);
                currentPlayer = (currentPlayer == firstToPlay) ? secondToPlay : firstToPlay;
            } catch (IllegalArgumentException e) {
                System.out.println("Try again, " + currentPlayer.getName() + ": " + e.getMessage());
            }

            TicTacToe.displayBoard();
        }
        System.out.println(TicTacToe.declareWinner(currentPlayer));


}




}
