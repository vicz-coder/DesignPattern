package org.self.learn.structural.flyweight;

public class ChessGame {
    public static void main(String[] args) {
        //White Pawns
        for (int i = 1;i<=8;i++){
            ChessPiece pawn = ChessPieceFactory.getPiece("pawn","white");
            pawn.position(i,2);
        }

        //Black Pawns
        for (int i = 1;i<=8;i++){
            ChessPiece pawn = ChessPieceFactory.getPiece("pawn","black");
            pawn.position(i,7);
        }
    }
}
