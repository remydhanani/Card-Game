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
	//private JButton playerCards[3][0];
	private JButton button_2;
	private JButton button_1;
	private JButton button_3;
	private JButton button_4;
	private JButton player4RankCard;
	private JButton player3RankCard;
	private JButton player2RankCard;
	private JButton player1RankCard;
	private JButton btnTournamentCards;
	private JButton btnTournamentCards_1;
	private JLabel lblStage_4;
	private JLabel lblStage_3;
	private JLabel lblStage_2;
	private JLabel lblStage_1;
	private JLabel lblStage;
	private JButton button_48;
	private JButton button_49;
	private JButton btnTournamentCards_2;
	private JButton btnTournamentCards_3;
	private JButton button_5;
	private JLabel lblPlayer_1;
	private JLabel lblPlayer_2;
	private JLabel lblPlayer_3;
	private JLabel lblPlayer;
	
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
		//JOptionPane.showMessageDialog(frame, "Click on Adventure Deck to deal", "Dialog", JOptionPane.INFORMATION_MESSAGE);
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
			
			JLabel storyLabel = new JLabel("Story Deck");
			storyLabel.setBounds(590, 320, 117, 16);
			storyLabel.setForeground(Color.ORANGE);
			frame.getContentPane().add(storyLabel);
Image img = new ImageIcon(this.getClass().getResource("/Cards/Card2.jpg")).getImage();
		
		JButton label = new JButton("Story cards");
		label.setBounds(590, 348, 130, 180);
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
		playerLbl[0].setBounds(614, 711, 61, 16);
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
				
		playerCards[2][0] = new JButton("ADV 1");
		playerCards[2][0].setBounds(175, 6, 80, 120);
		frame.getContentPane().add(playerCards[2][0]);
		playerCards[2][0].addActionListener(this);
		
		 playerCards[2][1] = new JButton("ADV 2");
		
		playerCards[2][1].setBounds(247, 6, 80, 120);
		frame.getContentPane().add(playerCards[2][1]);
		
		playerCards[2][2] = new JButton("ADV 3");
		playerCards[2][2].setBounds(325, 6, 80, 120);
		frame.getContentPane().add(playerCards[2][2]);
		
		playerCards[2][3] = new JButton("ADV 4");
		playerCards[2][3].setBounds(402, 6, 80, 120);
		frame.getContentPane().add(playerCards[2][3]);
		
		playerCards[2][4] = new JButton("ADV 5");
		playerCards[2][4].setBounds(478, 6, 80, 120);
		frame.getContentPane().add(playerCards[2][4]);
		
		playerCards[2][5] = new JButton("ADV 6");
		playerCards[2][5].setBounds(554, 6, 80, 120);
		frame.getContentPane().add(playerCards[2][5]);
		
		
		 playerCards[2][6] = new JButton("ADV 7");
		playerCards[2][6].setBounds(627, 6, 80, 120);
		frame.getContentPane().add(playerCards[2][6]);
		
		playerCards[2][7] = new JButton("ADV 8");
		playerCards[2][7].setBounds(705, 6, 80, 120);
		frame.getContentPane().add(playerCards[2][7]);
		
		playerCards[2][8] = new JButton("ADV 9");
		playerCards[2][8].setBounds(777, 6, 80, 120);
		frame.getContentPane().add(playerCards[2][8]);
		
		 playerCards[2][9] = new JButton("ADV 10");
		playerCards[2][9].setBounds(847, 6, 80, 120);
		frame.getContentPane().add(playerCards[2][9]);
		
		 playerCards[2][10] = new JButton("ADV 11");
		playerCards[2][10].setBounds(919, 6, 80, 120);
		frame.getContentPane().add(playerCards[2][10]);
		
		 playerCards[2][11] = new JButton("ADV 12");
		playerCards[2][11].setBounds(996, 6, 80, 120);
		frame.getContentPane().add(playerCards[2][11]);
		
		
		 playerCards[1][11] = new JButton("ADV 13");
		playerCards[1][11].setBounds(0, 74, 80, 120);
		frame.getContentPane().add(playerCards[1][11]);
		

		playerCards[1][0] = new JButton("ADV 14");
		playerCards[1][0].setBounds(0, 186, 80, 120);
		frame.getContentPane().add(playerCards[1][0]);
		
		 playerCards[1][1] = new JButton("ADV 15");
		playerCards[1][1].setBounds(0, 298, 80, 120);
		frame.getContentPane().add(playerCards[1][1]);
		
		 playerCards[1][2] = new JButton("ADV 16");
		playerCards[1][2].setBounds(0, 408, 80, 120);
		frame.getContentPane().add(playerCards[1][2]);
		
		 playerCards[1][3] = new JButton("ADV 17");
		playerCards[1][3].setBounds(0, 510, 80, 120);
		frame.getContentPane().add(playerCards[1][3]);
		
		//playerCards[1][4]
		
	 playerCards[1][4] = new JButton("ADV 18");
		playerCards[1][4].setBounds(0, 623, 80, 120);
		frame.getContentPane().add(playerCards[1][4]);
		
		playerCards[1][5] = new JButton("ADV 19");
		playerCards[1][5].setBounds(76, 74, 80, 120);
		frame.getContentPane().add(playerCards[1][5]);
		
		 playerCards[1][6] = new JButton("ADV 20");
		playerCards[1][6].setBounds(76, 186, 80, 120);
		frame.getContentPane().add(playerCards[1][6]);
		
		 playerCards[1][7] = new JButton("ADV 21");
		playerCards[1][7].setBounds(76, 298, 80, 120);
		frame.getContentPane().add(playerCards[1][7]);
		
		 playerCards[1][8] = new JButton("ADV 22");
		playerCards[1][8].setBounds(76, 408, 80, 120);
		frame.getContentPane().add(playerCards[1][8]);
		
		 playerCards[1][9] = new JButton("ADV 23");

		 playerCards[1][9].setBounds(76, 523, 80, 120);
		frame.getContentPane().add(
				 playerCards[1][9]);
		
		playerCards[1][10] = new JButton("ADV 24");
		playerCards[1][10].setBounds(76, 639, 80, 120);
		frame.getContentPane().add(playerCards[1][10]);
		
		
		 playerCards[3][10] = new JButton("ADV 25");
		playerCards[3][10].setBounds(1541, 98, 80, 120);
		frame.getContentPane().add(playerCards[3][10]);
		
		 playerCards[3][11] = new JButton("ADV 26");
		playerCards[3][11].setBounds(1541, 204, 80, 120);
		frame.getContentPane().add(playerCards[3][11]);
		
		 playerCards[3][0] = new JButton("ADV 27");
		playerCards[3][0].setBounds(1541, 318, 80, 120);
		frame.getContentPane().add(playerCards[3][0]);
		
		  playerCards[3][1] = new JButton("ADV 28");
		 playerCards[3][1].setBounds(1541, 434, 80, 120);
		frame.getContentPane().add( playerCards[3][1]);
		
		  playerCards[3][2] = new JButton("ADV 29");
		 playerCards[3][2].setBounds(1541, 547, 80, 120);
		frame.getContentPane().add( playerCards[3][2]);
		
		  playerCards[3][3] = new JButton("ADV 30");
		 playerCards[3][3].setBounds(1541, 660, 80, 120);
		frame.getContentPane().add( playerCards[3][3]);
		
		  playerCards[3][4] = new JButton("ADV 31");
		 playerCards[3][4].setBounds(1461, 98, 80, 120);
		frame.getContentPane().add( playerCards[3][4]);
		
		
		  playerCards[3][5] = new JButton("ADV 32");
		 playerCards[3][5].setBounds(1461, 204, 80, 120);
		frame.getContentPane().add( playerCards[3][5]);
		
		  playerCards[3][6] = new JButton("ADV 33");
		 playerCards[3][6].setBounds(1461, 318, 80, 120);
		frame.getContentPane().add( playerCards[3][6]);
		
		  playerCards[3][7] = new JButton("ADV 34");
		 playerCards[3][7].setBounds(1461, 434, 80, 120);
		frame.getContentPane().add( playerCards[3][7]);
		
		  playerCards[3][8] = new JButton("ADV 35");
		 playerCards[3][8].setBounds(1461, 547, 80, 120);
		frame.getContentPane().add( playerCards[3][8]);
		
		  playerCards[3][9] = new JButton("ADV 36");
		 playerCards[3][9].setBounds(1461, 660, 80, 120);
		frame.getContentPane().add( playerCards[3][9]);
		
		  playerCards[0][0] = new JButton("ADV 37");
		 playerCards[0][0].setBounds(169, 779, 80, 120);
		frame.getContentPane().add( playerCards[0][0]);
		
		  playerCards[0][1] = new JButton("ADV 38");
		 playerCards[0][1].setBounds(244, 777, 80, 120);
		frame.getContentPane().add( playerCards[0][1]);
		
		 playerCards[0][2] = new JButton("ADV 39");
		playerCards[0][2].setBounds(323, 777, 80, 120);
		frame.getContentPane().add(playerCards[0][2]);
		
		 playerCards[0][3] = new JButton("ADV 40");
		playerCards[0][3].setBounds(401, 777, 80, 120);
		frame.getContentPane().add(playerCards[0][3]);
		
		 playerCards[0][4] = new JButton("ADV 41");
		playerCards[0][4].setBounds(479, 777, 80, 120);
		frame.getContentPane().add(playerCards[0][4]);
		
		 playerCards[0][5] = new JButton("ADV 42");
		playerCards[0][5].setBounds(557, 777, 80, 120);
		frame.getContentPane().add(playerCards[0][5]);
		
		 playerCards[0][6] = new JButton("ADV 43");
		playerCards[0][6].setBounds(633, 777, 80, 120);
		frame.getContentPane().add(playerCards[0][6]);
		
		 playerCards[0][7] = new JButton("ADV 44");
		playerCards[0][7].setBounds(710, 777, 80, 120);
		frame.getContentPane().add(playerCards[0][7]);
		
		 playerCards[0][8] = new JButton("ADV 45");
		playerCards[0][8].setBounds(787, 777, 80, 120);
		frame.getContentPane().add(playerCards[0][8]);
		
		 playerCards[0][9] = new JButton("ADV 46");
		playerCards[0][9].setBounds(864, 777, 80, 120);
		frame.getContentPane().add(playerCards[0][9]);
		
		 playerCards[0][10] = new JButton("ADV 47");
		playerCards[0][10].setBounds(939, 777, 80, 120);
		frame.getContentPane().add(playerCards[0][10]);

		
		JButton btnDoneTurn = new JButton("Done Turn");
		btnDoneTurn.setBounds(590, 232, 117, 29);
		frame.getContentPane().add(btnDoneTurn);
		
		JButton btnAddShield = new JButton("Add shield");
		btnAddShield.setBounds(590, 273, 117, 29);
		frame.getContentPane().add(btnAddShield);
		
		 button_1 = new JButton("Stage card 1");
		 button_1.setBounds(823, 377, 90, 140);
		 button_1.setVisible(false);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("Stage card 2");
		button_2.setBounds(910, 377, 90, 140);
		button_2.setVisible(false);
		frame.getContentPane().add(button_2);
	
		
		button_3 = new JButton("Stage card 3");
		button_3.setBounds(997, 377, 90, 140);
		button_3.setVisible(false);
			frame.getContentPane().add(button_3);
		
			button_4 = new JButton("Stage card 4");
			button_4.setBounds(1084, 377, 90, 140);
			button_4.setVisible(false);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("Stage card 5");
		button_5.setBounds(1169, 377, 90, 140);
		button_5.setVisible(false);
		frame.getContentPane().add(button_5);
		
		Image rankCardImg = new ImageIcon(this.getClass().getResource("/Cards/Ranks_Squire.png")).getImage();
		
		player1RankCard = new JButton("Player1 Rank");
		player1RankCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		player1RankCard.setBounds(997, 656, 107, 129);
		player1RankCard.setIcon(new ImageIcon(rankCardImg));
		frame.getContentPane().add(player1RankCard);
		
		 player2RankCard = new JButton("Player2 Rank");
		player2RankCard.setBounds(187, 158, 107, 129);
		player2RankCard.setIcon(new ImageIcon(rankCardImg));
		frame.getContentPane().add(player2RankCard);
		
		 player3RankCard = new JButton("Player3 Rank");
		player3RankCard.setBounds(982, 158, 107, 129);
		player3RankCard.setIcon(new ImageIcon(rankCardImg));
		frame.getContentPane().add(player3RankCard);
		
		 player4RankCard = new JButton("Player4 Rank");
		player4RankCard.setBounds(1338, 656, 107, 129);
		player4RankCard.setIcon(new ImageIcon(rankCardImg));
		frame.getContentPane().add(player4RankCard);
		
		 lblStage = new JLabel("Stage 1");
		 lblStage.setForeground(Color.RED);
		 lblStage.setVisible(false);
			lblStage.setBounds(842, 339, 61, 16);
			frame.getContentPane().add(lblStage);
			
			 lblStage_1 = new JLabel("Stage 2");
			 lblStage_1.setForeground(Color.RED);
			 lblStage_1.setVisible(false);
			lblStage_1.setBounds(924, 338, 61, 16);
			frame.getContentPane().add(lblStage_1);
			
			 lblStage_2 = new JLabel("Stage 3");
			 lblStage_2.setForeground(Color.RED);
			 lblStage_2.setVisible(false);
			lblStage_2.setBounds(997, 338, 61, 16);
			frame.getContentPane().add(lblStage_2);
			
			 lblStage_3 = new JLabel("Stage 4");
			 lblStage_3.setForeground(Color.RED);
			 lblStage_3.setVisible(false);
			lblStage_3.setBounds(1085, 338, 61, 16);
			frame.getContentPane().add(lblStage_3);
			
			 lblStage_4 = new JLabel("Stage 5");
			 lblStage_4.setForeground(Color.RED);
			 lblStage_4.setVisible(false);
			lblStage_4.setBounds(1169, 337, 61, 16);
			frame.getContentPane().add(lblStage_4);

		
		btnTournamentCards_1 = new JButton("Tournament Cards");
		btnTournamentCards_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTournamentCards_1.setBounds(360, 357, 130, 180);
		btnTournamentCards_1.setVisible(false);
		frame.getContentPane().add(btnTournamentCards_1);
		
		btnTournamentCards = new JButton("Tournament Cards");
		btnTournamentCards.setVisible(false);
		btnTournamentCards.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTournamentCards.setBounds(215, 357, 130, 180);
		frame.getContentPane().add(btnTournamentCards);
		/*
		 playerCards[2][13] = new JButton("ADV 21");
		playerCards[2][13].setBounds(76, 758, 80, 120);
		frame.getContentPane().add(playerCards[2][13]);
		
		playerCards[2][14] = new JButton("ADV 21");
		playerCards[2][14].setBounds(0, 742, 80, 120);
		frame.getContentPane().add(playerCards[2][14]);
		*/
		btnTournamentCards_2 = new JButton("Tournament Cards");
		btnTournamentCards_2.setVisible(false);
		btnTournamentCards_2.setBounds(215, 547, 130, 180);
		frame.getContentPane().add(btnTournamentCards_2);
		
		btnTournamentCards_3 = new JButton("Tournament Cards");
		btnTournamentCards_3.setVisible(false);
		btnTournamentCards_3.setBounds(360, 547, 130, 180);
		frame.getContentPane().add(btnTournamentCards_3);
		
		
		  playerCards[0][11] = new JButton("ADV 21");
		 playerCards[0][11].setBounds(1018, 779, 80, 120);
		frame.getContentPane().add( playerCards[0][11]);
		
		lblPlayer = new JLabel("Player 1");
		lblPlayer.setForeground(Color.YELLOW);
		lblPlayer.setBounds(908, 711, 61, 16);
		frame.getContentPane().add(lblPlayer);
		
		JLabel lblPlayer_2 = new JLabel("Player 2");
		lblPlayer_2.setForeground(Color.YELLOW);
		lblPlayer_2.setBounds(197, 301, 61, 16);
		frame.getContentPane().add(lblPlayer_2);
		
		JLabel lblPlayer_3 = new JLabel("Player 3");
		lblPlayer_3.setForeground(Color.YELLOW);
		lblPlayer_3.setBounds(898, 213, 61, 16);
		frame.getContentPane().add(lblPlayer_3);
		
		
		JLabel lblPlayer_4 = new JLabel("Player 4");
		lblPlayer_4.setForeground(Color.YELLOW);
		lblPlayer_4.setBounds(1290, 656, 107, 129);
		frame.getContentPane().add(lblPlayer_4);
		
		
		
		/*
		playerCards[2][14] = new JButton("ADV 21");
		playerCards[2][14].setBounds(0, 858, 80, 120);
		frame.getContentPane().add(playerCards[2][14]);
		
		  playerCards[0][12] = new JButton("ADV 21");
		 playerCards[0][12].setBounds(1099, 779, 80, 120);
		frame.getContentPane().add( playerCards[0][12]);
		
		  playerCards[0][13] = new JButton("ADV 21");
		 playerCards[0][13].setBounds(1189, 779, 80, 120);
		frame.getContentPane().add( playerCards[0][13]);
		
		  playerCards[0][14] = new JButton("ADV 21");
		 playerCards[0][14].setBounds(1266, 779, 80, 120);
		frame.getContentPane().add( playerCards[0][14]);
		
		 playerCards[4][14] = new JButton("ADV 21");
		playerCards[4][14].setBounds(1461, 779, 80, 120);
		frame.getContentPane().add(playerCards[4][14]);
		
		  playerCards[4][12] = new JButton("ADV 21");
		 playerCards[4][12].setBounds(1541, 779, 80, 120);
		frame.getContentPane().add( playerCards[4][12]);
		
		  playerCards[4][13] = new JButton("ADV 21");
		 playerCards[4][13].setBounds(1541, 0, 80, 120);
		frame.getContentPane().add( playerCards[4][13]);
		
		playerCards[3][12] = new JButton("ADV 21");
		playerCards[3][12].setBounds(1071, 6, 80, 120);
		frame.getContentPane().add(playerCards[3][12]);
		

		playerCards[3][13] = new JButton("ADV 21");

		playerCards[3][13].setBounds(1150, 7, 80, 120);
		frame.getContentPane().add(playerCards[3][13]);
		

		playerCards[3][14] = new JButton("ADV 21");

		playerCards[3][14].setBounds(1230, 6, 80, 120);
		frame.getContentPane().add(playerCards[3][14]);
		*/
		playerCards[3][0].setVisible(false);
		playerCards[3][1].setVisible(false);
		playerCards[3][2].setVisible(false);
		playerCards[3][3].setVisible(false);
		playerCards[3][4].setVisible(false);
		
		
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

		for(int iTemp =0;iTemp<4 ;iTemp++) {
			for(int j =0;j<TOTAL_PLAYER_CARDS;j++) {
				Image img1 = new ImageIcon(this.getClass().getResource("/Cards/download.jpeg")).getImage();
				playerCards[iTemp][j].setIcon(new ImageIcon(img1));
				playerCards[iTemp][j].setVisible(true);
			}
		}
		
	}

	private void setupLabelNames() {
		int i=0;
		for(Player temp : players) {
			playerLbl[i++].setText(temp.getName());
		}
	}

	public void updatePlayerCards(Player player) {
		for(Player temp: players) {
			if(temp.getPlayerId() == player.getPlayerId()) {
				ArrayList<Cards> cards = player.getHand();
				for(int i=0;i<TOTAL_PLAYER_CARDS ;i++) {
					if(i >= player.getHand().size()) {
						playerCards[player.getPlayerId()][i].setVisible(false);
					}else {
						Image img = new ImageIcon(this.getClass().getResource(cards.get(i).getPicture())).getImage();
						playerCards[player.getPlayerId()][i].setIcon(new ImageIcon(img));
						playerCards[player.getPlayerId()][i].setVisible(true);
					}
				}
			}else {
				hidePlayerCards(temp);
			}
		}
	}
	
	public void hidePlayerCards(Player player) {
		for(int i=0;i<TOTAL_PLAYER_CARDS ;i++) {
			if(i >= player.getHand().size()) {
				playerCards[player.getPlayerId()][i].setVisible(false);
			}else {
				Image img = new ImageIcon(this.getClass().getResource("/Cards/download.jpeg")).getImage();
				playerCards[player.getPlayerId()][i].setIcon(new ImageIcon(img));
				playerCards[player.getPlayerId()][i].setVisible(true);
			}
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
		
		lblStage.setVisible(false);
		lblStage_2.setVisible(false);
		lblStage_1.setVisible(false);
		lblStage_4.setVisible(false);
		lblStage_3.setVisible(false);
		
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
		}
	}

	public void removePlayerCard(Player player) {
		for(int i=player.getHand().size();i<=TOTAL_PLAYER_CARDS ;i++) {
			playerCards[player.getPlayerId()][i-1].setVisible(false);
		}
	}

	public void setTournamentCards(ArrayList<Cards> cards) {
		btnTournamentCards.setVisible(false);
		btnTournamentCards_1.setVisible(false);
		btnTournamentCards_2.setVisible(false);
		btnTournamentCards_3.setVisible(false);
		
		if(cards.size()>0) {
			Image img = new ImageIcon(this.getClass().getResource(cards.get(0).getPicture())).getImage();
			btnTournamentCards.setIcon(new ImageIcon(img));
			btnTournamentCards.setVisible(true);
		}
		if(cards.size()>1) {
			Image img = new ImageIcon(this.getClass().getResource(cards.get(1).getPicture())).getImage();
			btnTournamentCards_1.setIcon(new ImageIcon(img));
			btnTournamentCards_1.setVisible(true);
		}
		if(cards.size()>2) {
			Image img = new ImageIcon(this.getClass().getResource(cards.get(2).getPicture())).getImage();
			btnTournamentCards_2.setIcon(new ImageIcon(img));
			btnTournamentCards_2.setVisible(true);
		}
		if(cards.size()>3) {
			Image img = new ImageIcon(this.getClass().getResource(cards.get(3).getPicture())).getImage();
			btnTournamentCards_3.setIcon(new ImageIcon(img));
			btnTournamentCards_3.setVisible(true);
		}
	}

	public boolean askPlayer(Player player, String msg) {
		if(JOptionPane.showOptionDialog(frame, msg, "Dialog", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null) == JOptionPane.YES_OPTION)
			return true;
		return false;
	}
}
		
		
		
		
		
		