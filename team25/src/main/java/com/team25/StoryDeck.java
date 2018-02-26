package com.team25;

import java.util.ArrayList;

import com.team25.Cards.*;

public class StoryDeck extends Deck {

	@Override
	void create() {
		//create a card
		// create a multicard
		// repeat till all cards are done
		//then append all multicards together
		
		Quest_Card Search_Grail = new Quest_Card("Search for the Holy Grail", "/team25/Resources/Cards/Quests_SearchForTheHolyGrail.png", 5,"all");
		//ArrayList<Cards>   = addMultiCards( , 2);
		Deck.add(Search_Grail);
		
		Quest_Card Test_Green_Knight = new Quest_Card("Test for the Green Knight", "/team25/Resources/Cards/Quests_TestOfTheGreenKnight.png", 4,"Green Knight");
		//ArrayList<Cards>   = addMultiCards( , 2);
		Deck.add(Test_Green_Knight);
		
		Quest_Card Search_Quest_Beast = new Quest_Card("Search for the Questing Beast", "/team25/Resources/Cards/Quests_SearchForTheQuestingBeast.png", 4,null);
		//ArrayList<Cards>   = addMultiCards( , 2);
		Deck.add(Search_Quest_Beast);
		
		Quest_Card Defend_Queen = new Quest_Card("Defend the Queen’s Honor", "/team25/Resources/Cards/Quests_DefendTheQueensHonour.png", 4,"all");
		//ArrayList<Cards>   = addMultiCards( , 2);
		Deck.add(Defend_Queen);
		
		Quest_Card Rescue_Madian = new Quest_Card("Rescue the Fair Maiden", "/team25/Resources/Cards/Quests_RescueTheFairMaiden.png", 3,"Black Knight");
		//ArrayList<Cards>   = addMultiCards( , 2);
		Deck.add(Rescue_Madian);
		
		Quest_Card Journey_Forest = new Quest_Card("Journey through the Enchanted Forest", "/team25/Resources/Cards/Quests_JourneyThroughTheEnchantedForest.png", 3,"Evil Knight");
		//ArrayList<Cards>   = addMultiCards( , 2);
		Deck.add(Journey_Forest);
		
		Quest_Card Vanquish_Enemies = new Quest_Card("Vanquish King Arthur’s Enemies", "/team25/Resources/Cards/Quests_VanquishKingArthursEnemies.png", 3,null);
		ArrayList<Cards> Vanquish_EnemiesList = addMultiCards(Vanquish_Enemies , 2);
		Deck.addAll(Vanquish_EnemiesList);
		
		Quest_Card Slay_Dragon= new Quest_Card("Slay the Dragon", "/team25/Resources/Cards/Quests_SlayTheDragon.png", 3,"Dragon");
		//ArrayList<Cards>   = addMultiCards( , 2);
		Deck.add(Slay_Dragon);
		
		Quest_Card Boar_Hunt = new Quest_Card("Boar Hunt", "/team25/Resources/Cards/Quests_BoarHunt.png", 2,"Boar");
		ArrayList<Cards> Boar_HuntList = addMultiCards( Boar_Hunt, 2);
		Deck.addAll(Boar_HuntList);
		
		Quest_Card Repel_Saxons = new Quest_Card("Test for the Green Knight", "/team25/Resources/Cards/Quests_TestOfTheGreenKnight.png", 4,"Green Knight");
		ArrayList<Cards> Repel_SaxonsList = addMultiCards(Repel_Saxons , 2);
		Deck.addAll(Repel_SaxonsList);

		
		Tournament_Card Camelot = new Tournament_Card("Tournment at Camelot", "/team25/Resources/Cards/Tournament_Camelot.png", 3);
		ArrayList<Cards> CamelotList = addMultiCards(Camelot ,1);
		Deck.addAll(CamelotList);
		
		Tournament_Card Orkney = new Tournament_Card("Tournmen at Orkney", "/team25/Resources/Cards/Tournament_Orkney.png", 2);
		ArrayList<Cards> OrkneyList = addMultiCards(Orkney , 1);
		Deck.addAll(OrkneyList);
		
		Tournament_Card Tintagel = new Tournament_Card("Tournmen at Tintagel", "/team25/Resources/Cards/Tournament_Tintagel.png", 1);
		ArrayList<Cards> TintagelList = addMultiCards(Tintagel , 1);
		Deck.addAll(TintagelList);
		
		Tournament_Card York = new Tournament_Card("Tournmen at York", "/team25/Resources/Cards/Tournament_York.png", 0);
		ArrayList<Cards> YorkList = addMultiCards(York , 1);
		Deck.addAll(YorkList);
		
		
		Event_Card King_Rec = new Event_Card("King’s Recognition", "/team25/Resources/Cards/Events_KingsRecognition.png", 4);
		ArrayList<Cards> King_Rec_List = addMultiCards(King_Rec , 2);
		Deck.addAll(King_Rec_List);
		
		Event_Card Queen_Fav = new Event_Card("Queen’s Favor", "/team25/Resources/Cards/Events_QueensFavour.png", 5);
		ArrayList<Cards> Queen_Fav_List = addMultiCards(Queen_Fav , 2);
		Deck.addAll(Queen_Fav_List);
		
		Event_Card Court_Called = new Event_Card("Court_Called", "/team25/Resources/Cards/Events_CourtCalledToCamelot.png", 6);
		ArrayList<Cards> Court_Called_List = addMultiCards(Court_Called , 2);
		Deck.addAll(Court_Called_List);
		
		Event_Card Pox = new Event_Card("Pox", "/team25/Resources/Cards/Events_Pox.png", 2);
		//ArrayList<Cards> Court_Called_List = addMultiCards(Court_Called , 2);
		Deck.add(Pox);
		
		Event_Card Plague = new Event_Card("Plague", "/team25/Resources/Cards/Events_Plague.png", 3);
		//ArrayList<Cards> Court_Called_List = addMultiCards(Court_Called , 2);
		Deck.add(Plague);
		
		Event_Card Chivalrous_Deed = new Event_Card("Chivalrous Deed", "/team25/Resources/Cards/Events_Plague.png", 1);
		//ArrayList<Cards> Court_Called_List = addMultiCards(Court_Called , 2);
		Deck.add(Chivalrous_Deed);
		
		Event_Card Prosperity_Realm = new Event_Card("Prosperity throughout the Realm", "/team25/Resources/Cards/Events_ProsperityThroughoutTheRealm.png", 8);
		//ArrayList<Cards> Court_Called_List = addMultiCards(Court_Called , 2);
		Deck.add(Prosperity_Realm);

		Event_Card King_Call_Arm = new Event_Card("Prosperity throughout the Realm", "/team25/Resources/Cards/Events_KingsCallToArms.png", 7);
		//ArrayList<Cards> Court_Called_List = addMultiCards(Court_Called , 2);
		Deck.add(King_Call_Arm);
		
		shuffle();
		
	}

}
