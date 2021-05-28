package com.chessgame.demo;

import com.github.bhlangonijr.chesslib.Board;
import com.github.bhlangonijr.chesslib.move.Move;

public class Handler {
    
    private static GameBroker broker;

    public Handler(){
        if(broker == null){
            broker = new GameBroker();
        }
    }

    public String createGame(String fen, Boolean randomOpp){
        Board board = BoardParser.parseFENtoBoard(fen);
        String gameId = broker.getNewGameId();
        broker.saveGame(gameId, board);
        if(randomOpp){
            broker.addToRandomGames(gameId);
        }
        return gameId;
    }

    public String getGame(String gameId){
        Board board = broker.getGame(gameId);
        String fen = BoardParser.parseBoardToFEN(board);
        return fen;
    }

    public String makeMove(String gameId, String moveString){
        Board board = broker.getGame(gameId);
        Move move = BoardParser.parseStringToMove(moveString);
        board.doMove(move);
        broker.saveGame(gameId, board);
        return BoardParser.getBoardStatus(board);
    }

}
