public class Play {
    private Board board;
    private Player firstPlayer;
    private Player secondPlayer;


    public Play(Board board, Player player1, Player player2) {
        this.board = board;
        this.firstPlayer = player1;
        this.secondPlayer = player2;
    }

    public Player getPlayer() {
        Player player;
        if (firstPlayer.getStatus())
            player = firstPlayer;
        else
            player = secondPlayer;
        return player;
    }

    public void  move(int playerSelection) {
        Player player = getPlayer();
        String playCard = player.getSymbol();
        if (board.get(playerSelection) == null)
            board.set(playerSelection, playCard);
    }

    public Player determinePlayOrder() {
        return firstPlayer.getSymbol().equals("O") ? firstPlayer : secondPlayer;
    }


}
