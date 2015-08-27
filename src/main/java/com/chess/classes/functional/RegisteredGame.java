package com.chess.classes.functional;

import com.chess.classes.helpful.GameState;

public class RegisteredGame {


	protected String playerOneMove;
	protected String playerTwoMove;
	
	protected boolean playerOneMessageAwait=false;
	protected boolean playerTwoMessageAwait=false;

	private GameState stateOfGame = GameState.AWAIT_ON_ENGINES;
	
	public void setEngineMove(Integer numberOfEngine, String move) {
	}
	
	
	/**
	 * Get Opposite player move 
	 * @param numberOfEngineWhoSendRequest
	 * @return move as String
	 */
	public String getOppositePlayerMove(int numberOfEngineWhoSendRequest) {return null;};
	
	public GameState getStateOfGame() {
		return stateOfGame;
	}

	public void setStateOfGame(GameState stateOfGame) {
		this.stateOfGame = stateOfGame;
	}

}
