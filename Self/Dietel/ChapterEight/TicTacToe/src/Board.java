
public class Board {
    private GameValues[][] board;
    private boolean empty;


    public Board(int size) {
        this.board = new GameValues[size][size];
        for(int row = 0; row < board.length; row++) {
            for(int column = 0; column < board[row].length; column++) {
                board[row][column] = GameValues.EMPTY;
            }
        }
        this.empty = true;
    }

    private int[] changeToIndex(int playerSelection){
        int[] indices = new int[2];
        if (playerSelection > 0 && playerSelection <= board.length){
            indices[0] = 0;
            indices[1] = playerSelection - 1;
        }
        else if (playerSelection > board.length && playerSelection <= board.length * 2){
            indices[0] = 1;
            indices[1] = playerSelection - board.length - 1;
        }
        else if (playerSelection > board.length * 2 && playerSelection <= board.length * 3){
            indices[0] = 2;
            indices[1] = playerSelection - (board.length * 2) - 1;
        }
        return indices;
    }

    public void set(int playerSelection, GameValues playCard){
        int[] indices = changeToIndex(playerSelection);
        int row = indices[0];
        int column = indices[1];
        if (row < 0 || row >= board.length  || column < 0 || column >= board.length)
            throw new IndexOutOfBoundsException("Index is out of bounds!");

//        GameValues oldValue = board[row][column];
        board[row][column] = playCard;
        toggleEmpty();

    }

    public GameValues get(int cell) {
        if  (cell > 0 && cell <= board.length)
            return board[0][cell - 1];
        else if  (cell > board.length && cell <= board.length * 2)
            return board[1][(cell - board.length) - 1];
        else
            return board[2][(cell - board.length * 2) - 1];
    }


    public GameValues[][] getBoard() {
        return board;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(int row = 0; row < board.length; row++) {
            for(int column = 0; column < board[row].length; column++) {
                result.append("|" + "   " + board[row][column] + "  ");
            }
            result.append("\n");
        }
        return result.toString();

    }

    public boolean isFull() {
        for(int row = 0; row < board.length; row++) {
            for(int column = 0; column < board[row].length; column++) {
                if(board[row][column] == GameValues.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public void toggleEmpty() {
        empty = !isFull();
    }

    public boolean isEmpty() {
        return empty;
    }

//    public boolean checkHorizontalWin() {
//         for(int row = 0; row < board.length; row++) {
//            for(int column = 0; column < board[row].length; column++) {
//                if(board[row][row].equals(board[row][column]))
//                    return false;
//            }
//        }
//        return true;
//    }

    public boolean hasVerticalWin(){
        boolean allSame = false;
        for(int column = 0; column < board[0].length; column++){
            GameValues comparator = board[0][column];
            for(int row = 0; row < board.length; row++){
                if (board[row][column].equals(comparator) && board[row][column] != GameValues.EMPTY)
                    allSame = true;
                else{
                    allSame = false;
                    break;
                }
            }
            if(allSame)
                return true;
        }

        return false;
    }


    public boolean hasHorizontalWin(){
        boolean allSame = false;
        for (GameValues[] gameValues : board) {
            Object comparator = gameValues[0];
            for (GameValues gameValue : gameValues) {
                if (gameValue.equals(comparator) && gameValue != GameValues.EMPTY) allSame = true;
                else {
                    allSame = false;
                    break;
                }
            }
            if (allSame) return true;
        }
        return false;
    }

    public  boolean hasForwardDiagonalWin(){
        boolean allSame = false;
        GameValues comparator = board[0][0];
        for(int row = 0; row < board.length; row++){
            if (board[row][row].equals(comparator) && board[row][row] != GameValues.EMPTY){
                allSame = true;
            }
            else{
                allSame = false;
                break;
            }
        }
        return allSame;
    }

    public  boolean hasBackwardDiagonalWin(){
        boolean allSame = false;
        GameValues comparator = board[0][2];
        int column = board[0].length - 1;
        for(int row = 0; row < board.length; row++){
            while (column + row == board.length - 1) {
                allSame = board[row][column].equals(comparator)  && board[row][column] != GameValues.EMPTY;
                column--;
            }
        }
        return allSame;
    }

    public boolean hasAnyMoveBeenMade(){
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[row].length; column++){
                if(!board[row][column].equals(GameValues.EMPTY)){
                    return true;
                }
            }
        } return false;
    }


}
