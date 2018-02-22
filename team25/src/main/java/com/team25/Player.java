package com.team25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.team25.Cards.Cards;

public class Player {
	List<String> ranks = Arrays.asList("Squire", "Knight", "Champion Knight");
	
	private ArrayList<Cards> Hand = new ArrayList<Cards>();
	private String Rank;
	private int Shields;
	boolean isTurn;
	private int freeBids;
	
	public String getRank() {return Rank;}	
	public void nextRank(String rank) {
		if(ranks.indexOf(Rank) == 2) {
			System.out.println("Max Rank");
		}else
			Rank = ranks.get(ranks.indexOf(Rank) + 1);}
	public int getShields() {return Shields;}
	public void addShields(int shields) {Shields = shields;}
	public boolean isTurn() {return isTurn;}
	public void setTurn(boolean isTurn) {this.isTurn = isTurn;}
	public int getfreeBids() {return freeBids;};
	public void setfreeBids(int num) {};// takes positive or negative
	
	public void addCard(Cards card) {};	
	public void discard(Cards card) {}

	
}
