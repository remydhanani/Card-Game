package com.team25;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.team25.Cards.Ally_Card;
import com.team25.Cards.Cards;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Window;

public class AppWindow implements IViewCallback, ActionListener {

	private JFrame frame;
	private int totalPlayers;
	private ArrayList<Player> players = new ArrayList();
	private Map<String, Boolean> playerNames;
	private Controller controller;
	private JLabel[] playerLbl;
	private JButton[][] playerCards;
	private int TOTAL_PLAYER_CARDS = 12;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JLabel lblStage_4;
	private JLabel lblStage_3;
	private JLabel lblStage_2;
	private JLabel lblStage_1;
	private JLabel lblStage;
	private JButton player4RankCard;
	private JButton player3RankCard;
	private JButton player2RankCard;
	private JButton player1RankCard;
	
	/**
	 * Launch the application.
	 * @param players 
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWindow window = new AppWindow(2, new HashMap());
					window.frame.setVisible(true);
					//window.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					//window.frame.getContentPane().add(new JLabel(new ImageIcon("/Cards/background.jpg")));
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param players 
	 * @param name 
	 */
	public AppWindow(int players, Map<String, Boolean> name) {
		this.totalPlayers = players;
		this.playerNames = name;
		playerLbl = new JLabel[4];
		playerCards = new JButton[4][];
		playerCards[0] = new JButton[12];
		playerCards[1] = new JButton[12];
		playerCards[2] = new JButton[12];
		playerCards[3] = new JButton[12];
		initialize();
		frame.setVisible(true);
		frame.getMaximumSize();
		frame.setBounds(0, 0, 2000, 1000);
		JOptionPane.showMessageDialog(frame, "All players are Squire", "Dialog", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(frame, "Click on Adventure Deck to deal", "Dialog", JOptionPane.INFORMATION_MESSAGE);
		//adventureDeck.create();
		//adventureDeck.shuffle();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		players = new ArrayList();
		int i = 0;
		for(Map.Entry<String,Boolean> entry : playerNames.entrySet()) {
			Player player = new Player();
			player.setName(entry.getKey());
			player.setBot(entry.getValue());
			player.setPlayerId(i++);
			players.add(player);
		}
		
		controller = new Controller();
		controller.setViewHandler(this);
		//controller.SetUpGame(players);
		
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(new Color(0, 128, 0));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().setLayout(null);
		
		 JLabel adventureLabel = new JLabel("Adventure Deck");
		 adventureLabel.setBounds(517, 158, 117, 16);
			adventureLabel.setForeground(Color.ORANGE);
			frame.getContentPane().add(adventureLabel);
			
			JLabel storyLabel = new JLabel("Story Deck");
			storyLabel.setBounds(675, 158, 117, 16);
			storyLabel.setForeground(Color.ORANGE);
			frame.getContentPane().add(storyLabel);
		
		
		 
		JButton lblNewLabel = new JButton("Adventure cards");
		lblNewLabel.setBounds(521, 186, 130, 180);
		lblNewLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}		
		});
		
		frame.getContentPane().add(lblNewLabel);
Image img = new ImageIcon(this.getClass().getResource("/Cards/Card2.jpg")).getImage();
		
lblNewLabel.setIcon(new ImageIcon(img));
		
		JButton label = new JButton("Story cards");
		label.setBounds(663, 186, 130, 180);
		label.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		}); 
		frame.getContentPane().add(label);
		
		Image img2 = new ImageIcon(this.getClass().getResource("/Cards/Card1.png")).getImage();
		
		label.setIcon(new ImageIcon(img2));
		
		/*JButton button = new JButton("Story cards");
		button.setBounds(6, 743, 130, 180);
		frame.getContentPane().add(button); */
		
		playerLbl[0] = new JLabel("Player1");
		playerLbl[0].setBounds(26, 694, 61, 16);
		frame.getContentPane().add(playerLbl[0]);
		
		playerLbl[1] = new JLabel("Player3");
		playerLbl[1].setBounds(231, 404, 61, 16);
		frame.getContentPane().add(playerLbl[1]);
		
		playerLbl[2] = new JLabel("Player4");
		playerLbl[2].setBounds(784, 193, 61, 16);
		frame.getContentPane().add(playerLbl[2]);
		
		playerLbl[3] = new JLabel("Player2");
		playerLbl[3].setBounds(1220, 462, 61, 16);
		frame.getContentPane().add(playerLbl[3]);
		
		setupLabelNames();
		
		
		JButton button_1 = new JButton("ADV 1");
		button_1.setBounds(175, 6, 80, 120);
		frame.getContentPane().add(button_1);
		button_1.addActionListener(this);
		
		JButton button_2 = new JButton("ADV 2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(247, 6, 80, 120);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("ADV 3");
		button_3.setBounds(325, 6, 80, 120);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("ADV 4");
		button_4.setBounds(402, 6, 80, 120);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("ADV 5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setBounds(478, 6, 80, 120);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("ADV 6");
		button_6.setBounds(554, 6, 80, 120);
		frame.getContentPane().add(button_6);
		
		
		JButton button_7 = new JButton("ADV 7");
		button_7.setBounds(627, 6, 80, 120);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("ADV 8");
		button_8.setBounds(705, 6, 80, 120);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("ADV 9");
		button_9.setBounds(777, 6, 80, 120);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("ADV 10");
		button_10.setBounds(847, 6, 80, 120);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("ADV 11");
		button_11.setBounds(919, 6, 80, 120);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("ADV 12");
		button_12.setBounds(996, 6, 80, 120);
		frame.getContentPane().add(button_12);
		
		
		JButton button_13 = new JButton("ADV 13");
		button_13.setBounds(0, 74, 80, 120);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("ADV 14");
		button_14.setBounds(0, 186, 80, 120);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("ADV 15");
		button_15.setBounds(0, 298, 80, 120);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("ADV 16");
		button_16.setBounds(0, 408, 80, 120);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("ADV 17");
		button_17.setBounds(0, 510, 80, 120);
		frame.getContentPane().add(button_17);
		
		//playerCards[1][4]
		
		JButton button_18 = new JButton("ADV 18");
		button_18.setBounds(0, 623, 80, 120);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("ADV 19");
		button_19.setBounds(76, 74, 80, 120);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("ADV 20");
		button_20.setBounds(76, 186, 80, 120);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("ADV 21");
		button_21.setBounds(76, 298, 80, 120);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("ADV 22");
		button_22.setBounds(76, 408, 80, 120);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("ADV 23");
		button_23.setBounds(76, 523, 80, 120);
		frame.getContentPane().add(button_23);
		
		JButton button_24 = new JButton("ADV 24");
		button_24.setBounds(76, 639, 80, 120);
		frame.getContentPane().add(button_24);
		
		/*JButton button_24 = new JButton("Story 24");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_24.setBounds(1032, 182, 90, 140);
		frame.getContentPane().add(button_24);*/
		
		JButton button_25 = new JButton("ADV 25");
		button_25.setBounds(1188, 61, 80, 120);
		frame.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("ADV 26");
		button_26.setBounds(1188, 167, 80, 120);
		frame.getContentPane().add(button_26);
		
		JButton button_27 = new JButton("ADV 27");
		button_27.setBounds(1188, 281, 80, 120);
		frame.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("ADV 28");
		button_28.setBounds(1188, 397, 80, 120);
		frame.getContentPane().add(button_28);
		
		JButton button_29 = new JButton("ADV 29");
		button_29.setBounds(1188, 510, 80, 120);
		frame.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("ADV 30");
		button_30.setBounds(1188, 623, 80, 120);
		frame.getContentPane().add(button_30);
		
		JButton button_31 = new JButton("ADV 31");
		button_31.setBounds(1108, 61, 80, 120);
		frame.getContentPane().add(button_31);
		
		/*JButton button_32 = new JButton("ADV 32");
		button_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_32.setBounds(1108, 167, 80, 120);
		frame.getContentPane().add(button_32);*/
		
		JButton button_32 = new JButton("ADV 32");
		button_32.setBounds(1108, 167, 80, 120);
		frame.getContentPane().add(button_32);
		
		JButton button_33 = new JButton("ADV 33");
		button_33.setBounds(1108, 281, 80, 120);
		frame.getContentPane().add(button_33);
		
		JButton button_34 = new JButton("ADV 34");
		button_34.setBounds(1108, 397, 80, 120);
		frame.getContentPane().add(button_34);
		
		JButton button_35 = new JButton("ADV 35");
		button_35.setBounds(1108, 510, 80, 120);
		frame.getContentPane().add(button_35);
		
		JButton button_36 = new JButton("ADV 36");
		button_36.setBounds(1108, 623, 80, 120);
		frame.getContentPane().add(button_36);
		
		JButton button_37 = new JButton("ADV 37");
		button_37.setBounds(211, 639, 80, 120);
		frame.getContentPane().add(button_37);
		
		JButton button_38 = new JButton("ADV 38");
		button_38.setBounds(286, 639, 80, 120);
		frame.getContentPane().add(button_38);
		
		JButton button_39 = new JButton("ADV 39");
		button_39.setBounds(365, 639, 80, 120);
		frame.getContentPane().add(button_39);
		
		JButton button_40 = new JButton("ADV 40");
		button_40.setBounds(443, 639, 80, 120);
		frame.getContentPane().add(button_40);
		
		JButton button_41 = new JButton("ADV 41");
		button_41.setBounds(521, 639, 80, 120);
		frame.getContentPane().add(button_41);
		
		JButton button_42 = new JButton("ADV 42");
		button_42.setBounds(599, 639, 80, 120);
		frame.getContentPane().add(button_42);
		
		JButton button_43 = new JButton("ADV 43");
		button_43.setBounds(675, 639, 80, 120);
		frame.getContentPane().add(button_43);
		
		JButton button_44 = new JButton("ADV 44");
		button_44.setBounds(752, 639, 80, 120);
		frame.getContentPane().add(button_44);
		
		JButton button_45 = new JButton("ADV 45");
		button_45.setBounds(829, 639, 80, 120);
		frame.getContentPane().add(button_45);
		
		JButton button_46 = new JButton("ADV 46");
		button_46.setBounds(906, 639, 80, 120);
		frame.getContentPane().add(button_46);
		
		JButton button_47 = new JButton("ADV 47");
		button_47.setBounds(981, 639, 80, 120);
		frame.getContentPane().add(button_47);

		
		JButton btnDoneTurn = new JButton("Done Turn");
		btnDoneTurn.setBounds(379, 250, 117, 29);
		frame.getContentPane().add(btnDoneTurn);
		
		JButton btnAddShield = new JButton("Add shield");
		btnAddShield.setBounds(379, 298, 117, 29);
		frame.getContentPane().add(btnAddShield);
		
		 lblStage = new JLabel("Stage 1");
		lblStage.setBounds(423, 523, 90, 140);
		frame.getContentPane().add(lblStage);
		
		 lblStage_1 = new JLabel("Stage 2");
		lblStage_1.setBounds(813, 321, 90, 140);
		frame.getContentPane().add(lblStage_1);
		
		 lblStage_2 = new JLabel("Stage 3");
		lblStage_2.setBounds(1289, 408, 90, 140);
		frame.getContentPane().add(lblStage_2);
		
		 lblStage_3 = new JLabel("Stage 4");
		lblStage_3.setBounds(1377, 408, 90, 140);
		frame.getContentPane().add(lblStage_3);
		
		 lblStage_4 = new JLabel("Stage 5");
		lblStage_4.setBounds(1461, 408, 90, 140);
		frame.getContentPane().add(lblStage_4);
		
		 button_1 = new JButton("Stage card 1");
		button_1.setBounds(366, 422, 90, 140);
		frame.getContentPane().add(button_1);
		
		 button_2 = new JButton("Stage card 2");
		button_2.setBounds(453, 422, 90, 140);
		frame.getContentPane().add(button_2);
		
		/* button = new JButton("Stage card 3");
		 button.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	}
		 });
		button.setBounds(559, 420, 99, 128);
		frame.getContentPane().add(button);*/
		
		 button_3 = new JButton("Stage card 3");
			button_3.setBounds(540, 422, 90, 140);
			frame.getContentPane().add(button_3);
		
		 button_4 = new JButton("Stage card 4");
		button_4.setBounds(627, 422, 90, 140);
		frame.getContentPane().add(button_4);
		
		 button_5 = new JButton("Stage card 5");
		button_5.setBounds(711, 422, 90, 140);
		frame.getContentPane().add(button_5);
		
		player1RankCard = new JButton("Player1 Rank");
		player1RankCard.setBounds(820, 130, 107, 129);
		frame.getContentPane().add(player1RankCard);
		
		 player2RankCard = new JButton("Player2 Rank");
		player2RankCard.setBounds(164, 294, 107, 129);
		frame.getContentPane().add(player2RankCard);
		
		 player3RankCard = new JButton("Player3 Rank");
		player3RankCard.setBounds(820, 490, 107, 129);
		frame.getContentPane().add(player3RankCard);
		
		 player4RankCard = new JButton("Player4 Rank");
		player4RankCard.setBounds(981, 294, 107, 129);
		frame.getContentPane().add(player4RankCard);

		
		lblStage.setVisible(false);
		lblStage_1.setVisible(false);
		lblStage_2.setVisible(false);
		lblStage_3.setVisible(false);
		lblStage_4.setVisible(false);
		
		button_1.setVisible(false);
		button_2.setVisible(false);
		button_3.setVisible(false);
		button_4.setVisible(false);
		button_5.setVisible(false);
		
		
		btnAddShield.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String playerStr = JOptionPane.showInputDialog("Enter player name: ");
				for(int i=0;i<players.size();i++) {
					if(players.get(i).getName().equalsIgnoreCase(playerStr)) {
						controller.addShieldBtnClick(players.get(i));
						return;
					}
				}
				JOptionPane.showMessageDialog(frame, "Please Enter valid player name", "Dialog", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		btnDoneTurn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				controller.doneClicked();
			}
		});
		
		
		//JLabel lblNewLabel_1 = new JLabel("New label");
		//lblNewLabel_1.setBounds(0, 0, 1500, 800);
		//lblNewLabel_1.setForeground(Color.ORANGE);
		//frame.getContentPane().add(lblNewLabel_1);
		//Image img3 = new ImageIcon(this.getClass().getResource("/Cards/background.jpg")).getImage();
		//blNewLabel_1.setIcon(new ImageIcon(img3));

		
		
	}

	private void setupLabelNames() {
		int i=0;
		for(Player temp : players) {
			playerLbl[i++].setText(temp.getName());
		}
	}

	public void displayPlayerCards(Player player) {
		for(Player temp: players) {
			if(temp.getPlayerId() == player.getPlayerId()) {
				ArrayList<Cards> cards = player.getHand();
				for(int i=0;i<TOTAL_PLAYER_CARDS ;i++) {
					Image img = new ImageIcon(this.getClass().getResource(cards.get(i).getPicture())).getImage();
					playerCards[player.getPlayerId()][i].setIcon(new ImageIcon(img));
				}
			}else {
				hidePlayerCards(temp);
			}
		}
	}
	
	public void hidePlayerCards(Player player) {
		for(int i=0;i<TOTAL_PLAYER_CARDS ;i++) {
			Image img = new ImageIcon(this.getClass().getResource("Cards/download.jpeg")).getImage();
			playerCards[player.getPlayerId()][i].setIcon(new ImageIcon(img));
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		boolean currPlayerBtn = false;
		for(int i=0;!currPlayerBtn && i<TOTAL_PLAYER_CARDS;i++) {
			if(playerCards[controller.getCurrentPlayer().getPlayerId()][i] == arg0.getSource()) {
				currPlayerBtn = true;
				controller.playerCardSelected(controller.getCurrentPlayer().getHand().get(i), i);
			}
		}
		if(!currPlayerBtn)
			controller.otherPlayerCardSelected();
	}

	public void showStages(int number) {
		
		if(number>=1) {
			lblStage.setVisible(true);
			button_1.setVisible(true);
		}
		
		if(number>=2) {
			lblStage_1.setVisible(true);
			button_2.setVisible(true);
		}
		
		if(number>=3) {
			lblStage_2.setVisible(true);
			button_3.setVisible(true);
		}
		
		if(number>=4) {
			lblStage_3.setVisible(true);
			button_4.setVisible(true);
		}
		
		if(number>=5) {
			lblStage_4.setVisible(true);
			button_5.setVisible(true);
		}
	}

	public void showRankCard(Player player, String rankImg) {
		Image img = new ImageIcon(this.getClass().getResource(rankImg)).getImage();
		if(player.getPlayerId() == 0) {
			player1RankCard.setIcon(new ImageIcon(img));
		} else if(player.getPlayerId() == 1) {
			player2RankCard.setIcon(new ImageIcon(img));
		} else if(player.getPlayerId() == 2) {
			player3RankCard.setIcon(new ImageIcon(img));
		} else if(player.getPlayerId() == 3) {
			player4RankCard.setIcon(new ImageIcon(img));
		}//done 2 min ok
	}
	
}
		
		
		
		
		
		