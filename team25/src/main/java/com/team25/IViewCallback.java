package com.team25;

import java.util.ArrayList;

import com.team25.Cards.Cards;

public interface IViewCallback {
	
	/*
	 * Update number of cards and card face
	 * @param currentPlayer pass currentPlayer to face up only his cards.
	 */
	void updatePlayerCards(Player currentPlayer);
	
	/*
	 * This function will show stages according to the number of passed as parameter
	 * @param number count of stage to be displayed
	 */
	void showStages(int number);
	
	/*
	 * Updates rank card of the player passed as argument with the image of rank
	 * 
	 * @param player of which rank card needs to be updated
	 * @param rankImg Image path of rank which will be showed on rank card
	 * 
	 */
	void showRankCard(Player player, String rankImg);
	
	/*
	 * Pass cards to show as Tournament Cards
	 */
	void setTournamentCards(ArrayList<Cards> cards);
	
	//boolean askPlayer(Player player, String msg); 
}
