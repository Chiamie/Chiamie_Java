public class Board {
    private String[][] boardSize;


    public Board(int size) {
        this.boardSize = new String[size][size];
    }

    private int[] changeToIndex(int playerSelection){
        int[] indices = new int[2];
        if (playerSelection > 0 && playerSelection <= boardSize.length){
            indices[0] = 0;
            indices[1] = playerSelection - 1;
        }
        else if (playerSelection > boardSize.length && playerSelection <= boardSize.length * 2){
            indices[0] = 1;
            indices[1] = playerSelection - boardSize.length - 1;
        }
        else if (playerSelection > boardSize.length * 2 && playerSelection <= boardSize.length * 3){
            indices[0] = 2;
            indices[1] = playerSelection - boardSize.length - 1;
        }
        return indices;
    }


    public String set(int playerSelection, String playCard){
        int[] indices = changeToIndex(playerSelection);
        int row = indices[0];
        int column = indices[1];
        if (row < 0 || row >= boardSize.length  || column < 0 || column >= boardSize.length)
            throw new IndexOutOfBoundsException("Index is out of bounds!");

        String oldValue = boardSize[row][column];
        boardSize[row][column] = playCard;
        return oldValue;
    }

    public int indexOf (String value){
        for(int count = 0; count < boardSize.length; count++) {
            for(int counter = 0; counter < boardSize.length; counter++) {
                if(boardSize[counter][count] != null && boardSize[counter][count].equals(value))
                    return counter;
            }
        }
        return -1;
    }

    public String get(int cell) {
        if  (cell > 0 && cell < boardSize.length)
            return boardSize[0][cell - 1];
        else if  (cell > boardSize.length && cell <= boardSize.length * 2)
            return boardSize[1][(cell - boardSize.length) - 1];
        else
            return boardSize[2][(cell - boardSize.length) - 1];
    }

    @Override
    public String toString() {
        String result = "";
        for (String[] row: boardSize) {
            for (String cell : row) {
                result += String.format("%3s ", cell);
            }
            result += "\n";
        }
        return result;
    }
}
