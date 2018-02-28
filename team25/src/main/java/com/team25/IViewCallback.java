package com.team25;

public interface IViewCallback {
	void displayPlayerCards(Player player);
	
	void showStages(int number);
	
	void showRankCard(Player player, String rankImg);
}
