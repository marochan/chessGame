package com.chessgame.demo;

import com.github.bhlangonijr.chesslib.Board;
import com.github.bhlangonijr.chesslib.Square;
import com.github.bhlangonijr.chesslib.move.Move;

public abstract class BoardParser {
    
    public static Board parseFENtoBoard(String fen){
        Board board = new Board();
        board.loadFromFen(fen);
        return board;
    }

    public static String parseBoardToFEN(Board board){
        return board.getFen();
    }

    public static Move parseStringToMove(String moveString){
        String source = moveString.substring(0,2);
        String target = moveString.substring(2,4);
        return new Move(Square.valueOf(source), Square.valueOf(target));
    }

}
