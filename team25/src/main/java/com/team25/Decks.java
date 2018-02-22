package com.team25;

import com.team25.Cards.*;
import java.util.ArrayList;

abstract class Decks {
	
	protected ArrayList<Cards> Deck = new ArrayList<Cards>();
		
	abstract void create();
	
	abstract ArrayList<Cards> shuffe();// will be converted to a public method after
	
	public Cards draw() {
		if(!Deck.isEmpty()) {
			return Deck.get(0);
		}else {
			System.out.println("Deck is Empty, Failed to draw a card from deck");
			return Deck.get(0); ////this will crash the program if it is execuited. this is tempoaray untill i think of a sultion
		}
		};
	
	public ArrayList<Cards> getDeck(){return Deck;}
}
