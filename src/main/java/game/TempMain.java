package game;

public class TempMain {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.move(new Vector2d(0,0), "0 2");
        System.out.println(gameBoard);
    }
}
