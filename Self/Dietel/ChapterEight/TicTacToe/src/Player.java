public class Player {
    private String name;
    private final GameValues symbol;
//    private boolean status;
//    private int score;

    public Player(String playerName, GameValues playerSymbol) {
        this.name = playerName;
        this.symbol = playerSymbol;
    }

//    public void isPlaying() {
//        status = !status;
//    }
//
//    public boolean getStatus() {
//        return status;
//    }

//    public int getScore() {
//        return score;
//    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }

    public String getName() {
        return name;
    }

    public void setName(String playerName) {
        this.name = playerName;
    }

    public GameValues getSymbol() {
        return symbol;
    }
}
