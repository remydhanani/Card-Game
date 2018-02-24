package com.team25;

import com.team25.Cards.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

abstract class ModelDeck {
	
	protected ArrayList<Cards> Deck = new ArrayList<Cards>();
		
	abstract void create();
	
	ArrayList<Cards> shuffe() {
		Random seed = new Random(1374568413792536148L);
		Collections.shuffle(Deck, seed);			
		return Deck;		
	}
	
	public Cards draw() {
		if(!Deck.isEmpty()) {
			return Deck.get(0);
		}else {
			System.out.println("Deck is Empty, Failed to draw a card from deck");
			return Deck.get(0); ////this will crash the program if it is execuited. this is tempoaray untill i think of a sultion
		}
	};
		
	protected ArrayList<Cards> addMultiCards(Cards card, int num){
		ArrayList<Cards> temp = new ArrayList<Cards>();
		for(int i=0; i<num; i++) {
			temp.add(card);
		}
		return temp;
	};
	
	
	public ArrayList<Cards> getDeck(){return Deck;}
}
