package com.team25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.team25.Cards.Cards;

public class Player {
	List<String> ranks = Arrays.asList("Squire", "Knight", "Champion Knight","Knight of the Round Table");
	
	private ArrayList<Cards> Hand = new ArrayList<Cards>();
	private String Rank;
	private int Shields;
	private int playerId;
	boolean isTurn;
	private boolean isBot;
	private String name;
	private int freeBids;
	
	public String getRank() {return Rank;}	
	public void nextRank(String rank) {
		if(ranks.indexOf(Rank) == 3) {
			System.out.println("Max Rank");
		}else
			Rank = ranks.get(ranks.indexOf(Rank) + 1);}
	public int getShields() {return Shields;}
	public void addShields(int shields) {Shields += shields;}
	public boolean isTurn() {return isTurn;}
	public void setTurn(boolean isTurn) {this.isTurn = isTurn;}
	public int getfreeBids() {return freeBids;};
	public void setfreeBids(int num) {};// takes positive or negative
	
	public void addCard(Cards card) {Hand.add(card);};	
	public void discard(Cards card) {}
	public int HandSize() {return Hand.size();}
	
	public boolean isBot() {
		return isBot;
	}
	public void setBot(boolean isBot) {
		this.isBot = isBot;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public ArrayList<Cards> getHand() {
		return Hand;
	}
	
	

	
}
