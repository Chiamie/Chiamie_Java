public class Game {
    private Board board;
    private Player player1;
    private Player player2;
//    private boolean gameOver;
//    private int playerScore;

    public Game(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

//    public Player getPlayer() {
//        Player player;
//        if (player1.getStatus())
//            player = player1;
//        else
//            player = player2;
//        return player;
//    }

    public void move(int playerSelection, Player player) {
        GameValues playCard = player.getSymbol();
        if (board.get(playerSelection) == GameValues.EMPTY) {
            board.set(playerSelection, playCard);
        } else  {
            throw new IllegalArgumentException("The cell is not empty");
        }
    }

//    public void setGameOver() {
//        gameOver = board.isEmpty();
//    }
//
//    public boolean isGameOver() {
//        return gameOver;
//    }


//    public void setGameOver() {
//       gameOver = board.hasHorizontalWin() || board.hasVerticalWin() || board.hasBackwardDiagonalWin() || board.hasForwardDiagonalWin();
//   }
    public boolean isGameOver() {
       return board.hasHorizontalWin() || board.hasVerticalWin() || board.hasBackwardDiagonalWin() || board.hasForwardDiagonalWin();
   }



}
