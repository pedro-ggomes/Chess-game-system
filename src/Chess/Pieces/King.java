package Chess.Pieces;

import BoardGame.Board;
import Chess.COLOR;
import Chess.ChessPiece;

public class King extends ChessPiece {
    public King(Board board, COLOR color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
