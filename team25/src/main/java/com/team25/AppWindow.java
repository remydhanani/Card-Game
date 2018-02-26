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
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Window;

public class AppWindow {

	private JFrame frame;
	private JLabel player4Shieldbl;
	private int totalShields = 10;
	private int playerShields[] = {0,0,0,0};
	private ArrayList<Cards> player1Cards=new ArrayList<Cards>(),
			player2Cards=new ArrayList<Cards>(), player3Cards=new ArrayList<Cards>(), 
			player4Cards = new ArrayList<Cards>();
	private JLabel player2Shieldbl;
	private JLabel player3Shieldbl;
	private JLabel player1Shieldbl;
	private int totalPlayers;
	private Image rankSquire;
	private Image rankKnight;
	private Image rankChampionKnight;
	private JLabel rank3lbl;
	private JLabel rank4lbl;
	private JLabel rank1lbl;
	private JLabel rank2lbl;
	private AdventureDeck adventureDeck = new AdventureDeck();
	private JLabel player3AmourCard;
	private JLabel player3AmourCount;
	private JLabel player4AmourCard;
	private JLabel player4AmourCount;
	private JLabel player1AmourCard;
	private JLabel player1AmourCount;
	private JLabel player2AmourCard;
	private JLabel player2AmourCount;
	int playersWithAmour[] = {0, 0, 0, 0};
	private JLabel cardCount4;
	private JLabel cardCount1;
	private JLabel cardCount3;
	private JLabel cardCount2;
	private boolean firstTime = true;
	/*private JButton btnDisplaycard_1;
	private JButton btnDisplaycard_2;
	private JButton btnDisplaycard_6;
	private JButton btnDisplaycard_5;
	private JButton btnDisplaycard_3;
	private JButton btnDisplaycard_4;
	private JButton btnDisplaycard_7;
	private JButton btnDisplaycard_9;
	private JButton btnDisplaycard_8;
	private JButton btnDisplaycard_10;
	private JButton btnDisplaycard_11;*/
	private JButton btnDisplaycard[] = new JButton[12];

	/**
	 * Launch the application.
	 * @param players 
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWindow window = new AppWindow(2);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param players 
	 */
	public AppWindow(int players) {
		this.totalPlayers = players;
		initialize();
		frame.setVisible(true);
		JOptionPane.showMessageDialog(frame, "All players are Squire", "Dialog", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(frame, "Click on Adventure Deck to deal", "Dialog", JOptionPane.INFORMATION_MESSAGE);
		adventureDeck.create();
		adventureDeck.shuffe();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 0));
		frame.setBounds(1500, 800, 1500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().setLayout(null);
		
		 JLabel adventureLabel = new JLabel("Adventure Deck");
		 adventureLabel.setBounds(1332, 72, 117, 16);
			adventureLabel.setForeground(Color.ORANGE);
			frame.getContentPane().add(adventureLabel);
			
			JLabel storyLabel = new JLabel("Story Deck");
			storyLabel.setBounds(1332, 418, 117, 16);
			storyLabel.setForeground(Color.ORANGE);
			frame.getContentPane().add(storyLabel);
		
		JLabel lblPlayer = new JLabel("PLAYER 1");
		lblPlayer.setBounds(500, 29, 169, 16);
		lblPlayer.setForeground(Color.ORANGE);
		lblPlayer.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		frame.getContentPane().add(lblPlayer);
		
		JLabel lblPlayer_1 = new JLabel("PLAYER 2");
		lblPlayer_1.setBounds(500, 662, 169, 16);
		lblPlayer_1.setForeground(Color.ORANGE);
		lblPlayer_1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		frame.getContentPane().add(lblPlayer_1);
		 
		 JLabel lblPlayer_2 = new JLabel("PLAYER 3");
		 lblPlayer_2.setBounds(69, 31, 169, 16);
		 lblPlayer_2.setForeground(Color.ORANGE);
		 frame.getContentPane().add(lblPlayer_2);
		 lblPlayer_2.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		 
		 JLabel lblPlayer_3 = new JLabel("PLAYER 4");
		 lblPlayer_3.setBounds(58, 664, 169, 16);
		 lblPlayer_3.setForeground(Color.ORANGE);
		 frame.getContentPane().add(lblPlayer_3);
		 lblPlayer_3.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		 

			rankSquire = new ImageIcon(this.getClass().getResource("/Cards/Ranks_Squire.png")).getImage();
			rankKnight = new ImageIcon(this.getClass().getResource("/Cards/Ranks_Knight.png")).getImage();
			rankChampionKnight = new ImageIcon(this.getClass().getResource("/Cards/Ranks_ChampionKnight.png")).getImage();
			
		    player3Shieldbl = new JLabel("Shield3: ");
		    player3Shieldbl.setBounds(176, 136, 71, 16);
			player3Shieldbl.setForeground(Color.ORANGE);
			frame.getContentPane().add(player3Shieldbl);
			
			rank3lbl = new JLabel("Rank3");
			rank3lbl.setBounds(176, 99, 71, 104);
			frame.getContentPane().add(rank3lbl);
			rank3lbl.setIcon(new ImageIcon(rankSquire));
			
			player4Shieldbl = new JLabel("Shield4: ");
			player4Shieldbl.setBounds(176, 527, 71, 16);
			player4Shieldbl.setForeground(Color.ORANGE);
			frame.getContentPane().add(player4Shieldbl);
			
			rank4lbl = new JLabel("Rank4");
			rank4lbl.setBounds(176, 488, 71, 104);
			frame.getContentPane().add(rank4lbl);
			rank4lbl.setIcon(new ImageIcon(rankSquire));
		
			
			player1Shieldbl = new JLabel("Shield1: ");
			player1Shieldbl.setBounds(622, 136, 71, 16);
			player1Shieldbl.setForeground(Color.ORANGE);
			frame.getContentPane().add(player1Shieldbl);
			rank1lbl = new JLabel("Rank2");
			rank1lbl.setBounds(611, 111, 71, 104);
			frame.getContentPane().add(rank1lbl);
			rank1lbl.setIcon(new ImageIcon(rankSquire));
			
			
			
			player2Shieldbl = new JLabel("Shield2: ");
			player2Shieldbl.setBounds(622, 527, 71, 16);
			player2Shieldbl.setForeground(Color.ORANGE);
			frame.getContentPane().add(player2Shieldbl);
			
			rank2lbl = new JLabel("Rank2");
			rank2lbl.setBounds(611, 488, 71, 104);
			frame.getContentPane().add(rank2lbl);
			rank2lbl.setIcon(new ImageIcon(rankSquire));
			

			
		 JButton btnAddShield = new JButton("Add Shield");
		 btnAddShield.setBounds(1319, 707, 117, 29);
		 btnAddShield.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String playerStr = JOptionPane.showInputDialog("Enter player number to add shield");
					if(playerStr.matches("[1-"+totalPlayers+"]+")) {
						addShield(Integer.parseInt(playerStr));
					}else {
						JOptionPane.showMessageDialog(frame, "Provide a valid input", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}

		});
		 frame.getContentPane().add(btnAddShield);
		
		
		 
		JButton lblNewLabel = new JButton("Adventure cards");
		lblNewLabel.setBounds(1319, 99, 130, 180);
		lblNewLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(firstTime) {
					firstTime = false;
					for(int i =0;i<12;i++) {
						addCardToPlayer(1);
						addCardToPlayer(2);
						if(totalPlayers>2)
							addCardToPlayer(3);
						if(totalPlayers>3)
							addCardToPlayer(4);
					}
				}else {
					String playerStr = JOptionPane.showInputDialog("Enter player number to add a card");
					if(playerStr.matches("[1-"+totalPlayers+"]+")) {
						addCardToPlayer(Integer.parseInt(playerStr));
					}else {
						JOptionPane.showMessageDialog(frame, "Provide a valid input", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		frame.getContentPane().add(lblNewLabel);
Image img = new ImageIcon(this.getClass().getResource("/Cards/Card2.jpg")).getImage();
		
lblNewLabel.setIcon(new ImageIcon(img));
		
		JButton label = new JButton("Story cards");
		label.setBounds(1319, 446, 130, 180);
		label.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		frame.getContentPane().add(label);
		
		Image img2 = new ImageIcon(this.getClass().getResource("/Cards/Card1.png")).getImage();
		
		label.setIcon(new ImageIcon(img2));
		
		
		
		cardCount3 = new JLabel("Cards 3: ");
		cardCount3.setBounds(69, 72, 76, 16);
		frame.getContentPane().add(cardCount3);
		cardCount3.setForeground(Color.ORANGE);
		
		cardCount1 = new JLabel("Cards 1: ");
		cardCount1.setBounds(508, 72, 87, 16);
		frame.getContentPane().add(cardCount1);
		cardCount1.setForeground(Color.ORANGE);
		
	    cardCount4 = new JLabel("Cards 4: ");
		cardCount4.setBounds(58, 439, 87, 16);
		frame.getContentPane().add(cardCount4);
		cardCount4.setForeground(Color.ORANGE);
		
		 cardCount2 = new JLabel("Cards 2: ");
		cardCount2.setBounds(508, 428, 87, 16);
		frame.getContentPane().add(cardCount2);
		cardCount2.setForeground(Color.ORANGE);
		
		JButton btnCardplayer = new JButton("CardPlayer1");
		btnCardplayer.setBounds(480, 87, 130, 180);
		frame.getContentPane().add(btnCardplayer);
		Image playercard1 = new ImageIcon(this.getClass().getResource("/Cards/download.jpeg")).getImage();
		btnCardplayer.setIcon(new ImageIcon(playercard1));
		btnCardplayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				togglePlayerCards(player1Cards);
			}
		});
		
		JButton btnCardplayer_1 = new JButton("CardPlayer2");
		btnCardplayer_1.setBounds(480, 446, 130, 180);
		frame.getContentPane().add(btnCardplayer_1);
		
		Image playercard2 = new ImageIcon(this.getClass().getResource("/Cards/download.jpeg")).getImage();
		btnCardplayer_1.setIcon(new ImageIcon(playercard2));
		
		btnCardplayer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				togglePlayerCards(player2Cards);
			}
		});
		
		JButton btnCardplayer_2 = new JButton("CardPlayer3");
		btnCardplayer_2.setBounds(34, 456, 130, 180);
		frame.getContentPane().add(btnCardplayer_2);
		
		Image playercard3 = new ImageIcon(this.getClass().getResource("/Cards/download.jpeg")).getImage();
		btnCardplayer_2.setIcon(new ImageIcon(playercard3));
		
		btnCardplayer_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				togglePlayerCards(player4Cards);
			}
		});
		
		JButton btnCardplayer_3 = new JButton("CardPlayer4");
		btnCardplayer_3.setBounds(34, 87, 130, 180);
		frame.getContentPane().add(btnCardplayer_3);
		
		Image playercard4 = new ImageIcon(this.getClass().getResource("/Cards/download.jpeg")).getImage();
		btnCardplayer_3.setIcon(new ImageIcon(playercard4));
		
		btnCardplayer_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				togglePlayerCards(player3Cards);
			}
		});
		
		//player setup
		if(totalPlayers==2) {
			btnCardplayer_3.setVisible(false);
			lblPlayer_2.setVisible(false);
			player3Shieldbl.setVisible(false);
			
			btnCardplayer_2.setVisible(false);
			lblPlayer_3.setVisible(false);
			player4Shieldbl.setVisible(false);
			
		}else if(totalPlayers == 3) {
			btnCardplayer_2.setVisible(false);
			lblPlayer_3.setVisible(false);
			player4Shieldbl.setVisible(false);
		}
		
		
		Image amourpic = new ImageIcon(this.getClass().getResource("/Cards/Amour_10.png")).getImage();
		
		//label.setIcon(new ImageIcon(amourpic));
		
		player3AmourCard = new JLabel("Amour3");
		player3AmourCard.setBackground(new Color(238, 238, 238));
		player3AmourCard.setBounds(249, 99, 76, 104);
		frame.getContentPane().add(player3AmourCard);
		player3AmourCard.setIcon(new ImageIcon(amourpic));
		player3AmourCard.setVisible(false);
		
		player3AmourCount = new JLabel("AmourCount3");
		player3AmourCount.setForeground(Color.ORANGE);
		player3AmourCount.setBounds(237, 72, 123, 16);
		frame.getContentPane().add(player3AmourCount);
		player3AmourCount.setVisible(false);
		
		
		player4AmourCard = new JLabel("Amour4");
		player4AmourCard.setBounds(249, 488, 71, 104);
		frame.getContentPane().add(player4AmourCard);
		player4AmourCard.setIcon(new ImageIcon(amourpic));
		player4AmourCard.setVisible(false);
		
		player4AmourCount = new JLabel("AmourCount4");
		player4AmourCount.setBounds(259, 461, 106, 16);
		frame.getContentPane().add(player4AmourCount);
		player4AmourCount.setVisible(false);
		
		player1AmourCard = new JLabel("Amour1");
		player1AmourCard.setBounds(694, 111, 71, 104);
		frame.getContentPane().add(player1AmourCard);
		player1AmourCard.setIcon(new ImageIcon(amourpic));
		player1AmourCard.setVisible(false);
		
		player1AmourCount = new JLabel("AmourCount1");
		player1AmourCount.setForeground(Color.ORANGE);
		player1AmourCount.setBounds(694, 95, 106, 16);
		frame.getContentPane().add(player1AmourCount);
		player1AmourCount.setVisible(false);
		
		player2AmourCard = new JLabel("Amour2");
		player2AmourCard.setBounds(682, 488, 71, 104);
		frame.getContentPane().add(player2AmourCard);
		player2AmourCard.setIcon(new ImageIcon(amourpic));
		player2AmourCard.setVisible(false);
		
		player2AmourCount = new JLabel("AmourCount2");
		player2AmourCount.setForeground(Color.ORANGE);
		player2AmourCount.setBounds(682, 472, 106, 16);
		frame.getContentPane().add(player2AmourCount);
		player2AmourCount.setVisible(false);
		
	 btnDisplaycard[0] = new JButton("DisplayCard1");
		btnDisplaycard[0].setBounds(34, 289, 117, 159);
		frame.getContentPane().add(btnDisplaycard[0]);
		btnDisplaycard[0].setVisible(false);
		
		btnDisplaycard[1] = new JButton("DisplayCard2");
		btnDisplaycard[1].setBounds(157, 296, 117, 159);
		frame.getContentPane().add(btnDisplaycard[1]);
		btnDisplaycard[1].setVisible(false);
		
		
		
		btnDisplaycard[2] = new JButton("DisplayCard3");
		btnDisplaycard[2].setBounds(267, 289, 117, 159);
		frame.getContentPane().add(btnDisplaycard[2]);
		btnDisplaycard[2].setVisible(false);
		
		btnDisplaycard[6] = new JButton("DisplayCard4");
		btnDisplaycard[6].setBounds(396, 279, 117, 159);
		frame.getContentPane().add(btnDisplaycard[6]);
		btnDisplaycard[6].setVisible(false);
		
		btnDisplaycard[5] = new JButton("DisplayCard5");
		btnDisplaycard[5].setBounds(508, 279, 117, 159);
		frame.getContentPane().add(btnDisplaycard[5]);
		btnDisplaycard[5].setVisible(false);
		
		btnDisplaycard[3] = new JButton("DisplayCard6");
		btnDisplaycard[3].setBounds(611, 279, 117, 159);
		frame.getContentPane().add(btnDisplaycard[3]);
		btnDisplaycard[3].setVisible(false);
		
		btnDisplaycard[4] = new JButton("DisplayCard7");
		btnDisplaycard[4].setBounds(740, 275, 117, 159);
		frame.getContentPane().add(btnDisplaycard[4]);
		btnDisplaycard[4].setVisible(false);
		
		btnDisplaycard[7] = new JButton("DisplayCard8");
		btnDisplaycard[7].setBounds(849, 275, 117, 159);
		frame.getContentPane().add(btnDisplaycard[7]);
		btnDisplaycard[7].setVisible(false);
		
		btnDisplaycard[9] = new JButton("DisplayCard9");
		btnDisplaycard[9].setBounds(793, 67, 117, 159);
		frame.getContentPane().add(btnDisplaycard[9]);
		btnDisplaycard[9].setVisible(false);
		
		btnDisplaycard[8] = new JButton("DisplayCard10");
		btnDisplaycard[8].setBounds(939, 50, 117, 159);
		frame.getContentPane().add(btnDisplaycard[8]);
		btnDisplaycard[8].setVisible(false);
		
		btnDisplaycard[10] = new JButton("DisplayCard11");
		btnDisplaycard[10].setBounds(1091, 203, 117, 159);
		frame.getContentPane().add(btnDisplaycard[10]);
		btnDisplaycard[10].setVisible(false);
		
		btnDisplaycard[11] = new JButton("DisplayCard12");
		btnDisplaycard[11].setBounds(1148, 50, 117, 159);
		frame.getContentPane().add(btnDisplaycard[11]);
		btnDisplaycard[11].setVisible(false);

		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 1500, 800);
		lblNewLabel_1.setForeground(Color.ORANGE);
		frame.getContentPane().add(lblNewLabel_1);
		Image img3 = new ImageIcon(this.getClass().getResource("/Cards/BoardBack.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img3));
		
	

		
	}
	
	private void togglePlayerCards(ArrayList<Cards> cards) {
		boolean val = false;
		if(cards != null) {
			val = true;
		}
		for(int i=0;i<12/*cards.size()*/;i++) {
			btnDisplaycard[i].setVisible(val);
			if(val) {
				Image img = new ImageIcon(this.getClass().getResource(cards.get(i).getPicture())).getImage();
				btnDisplaycard[i].setIcon(new ImageIcon(img));
			}
		}
	}
	
	protected void addCardToPlayer(int i) {
		Cards temp = adventureDeck.draw();
		if(temp instanceof Ally_Card)
			if(temp.getName().equalsIgnoreCase("amour"))
				playersWithAmour[i-1]++;
		if(i==1) {
			player1Cards.add(temp);
			cardCount1.setText("Cards : "+player1Cards.size());
			if(playersWithAmour[0]>0) {
				player1AmourCard.setVisible(true);
				player1AmourCount.setVisible(true);
				player1AmourCount.setText("Amour: "+playersWithAmour[0]);
			}
		}else if(i==2) {
			player2Cards.add(temp);

			cardCount2.setText("Cards : "+player2Cards.size());
			if(playersWithAmour[1]>0) {
			player2AmourCard.setVisible(true);
			player2AmourCount.setVisible(true);
			player2AmourCount.setText("Amour: "+playersWithAmour[1]);
			}
		}else if(i==3) {
			player3Cards.add(temp);

			cardCount3.setText("Cards : "+player3Cards.size());
			if(playersWithAmour[2]>0) {
			player3AmourCard.setVisible(true);
			player3AmourCount.setVisible(true);
			player3AmourCount.setText("Amour: "+playersWithAmour[2]);
			}
		}else if(i==4) {
			player4Cards.add(temp);

			cardCount4.setText("Cards : "+player4Cards.size());
			if(playersWithAmour[3]>0) {
			player4AmourCard.setVisible(true);
			player4AmourCount.setVisible(true);
			player4AmourCount.setText("Amour: "+playersWithAmour[3]);
			}
		}
	}

	private void addShield(int playerNumber) {
		int playerShieldCount = playerShields[playerNumber-1];
		if(playerShieldCount < totalShields) {
			playerShields[playerNumber-1]++;

			String body = "Shield : "+ playerShields[playerNumber-1];
			switch (playerNumber) {
			case 1:
				player1Shieldbl.setText(body);
				break;
			case 2:
				player2Shieldbl.setText(body);
				break;
			case 3:
				player3Shieldbl.setText(body);
				break;
			case 4:
				player4Shieldbl.setText(body);
				break;

			default:
				break;
			}
			
			switch (playerShields[playerNumber-1]) {
				case 5:
					JOptionPane.showMessageDialog(frame, "Players "+playerNumber+" is knight", "Dialog", JOptionPane.INFORMATION_MESSAGE);
					changeRank(playerNumber);
					break;
				case 7:
					JOptionPane.showMessageDialog(frame, "Players "+playerNumber+" is champion knight", "Dialog", JOptionPane.INFORMATION_MESSAGE);
					changeRank(playerNumber);
					break;
				case 10:
					JOptionPane.showMessageDialog(frame, "Players "+playerNumber+" is knight of the round table", "Dialog", JOptionPane.INFORMATION_MESSAGE);
					changeRank(playerNumber);
					break;

				default:
					break;
			}
			
		}
	}

	private void changeRank(int playerNumber) {
		
		ImageIcon imgIcon = null;
		if(playerShields[playerNumber-1] >= 7) {
			imgIcon = new ImageIcon(rankChampionKnight);
		}else if(playerShields[playerNumber-1]>=5) {
			imgIcon = new ImageIcon(rankKnight);
		} else {
			imgIcon = new ImageIcon(rankSquire);
		}
		
		switch (playerNumber) {
		case 1:
			rank1lbl.setIcon(imgIcon);
			break;
		case 2:
			rank2lbl.setIcon(imgIcon);
			break;
		case 3:
			rank3lbl.setIcon(imgIcon);
			break;
		case 4:
			rank4lbl.setIcon(imgIcon);
			break;

		default:
			break;
		}
	}
}
