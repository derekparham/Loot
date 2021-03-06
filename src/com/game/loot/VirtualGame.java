package com.game.loot;

import java.util.ArrayList;
import java.util.List;

public class VirtualGame {
	public static void main(String[] args){
		Player p1 = new VirtualPlayer("Henry");
		Player p2 = new VirtualPlayer("Aseem");
		
		List<Player> players = new ArrayList<Player>();
		players.add(p1);
		players.add(p2);
		GameState gameState = new GameState(players);
		
		CardSet deck = CardSet.addFullDeck();
		
		GamePlay gamePlay = new VirtualGamePlay(gameState, deck);
		
		LootEngine engine = new LootEngine(players, gamePlay, gameState);
		engine.play();
	}
}
