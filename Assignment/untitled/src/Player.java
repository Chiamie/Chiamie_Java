public class Player {
    private String name;
    private String Symbol;
    private boolean status = false;

    public Player(String name, String symbol) {
        this.name = name;
        Symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void isPlaying() {
        if(!status)
            status = true;
        else
            status = false;
    }

    public boolean getStatus() {
        return status;
    }




}
