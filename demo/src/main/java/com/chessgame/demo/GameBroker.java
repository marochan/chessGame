package com.chessgame.demo;

import java.util.Random;

import com.github.bhlangonijr.chesslib.Board;
import com.github.bhlangonijr.chesslib.move.Move;
import com.github.bhlangonijr.chesslib.Square;

public class GameBroker {
    
    public GameBroker(){};

    public void saveGame(String gameId, Board board){
        //placeholder
    }

    public Board getGame(String gameId){
        //placeholder: sample code only
        Board board = new Board();
        board.doMove(new Move(Square.E2, Square.E4));

        return board;
    }

    public String getNewGameId(){

        //Returns random string for now - should be replaced
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) 
            (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }

    public void addToRandomGames(String gameId){
        //placeholder
    }

    public String getRandomExistingGameId(){
        //PLACEHOLDER ONLY - for now returns just random game Id 
        return getNewGameId();
    }


}
