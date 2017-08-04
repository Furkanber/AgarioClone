package tr.org.kamp.linux.agarioclone;

import java.awt.Color;

import tr.org.kamp.linux.agarioclone.logic.GameLogic;
import tr.org.kamp.linux.agarioclone.model.Difficulty;

/**
 * 
 * @author Furkanber
 *
 * This class executes the game.
 *
 */

public class AgarioCloneApp {

	public static void main(String[] args) {
		GameLogic gameLogic = new GameLogic("Guray", Color.BLUE, Difficulty.EASY);
		gameLogic.startApplication();
	}
	
}
