package com.team25;
import com.team25.Cards.*;
import java.util.ArrayList;
public class AdventureDeck extends Deck {

	@Override
	void create() {
		// TODO Auto-generated method stub
		// create a card
		// create a multicard
		// repeat until all cards are complete
		// append all multicards together
		
		Weapon_Card Excalibur = new Weapon_Card("Excalibur", "/Cards/Weapons_Excalibur.png" , 30);
		ArrayList<Cards> excaliburList = addMultiCards(Excalibur, 2);
		
		Weapon_Card Lance = new Weapon_Card("Lance", "/Cards/Weapons_Lance.png", 20);
		ArrayList<Cards> lanceList = addMultiCards(Lance, 6);
		
		Weapon_Card BattleAx = new Weapon_Card("Battle-ax", "/Cards/Weapons_BattleAx.png", 15);
		ArrayList<Cards> battleAxList = addMultiCards(BattleAx, 8);
	
		Weapon_Card Sword = new Weapon_Card("Sword", "/Cards/Weapons_Sword.png", 10);
		ArrayList<Cards> swordList = addMultiCards(Sword, 16);
		
		Weapon_Card Horse = new Weapon_Card("Horse", "/Cards/Weapons_Horse.png", 10);
		ArrayList<Cards> horseList = addMultiCards(Horse, 11);
		
		Weapon_Card Dagger = new Weapon_Card("Dagger", "/Cards/Weapons_Dagger.png", 5);
		ArrayList<Cards> daggerList = addMultiCards(Dagger, 6);
		
		Foe_Card Dragon = new Foe_Card("Dragon", "/Cards/Foes_Dragon.png", 50, 70);
		ArrayList<Cards> dragonList = addMultiCards(Dragon, 1);
		
		Foe_Card Giant = new Foe_Card("Giant", "/Cards/Foes_Giant.png", 40, 0);
		ArrayList<Cards> giantList = addMultiCards(Giant, 2);
		
		Foe_Card Mordred = new Foe_Card("Mordred", "/Cards/Foes_Mordred.png", 30, 0);
		ArrayList<Cards> mordredList = addMultiCards(Mordred, 4);
		
		Foe_Card greenKnight = new Foe_Card("Green Knight", "/Cards/Foes_GreenKnight.png", 25, 40);
		ArrayList<Cards> greenKnightList = addMultiCards(greenKnight, 2);
		
		Foe_Card blackKnight = new Foe_Card("Black Knight", "/Cards/Foes_BlackKnight.png", 25, 35);
		ArrayList<Cards> blackKnightList = addMultiCards(blackKnight, 3);
		
		Foe_Card evilKnight = new Foe_Card("Evil Knight", "/Cards/Foes_EvilKnight.png", 20, 30);
		ArrayList<Cards> evilKnightList = addMultiCards(evilKnight, 6);
		
		Foe_Card saxonKnight = new Foe_Card("Saxon Knight", "/Cards/Foes_SaxonKnight.png", 15, 25);
		ArrayList<Cards> saxonKnightList = addMultiCards(saxonKnight, 8);
		
		Foe_Card robberKnight = new Foe_Card("Robber Knight", "/Cards/Foes_RobberKnight.png", 15, 0);
		ArrayList<Cards> robberKnightList = addMultiCards(robberKnight, 7);
		
		Foe_Card Saxons = new Foe_Card("Saxons", "/Cards/Foes_Saxons.png", 10, 20);
		ArrayList<Cards> saxonsList = addMultiCards(Saxons, 5);
		
		Foe_Card Boar = new Foe_Card("Boar", "/Cards/Foes_Boar.png", 5, 15);
		ArrayList<Cards> boarList = addMultiCards(Boar, 4);
		
		Foe_Card Thieves = new Foe_Card("Thieves", "/Cards/Foes_Thieves.png", 5, 0);
		ArrayList<Cards> thievesList = addMultiCards(Thieves, 8);
		
		Test_Card testOfValor = new Test_Card("Test of Valor", "/Cards/Test_TestOfValor.png", 0);
		ArrayList<Cards> testOfValorList = addMultiCards(testOfValor, 2);
		
		Test_Card testOfTemptation = new Test_Card("Test of Temptation", "/Cards/Test_TestOfTemptation.png" , 0);
		ArrayList<Cards> testOfTemptationList = addMultiCards(testOfTemptation, 2);
		
		Test_Card testOfMorganLeFey = new Test_Card("Test of Morgan Le Fey", "/Cards/Test_TestOfMorganLeFey.png", 3);
		ArrayList<Cards> testOfMorganLeFeyList = addMultiCards(testOfMorganLeFey, 2);
		
		Test_Card testOfTheQuestingBeast = new Test_Card("Test of the Questing Beast", "/Cards/Test_TestOfTheQuestingBeast.png", 4);
		ArrayList<Cards> testOfTheQuestingBeastList = addMultiCards(testOfTheQuestingBeast, 2);
		
		Ally_Card sirGalahad = new Ally_Card("Sir Galahad", "/Cards/Ally_SirGalahad.png", 15, 0, 0, 0);
		ArrayList<Cards> sirGalahadList = addMultiCards(sirGalahad, 1);
		
		Ally_Card sirLancelot = new Ally_Card("Sir Lancelot", "/Cards/Ally_SirLancelot.png", 15, 0, 25, 0);
		ArrayList<Cards> sirLancelotList = addMultiCards(sirLancelot, 1);
		
		Ally_Card kingArthur = new Ally_Card("King Arthur", "/Cards/Ally_KingArthur.png", 10, 2, 0, 0);
		ArrayList<Cards> kingArthurList = addMultiCards(kingArthur, 1);
		
		Ally_Card sirTristan = new Ally_Card("Sir Tristan", "/Cards/Ally_SirTristan.png", 10, 0, 0, 0); //go add implementation when game logic is in place
		ArrayList<Cards> sirTristanList = addMultiCards(sirTristan, 1);
		
		Ally_Card sirPellinore = new Ally_Card("Sir Pellinore", "/Cards/Ally_SirPellinore.png", 10, 0, 0, 4);
		ArrayList<Cards> sirPellinoreList = addMultiCards(sirPellinore, 1);
		
		Ally_Card sirGawain = new Ally_Card("Sir Gawain", "/Cards/Ally_SirGawain.png", 10, 0, 20, 0);
		ArrayList<Cards> sirGawainList = addMultiCards(sirGawain, 1);
		
		Ally_Card sirPercival = new Ally_Card("Sir Percival", "/Cards/Ally_SirPercival.png", 5, 0, 20, 0);
		ArrayList<Cards> sirPercivalList = addMultiCards(sirPercival, 1);
		
		Ally_Card queenGuinevere = new Ally_Card("Queen Guinevere", "/Cards/Ally_QueenGuinevere.png", 0, 3, 0, 0);
		ArrayList<Cards> queenGuinevereList = addMultiCards(queenGuinevere, 1);
		
		Ally_Card queenIseult = new Ally_Card("Queen Iseult", "/Cards/Ally_QueenIseult.png", 0, 2, 0, 4);
		ArrayList<Cards> queenIseultList = addMultiCards(queenIseult, 1);
		
		//Ally_Card Merlin = new Ally_Card("Merlin", null, 0, 0, 0, 0);
		//ArrayList<Cards> merlinList = addMultiCards(Merlin, 1);
		
		Ally_Card Amour = new Ally_Card("Amour", "/Cards/Amour_10.png");
		ArrayList<Cards> amourList = addMultiCards(Amour, 8);
		
		Deck.addAll(excaliburList);
		Deck.addAll(lanceList);
		Deck.addAll(battleAxList);
		Deck.addAll(swordList);
		Deck.addAll(horseList);
		Deck.addAll(daggerList);
		Deck.addAll(dragonList);
		Deck.addAll(giantList);
		Deck.addAll(mordredList);
		Deck.addAll(greenKnightList);
		Deck.addAll(blackKnightList);
		Deck.addAll(evilKnightList);
		Deck.addAll(saxonKnightList);
		Deck.addAll(robberKnightList);
		Deck.addAll(saxonsList);
		Deck.addAll(boarList);
		Deck.addAll(thievesList);
		Deck.addAll(testOfValorList);
		Deck.addAll(testOfTemptationList);
		Deck.addAll(testOfMorganLeFeyList);
		Deck.addAll(testOfTheQuestingBeastList);
		Deck.addAll(sirGalahadList);
		Deck.addAll(sirLancelotList);
		Deck.addAll(kingArthurList);
		Deck.addAll(sirTristanList);
		Deck.addAll(sirPellinoreList);
		Deck.addAll(sirGawainList);
		Deck.addAll(sirPercivalList);
		Deck.addAll(queenGuinevereList);
		Deck.addAll(queenIseultList);
		//Deck.addAll(merlinList);
		Deck.addAll(amourList);
	}

	@Override
	ArrayList<Cards> shuffe() {
		// TODO Auto-generated method stub
		return null;
	}

}
