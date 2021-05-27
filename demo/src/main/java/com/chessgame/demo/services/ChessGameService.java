package com.chessgame.demo.services;
import org.springframework.stereotype.Service;

@Service("chessGameService")
public class ChessGameService{
	private String name;
	 
	public void setName(String name) {
		this.name = name;
	}
 
	public String sayHello() {
		return "Hello! " + name;
	}
}