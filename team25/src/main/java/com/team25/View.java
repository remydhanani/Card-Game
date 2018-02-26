package com.team25;

import java.awt.Color;

import java.awt.image.*;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

import java.awt.Image;
import javax.swing.JPanel;
import java.awt.Panel;

public class View {

		JFrame frame;
		private int players=2;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						View window = new View();
						window.frame.setVisible(true);
							
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public View() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			
			frame = new JFrame();
			frame.getContentPane().setBackground(new Color(0, 128, 0));
			frame.setBounds(1500, 800, 1500, 800);
			
			
			Button button = new Button("EXIT");
			button.setBounds(6, 230, 111, 88);
			button.setForeground(Color.ORANGE);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			frame.getContentPane().setLayout(null);
			
			frame.getContentPane().add(button);
			//button.setBackground(new Color(128,0,0));
			
			JButton btnPlay = new JButton("PLAY");
			btnPlay.setBounds(6, 110, 111, 88);
			btnPlay.setForeground(Color.ORANGE);
			btnPlay.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					String playerStr = JOptionPane.showInputDialog("Enter Number of Players"
							+ " (2 to 4)");
					if(playerStr.matches("[0-9]+")) {
						players = Integer.parseInt(playerStr);
						if(players <=4 && players>=2) {
							AppWindow newapp = new AppWindow(players);
							
						}else {
							JOptionPane.showMessageDialog(frame, "Players should be between 2 and 4", "Dialog", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
			});
			
			frame.getContentPane().setLayout(null);
			frame.getContentPane().add(btnPlay);
		
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(0, 0, 1500, 800);
			frame.getContentPane().add(lblNewLabel_1);
			frame.setBounds(1500, 800, 1500, 800);
			//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	Image img = new ImageIcon(this.getClass().getResource("/Cards/start-1.png")).getImage();
			
			lblNewLabel_1.setIcon(new ImageIcon(img));
			
			
		}
	}


/*
 * each player random 12 cards adventure deck.
 * when cards are dealt if any player has amour card 8 cards in total in the deck then face up next to rank card
 * player in turn clicks on story deck and top card is displayed from story deck .
 * player in turn dialog display 
 * if quest card 
 * 	player who got the quest card sponsor or no
 *  if quest card ask player in turn if sponsoring if yes....if no ask next and if all player say sponsor then discard card.
 *  If yes then setup
 *  
 *  Setup:- number of stages hard code or user input. sponser setup each stage.
 *  battle points in increasing order for stages. Only one test in all stages can be placed in any stage no order required. Weapon cards only with foe cards. all face down. 
 *  no two same weapon use.
 * 
 * each card displayed for player in turn hand cards.:input box 0,1,2,3 0 for in hand 1 for stage 1, 2 for stange two soo on... for each card in hand of player.
 * 
 * ask other player if playing quest or not. if no then Quest card and stage setup cards of sponsor get discarded in adventure card discard. 
 * End of Quest sponsor draws number cards = discarded + number of stages. and if more than 12 in hand then discard any number to have only 12.
 * if yes players play quest then .... each player playing gets 1 adventure card beginning of each stage. 
 * each stage the sponsor tells if foe or test 
 *   if foe  on the stage then player playing will put down weapon amour and/or ally card + rank (minimum battle points)
 *    (beating the foe match or exceed battle points you dont know the battle points of the foe given by sponsor) no two same weapon at same time. 
 *    any number of ally cards or/and weapon cards can be played. the ally cards after quest of over placed face up next to rank card don't discard after quest.
 *    one amour per quest and that amour discard after quest.end of each stage discard weapon cards used in the stage by players. 
 *    Everyone has to defeat the foe one at a time.
 *    keep your cards to fight foe face down. reaveal once all players have played and then 
 *    whoevers battle points exceed or match the foe of spnosor, you win and next stage else loose out of quest.
 *    
 *    
 *    
 *   
 *   if test card on the stage 
 *     bid is number of cards player wants to discard to win. player 2 have to bid more than player 1. else he is out of quest. 
 *     if ally or amour cards has free bids then those many fewer are discarded. 
 *     if only one player for test card stage then 1. if no bid on test card then must bid 3
 *     if bid given make minimum bid / match it. 
 *     
 *   If quest won by player then shield = number of stages passed. 
 *   
 *   All players discard all adventure cards except ally cards in discard of deck. and discard story cards. 
 *   
 *   Only sponsorer draws cards after end of quest which is number of stages + his used cards. 
 * 
 * 
 * modred foe card if i spnsor i can use in quest as a regular foe also use to make others discapr their ally card acn be played out of turn.
 * participant in quest/ toronament can play mordered card to make other player discard ally card (you choose ally card to discard) and discard discard mordird
 * 
 * 
 * 
1. shield count and rank make new class
1.
3. player in turn clicks on story deck and top card is drawn.
Condition end of turn player hand only 12 cards 
weapon , ally , foe , rank, amour has battle points


Person who sponsors the quest
Quest card = stages 
each stage limit 1 foe or 1 test or 1 foe + weapon and no same weapon no limit on number weapons the sponsor can use. Cards are arranged with battle points increase. Only one test card can be played throughtout the quest

after spnosor and cards setup (Quest setup) dialog box for each player other to accept the quest or not.

no turn if player input no to quest.

before start of each stage of quest participants gets one card from adventure deck. Sponsor not a participant.
each stage of Quest dialog box for Foe or test card given by sponsor for that stage.(state test of foe card before the stage begins).

redo shield conditions
after 5 shield = knight then start from 0 to 7 for champion knight and 0-10 for knight of round table and if you have 6 then 5 discard and 1 adds to the next knight to champion knight shield pile

(Ally cards removed only by mordered card or event card)


*/



