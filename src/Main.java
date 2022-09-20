import BoardGame.Board;
import BoardGame.BoardException;
import Chess.ChessMatch;

public class Main {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
