package Chess.Pieces;

import BoardGame.Board;
import Chess.Color;
import Chess.ChessPiece;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
