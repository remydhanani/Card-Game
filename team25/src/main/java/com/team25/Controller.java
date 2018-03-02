package com.team25;

import java.util.ArrayList;

import com.team25.Cards.*;

public class Controller{
	public boolean GameOver = false;
	ArrayList<Player> Players;
	ArrayList<Player> Winners;
	StoryDeck Story;
	AdventureDeck Advent;
	Player CurrentPlayer;
	Cards ObjectiveCard;
	private IViewCallback viewHandler;
	public static boolean gCard = true;
	ArrayList<Cards> iCard = null;
/*
 * Shuffle Decks
 * Show Squire Cards
 * Show 0 Shields
 * Deal Hands (12 adventure cards)
 * Player 1 Goes First
 * Start GameLoop
 * Reveal Top card from Story deck
 * 		If Quest
 * 			Choose Sponsor, starting with current player and rotateing between other players
 * 			Sponsor Sets up Quest filling stages with cards from hand making sure each stage increase Power Maximun 1 Test card
 * 			Ask Players If they Want to Play in the quest
 * 			Deal one card to all players in the quest (not sponser)
 * 			Do Not Show Cards Say if next stage has a foe or a test
 * 			if Foe:	Secretly place cards to fight the unknown foe
 * 					Reveal foe and Weaopns
 * 					Reveal Players cards
 * 					add up bp of all cards played
 * 					Discard all weapons
 * 					Deal One card to all continuing Players	
 *			if Test:
 * 					Reveal the Test
 * 					choose to continue or drop out (Include Free bids)
 * 	 				Player next to the sponser choose how many cards to discard to contiue
* 					the next person chooses how many to discard (must be more the all previous bids)
* 					if only player they must bid the minimum bid or 3 cards otherwise the quest ends 
* 			Discard Amours			
 * 		    Sponsorer draws to #stages + Cards Played to create the quest
 * 			Winners recive Shields = to the amount of stages
 * 			start turn of player to sponsers left
 * 		if Tournament
 * 			each player chooses to enter or not starting with the person who drawed
 * 				if only one person enters award them 1+ num of sheilds for winning and continue the the next turn
 * 			each player chooses what cards to play in the tournament (no dupe weapons or multiple amours)
 * 			Winner is the one with most BP and wins sheilds equal to #players in tournament + bouns shields
 * 			if a tie, play a second round disard all weapons and reveal cards, if they tie again award each player sheilds = to # of players orginaly in tournament
 * 		if Event
 * 			Apply effect fo event to game
 * Check if cards more then 12 if so play/discard to 12 (do this constantly durning every turn)
 * upgrade Rank if u can 5 , 7 10
 * if rank is equal to Knight of the round table (pay 10 shields)
 * 	if this happens to multiple ppl they play a tournament and winner wins the game if tied twice they both win the game
 * */
 
	
	public void SetUpGame(ArrayList<Player> Players) {
		Story = new StoryDeck();
		Advent = new AdventureDeck();
		Story.create();
		Advent.create();
		this.Players = Players;
		for (int X = 0; X < this.Players.size(); X++)// Loops through every player
			for (int Y = 0; Y < 12; Y++)// Add 12 cards to each players Hand
				this.Players.get(X).addCard(Advent.draw());
		CurrentPlayer = Players.get(0);
		StartGame();
	}

	public Cards TopDeck() { // Flips the top Card of the StoryDeck
		return Story.draw();
	}

	public void CheckRank() {
		Player player;
		for (int X = 0; X < this.Players.size(); X++) {// Loops through every player
			player = Players.get(X);
			if (player.getRank() == "Squire") {
				if(player.getShields() >= 5) {
					player.addShields(-5);
					player.nextRank("Knight");
					}
			}else if (player.getRank() == "Knight") {
				if(player.getShields() >= 7) {
					player.addShields(-7);
					player.nextRank("Champion Knight");
					}			
			}else if (player.getRank() == "Champion Knight") {
				if(player.getShields() >= 10) {
					player.addShields(-10);
					player.nextRank("Knight of the Round Table");
					GameOver = true;
					}	
			}
		}
	}

	
	public void StartGame() {
		while (!GameOver) {
			ObjectiveCard = TopDeck();
			if (ObjectiveCard.getType() == "Quest") {

			} else if (ObjectiveCard.getType() == "Tournament") {
				StartTournament(false);
			} else if (ObjectiveCard.getType() == "Event") {
				//ObjectiveCard.;
			}
			CheckRank();
			//nextPlayer();
		}
		for (int X = 0; X < this.Players.size(); X++)// Loops through every player
				if(Players.get(X).getRank() == "Knight of the Round Table") {
					Winners.add(Players.get(X));
				}
		System.out.println("Congratulations For Winning"+ Winners.toString());
	}

	private void StartTournament(boolean secondAttempt) {
		//start loop x
		//Ask Player if they want to play
		//Rotate player screen
		//end Loop
		//each tournament player draws a card Currentplayer.addcard(advent.deal)
		//if only one person award 1+bonus shields
		//start loop
		//ask players playing to click cards he wants to use
		//remove cards from hand
		//end loop
		//compare players bp points
		// Highest wins players.size + bonus Shield
		//if tie; start new tournament where second attempt is true
		//if tie again both win the players.size + bonus Shield
		
		ArrayList<Player> tournamentPlayers = new ArrayList<Player>();
		
		//ask player if they want to play
		for(int i = 0; i < Players.size(); i++) {
			//Ask_Player(CurrentPlayer);
			//rotate player screen	
		}
		
		//each player draws a tournament card
		for(int i = 0; i < tournamentPlayers.size(); i++) {
			//deal to each player
			tournamentPlayers.get(i).addCard(Advent.draw());
		}
		
		//Player.add(CurrentPlayer);
		
		//if only 1 person, award 1+ bonus shields
		if(tournamentPlayers.size() == 1) {
			tournamentPlayers.get(0).addShields(1 + ((Tournament_Card)ObjectiveCard).getBonus_Shields()); //getBonus_Shields?
		}
		
		//ask players playing to click cards he wants to use
		//discard cards that have been played
		for(int i = 0; i < tournamentPlayers.size(); i++) {
			//Played = view.SelectCards(CurrentPlayer);\
			//add each clicked card to specific player's total battle points
			//tournamentPlayers.get(i).discard();
			
		}
		
		//compare bp points
		for(int i = 0; i < tournamentPlayers.size(); i++) {
			//compare bp points between each Tournament player
			// Highest wins players.size + bonus Shield
			//if tie; start new tournament where second attempt is true
			//if tie again both win the players.size + bonus Shield
		}

	}
	

	/*
	 * Callback handler to control view
	 */
	public void setViewHandler(IViewCallback viewHandler) {
		this.viewHandler = viewHandler;
	}

	public void doneClicked() {
		// TODO Auto-generated method stub
		
	}

	public Player getCurrentPlayer() {
		return CurrentPlayer;
	}
	
	/*
	 * If card of current player is invoked this method will be called.
	 */
	public void playerCardSelected(Cards selectedCard, int cardNumber) {
		// TODO Auto-generated method stub
		
		gCard = false;
		iCard.add(selectedCard);
		
	}
		
	public ArrayList<Cards> SelectCards(){
			while (gCard = true) {
				if (iCard!= null) {
					//copy it
					ArrayList<Cards> tempCard = iCard;
					iCard.clear();
				
						gCard = true;
					return tempCard;
				}
			}
			return null;
		}
		
		
		

	public void otherPlayerCardSelected() {
		// TODO Auto-generated method stub
	
	}

	public void addShieldBtnClick(Player player) {
		// TODO Auto-generated method stub
	}
	
	
	
	
}
