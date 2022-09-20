package Chess.Pieces;

import BoardGame.Board;
import Chess.COLOR;
import Chess.ChessPiece;

public class Rook extends ChessPiece {

    public Rook(Board board, COLOR color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
