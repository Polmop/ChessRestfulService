package com.chess.classes.functional;

public class DuoGame extends RegisteredGame {
	
	
	
	
	/**
	 * Set which engine send move and what move he did
	 */
	@Override
	public void setEngineMove(Integer numberOfEngine, String move){
		System.out.println("Jestem w");
		if(numberOfEngine.equals(1)){
			playerOneMove = move;
			playerTwoMove = null;
			playerOneMessageAwait=true;
			playerTwoMessageAwait=false;
		}else if(numberOfEngine.equals(2)){
			playerTwoMove = move;
			playerOneMove = null;
			playerTwoMessageAwait=true;
			playerOneMessageAwait=false;
		}
	}
	
	
	
	/**
	 * Gets engine move
	 */
	@Override
	public String getOppositePlayerMove(int numberOfPlayerWhoSendRequest){
		
		if(numberOfPlayerWhoSendRequest==1 && playerTwoMessageAwait){
			playerOneMessageAwait=false;
			playerTwoMessageAwait=false;
			playerOneMove=null;
			return playerTwoMove;
		} else if(numberOfPlayerWhoSendRequest==2 && playerOneMessageAwait){
			playerOneMessageAwait=false;
			playerTwoMessageAwait=false;
			playerTwoMove=null;
			return playerOneMove;
		}
		return null;
	}
}
