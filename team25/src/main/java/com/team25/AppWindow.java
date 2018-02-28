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
		 adventureLabel.setBounds(667, 212, 117, 16);
			adventureLabel.setForeground(Color.ORANGE);
			frame.getContentPane().add(adventureLabel);
			
			JLabel storyLabel = new JLabel("Story Deck");
			storyLabel.setBounds(982, 212, 117, 16);
			storyLabel.setForeground(Color.ORANGE);
			frame.getContentPane().add(storyLabel);
		
		
		 
		JButton lblNewLabel = new JButton("Adventure cards");
		lblNewLabel.setBounds(663, 307, 130, 180);
		lblNewLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}		
		});
		
		frame.getContentPane().add(lblNewLabel);
Image img = new ImageIcon(this.getClass().getResource("/Cards/Card2.jpg")).getImage();
		
lblNewLabel.setIcon(new ImageIcon(img));
		
		JButton label = new JButton("Story cards");
		label.setBounds(936, 307, 130, 180);
		label.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		frame.getContentPane().add(label);
		
		Image img2 = new ImageIcon(this.getClass().getResource("/Cards/Card1.png")).getImage();
		
		label.setIcon(new ImageIcon(img2));
		
		JButton button = new JButton("Story cards");
		button.setBounds(6, 743, 130, 180);
		frame.getContentPane().add(button);
		
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
		
		playerCards[0][0] = new JButton("Story cards");
		playerCards[0][0].setBounds(26, 6, 130, 180);
		frame.getContentPane().add(playerCards[0][0]);
		playerCards[0][0].addActionListener(this);
		
		playerCards[0][1] = new JButton("Story cards");
		playerCards[0][1].setBounds(135, 743, 130, 180);
		frame.getContentPane().add(playerCards[0][1]);
		
		playerCards[0][2] = new JButton("Story cards");
		playerCards[0][2].setBounds(266, 743, 130, 180);
		frame.getContentPane().add(playerCards[0][2]);
		
		playerCards[0][3] = new JButton("Story cards");
		playerCards[0][3].setBounds(393, 743, 130, 180);
		frame.getContentPane().add(playerCards[0][3]);
		
		playerCards[0][4] = new JButton("Story cards");
		playerCards[0][4].setBounds(521, 743, 130, 180);
		frame.getContentPane().add(playerCards[0][4]);
		
		playerCards[0][5] = new JButton("Story cards");
		playerCards[0][5].setBounds(644, 743, 130, 180);
		frame.getContentPane().add(playerCards[0][5]);
		
		
		playerCards[0][6] = new JButton("Story cards");
		playerCards[0][6].setBounds(774, 743, 130, 180);
		frame.getContentPane().add(playerCards[0][6]);
		
		playerCards[0][7] = new JButton("Story cards");
		playerCards[0][7].setBounds(904, 743, 130, 180);
		frame.getContentPane().add(playerCards[0][7]);
		
		playerCards[0][8] = new JButton("Story cards");
		playerCards[0][8].setBounds(1035, 743, 130, 180);
		frame.getContentPane().add(playerCards[0][8]);
		
		playerCards[0][9] = new JButton("Story cards");
		playerCards[0][9].setBounds(1161, 743, 130, 180);
		frame.getContentPane().add(playerCards[0][9]);
		
		playerCards[0][10] = new JButton("Story cards");
		playerCards[0][10].setBounds(1290, 743, 130, 180);
		frame.getContentPane().add(playerCards[0][10]);
		
		playerCards[0][11] = new JButton("Story cards");
		playerCards[0][11].setBounds(1419, 743, 130, 180);
		frame.getContentPane().add(playerCards[0][11]);
		
		
		playerCards[1][0] = new JButton("Story cards");
		playerCards[1][0].setBounds(155, 6, 130, 180);
		frame.getContentPane().add(playerCards[1][0]);
		
		playerCards[1][1] = new JButton("Story cards");
		playerCards[1][1].setBounds(282, 6, 130, 180);
		frame.getContentPane().add(playerCards[1][1]);
		
		playerCards[1][2] = new JButton("Story cards");
		playerCards[1][2].setBounds(410, 6, 130, 180);
		frame.getContentPane().add(playerCards[1][2]);
		
		playerCards[1][3] = new JButton("Story cards");
		playerCards[1][3].setBounds(533, 6, 130, 180);
		frame.getContentPane().add(playerCards[1][3]);
		
		playerCards[1][4] = new JButton("Story cards");
		playerCards[1][4].setBounds(663, 6, 130, 180);
		frame.getContentPane().add(playerCards[1][4]);
		
		//playerCards[1][4]
		
		JButton button_19 = new JButton("Story cards");
		button_19.setBounds(793, 6, 130, 180);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("Story cards");
		button_20.setBounds(924, 6, 130, 180);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("Story cards");
		button_21.setBounds(1050, 6, 130, 180);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("Story cards");
		button_22.setBounds(1179, 6, 130, 180);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("Story cards");
		button_23.setBounds(1308, 6, 130, 180);
		frame.getContentPane().add(button_23);
		
		JButton button_24 = new JButton("Story cards");
		button_24.setBounds(1439, 6, 130, 180);
		frame.getContentPane().add(button_24);
		
		JButton button_12 = new JButton("Story cards");
		button_12.setBounds(38, 223, 130, 180);
		frame.getContentPane().add(button_12);
		
		JButton button_25 = new JButton("Story cards");
		button_25.setBounds(167, 223, 130, 180);
		frame.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("Story cards");
		button_26.setBounds(294, 223, 130, 180);
		frame.getContentPane().add(button_26);
		
		JButton button_27 = new JButton("Story cards");
		button_27.setBounds(422, 223, 130, 180);
		frame.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("Story cards");
		button_28.setBounds(545, 223, 130, 180);
		frame.getContentPane().add(button_28);
		
		JButton button_29 = new JButton("Story cards");
		button_29.setBounds(675, 223, 130, 180);
		frame.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("Story cards");
		button_30.setBounds(805, 223, 130, 180);
		frame.getContentPane().add(button_30);
		
		JButton button_31 = new JButton("Story cards");
		button_31.setBounds(936, 223, 130, 180);
		frame.getContentPane().add(button_31);
		
		JButton button_32 = new JButton("Story cards");
		button_32.setBounds(1062, 223, 130, 180);
		frame.getContentPane().add(button_32);
		
		JButton button_33 = new JButton("Story cards");
		button_33.setBounds(1191, 223, 130, 180);
		frame.getContentPane().add(button_33);
		
		JButton button_34 = new JButton("Story cards");
		button_34.setBounds(1320, 223, 130, 180);
		frame.getContentPane().add(button_34);
		
		JButton button_35 = new JButton("Story cards");
		button_35.setBounds(1451, 223, 130, 180);
		frame.getContentPane().add(button_35);
		
		JButton button_36 = new JButton("Story cards");
		button_36.setBounds(6, 490, 130, 180);
		frame.getContentPane().add(button_36);
		
		JButton button_37 = new JButton("Story cards");
		button_37.setBounds(135, 490, 130, 180);
		frame.getContentPane().add(button_37);
		
		JButton button_38 = new JButton("Story cards");
		button_38.setBounds(262, 490, 130, 180);
		frame.getContentPane().add(button_38);
		
		JButton button_39 = new JButton("Story cards");
		button_39.setBounds(390, 490, 130, 180);
		frame.getContentPane().add(button_39);
		
		JButton button_40 = new JButton("Story cards");
		button_40.setBounds(513, 490, 130, 180);
		frame.getContentPane().add(button_40);
		
		JButton button_41 = new JButton("Story cards");
		button_41.setBounds(643, 490, 130, 180);
		frame.getContentPane().add(button_41);
		
		JButton button_42 = new JButton("Story cards");
		button_42.setBounds(773, 490, 130, 180);
		frame.getContentPane().add(button_42);
		
		JButton button_43 = new JButton("Story cards");
		button_43.setBounds(904, 490, 130, 180);
		frame.getContentPane().add(button_43);
		
		JButton button_44 = new JButton("Story cards");
		button_44.setBounds(1030, 490, 130, 180);
		frame.getContentPane().add(button_44);
		
		JButton button_45 = new JButton("Story cards");
		button_45.setBounds(1159, 490, 130, 180);
		frame.getContentPane().add(button_45);
		
		playerCards[0][11] = new JButton("Story cards");
		playerCards[0][11].setBounds(1288, 490, 130, 180);
		frame.getContentPane().add(playerCards[0][11]);
		
		playerCards[0][11] = new JButton("Story cards");
		playerCards[0][11].setBounds(1419, 490, 130, 180);
		frame.getContentPane().add(playerCards[0][11]);
		
		
		
		
		
		
		
		
		
		JButton btnDoneTurn = new JButton("Done Turn");
		btnDoneTurn.setBounds(236, 419, 117, 29);
		frame.getContentPane().add(btnDoneTurn);
		
		JButton btnAddShield = new JButton("Add shield");
		btnAddShield.setBounds(403, 419, 117, 29);
		frame.getContentPane().add(btnAddShield);
		
		 lblStage = new JLabel("Stage 1");
		lblStage.setBounds(1134, 408, 61, 16);
		frame.getContentPane().add(lblStage);
		
		 lblStage_1 = new JLabel("Stage 2");
		lblStage_1.setBounds(1216, 408, 61, 16);
		frame.getContentPane().add(lblStage_1);
		
		 lblStage_2 = new JLabel("Stage 3");
		lblStage_2.setBounds(1289, 408, 61, 16);
		frame.getContentPane().add(lblStage_2);
		
		 lblStage_3 = new JLabel("Stage 4");
		lblStage_3.setBounds(1377, 408, 61, 16);
		frame.getContentPane().add(lblStage_3);
		
		 lblStage_4 = new JLabel("Stage 5");
		lblStage_4.setBounds(1461, 408, 61, 16);
		frame.getContentPane().add(lblStage_4);
		
		 button_1 = new JButton("Stage card 1");
		button_1.setBounds(1089, 436, 130, 180);
		frame.getContentPane().add(button_1);
		
		 button_2 = new JButton("Stage card 2");
		button_2.setBounds(1220, 436, 130, 180);
		frame.getContentPane().add(button_2);
		
		 button_3 = new JButton("Stage card 3");
		button_3.setBounds(1340, 436, 130, 180);
		frame.getContentPane().add(button_3);
		
		 button_4 = new JButton("Stage card 4");
		button_4.setBounds(1471, 436, 130, 180);
		frame.getContentPane().add(button_4);
		
		 button_5 = new JButton("Stage card 5");
		button_5.setBounds(1548, 436, 130, 180);
		frame.getContentPane().add(button_5);
		
		 player1RankCard = new JButton("Story cards");
		player1RankCard.setBounds(1289, 598, 123, 148);
		frame.getContentPane().add(player1RankCard);
		
		 player2RankCard = new JButton("Story cards");
		player2RankCard.setBounds(1424, 598, 123, 148);
		frame.getContentPane().add(player2RankCard);
		
		 player3RankCard = new JButton("Story cards");
		player3RankCard.setBounds(1299, 769, 123, 148);
		frame.getContentPane().add(player3RankCard);
		
		 player4RankCard = new JButton("Story cards");
		player4RankCard.setBounds(1439, 769, 123, 148);
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
		
		
		
		
		
		