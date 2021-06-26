package com.nas.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	@Autowired
	private GamingConsole game;
	

	public GameRunner(GamingConsole game) {
	this.game=game;
	}
	public GamingConsole getGame() {
		return game;
	}

	
	/*public void setGame(GamingConsole game) {
		System.out.println("Setter method");
		this.game = game;
	}*/



	public void runGame()
	{
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

	
}
