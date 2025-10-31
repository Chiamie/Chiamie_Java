import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String player1Name = input.nextLine();

//        System.out.print("Enter Symbol: ");
//        String player1Symbol = input.nextLine();

        System.out.print("Select number from 1 to 5: ");
        int player1NumberSelection = input.nextInt();

        System.out.print("Enter your name: ");
        String player2Name = input.nextLine();

//        System.out.print("Enter Symbol: ");
//        String player2Symbol = input.nextLine();

        System.out.print("Select number from 1 to 5: ");
        int player2NumberSelection = input.nextInt();
        while (player2NumberSelection == player1NumberSelection) {
            System.out.print("Select number from 1 to 5: ");
            player2NumberSelection = input.nextInt();
        }

        String player1Symbol;
        String player2Symbol;

        if (player1NumberSelection < player2NumberSelection) {
            player1Symbol = "O";
            player2Symbol = "X";
        } else {
            player2Symbol = "O";
            player1Symbol = "X";
       }


        Player player1 = new Player(player1Name, player1Symbol);
        Player player2 = new Player(player2Name, player2Symbol);



        Board board = new Board(3);
        System.out.print(board.toString());

        Play play = new Play(board, player1, player2);
        Player firstToPlay = play.determinePlayOrder();
        System.out.print(firstToPlay.getName() + "Enter a number from 1 to 9: ");
        int playerSelection = input.nextInt();

        play.move(playerSelection);








    }

//    public static Player assignSymbol(int player1NumberSelection, int player2NumberSelection) {
//        if (player1NumberSelection < player2NumberSelection) {
//            player1Symbol = "O";
//            player2Symbol = "X";
//        } else {
//            player2Symbol = "O";
//            player1Symbol = "X";
//        }
//    }

}