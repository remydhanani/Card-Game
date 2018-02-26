package com.team25;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Window;

public class AppWindow {

	private JFrame frame;
	private JLabel player4Shieldbl;
	private int totalShields = 10;
	private int playerShields[] = {0,0,0,0};
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
		
		JButton btnCardplayer = new JButton("CardPlayer1");
		btnCardplayer.setBounds(480, 87, 130, 180);
		frame.getContentPane().add(btnCardplayer);
		Image playercard1 = new ImageIcon(this.getClass().getResource("/Cards/download.jpeg")).getImage();
		btnCardplayer.setIcon(new ImageIcon(playercard1));
		
		JButton btnCardplayer_1 = new JButton("CardPlayer2");
		btnCardplayer_1.setBounds(480, 446, 130, 180);
		frame.getContentPane().add(btnCardplayer_1);
		
		Image playercard2 = new ImageIcon(this.getClass().getResource("/Cards/download.jpeg")).getImage();
		btnCardplayer_1.setIcon(new ImageIcon(playercard2));
		
		
		JButton btnCardplayer_2 = new JButton("CardPlayer3");
		btnCardplayer_2.setBounds(34, 456, 130, 180);
		frame.getContentPane().add(btnCardplayer_2);
		
		Image playercard3 = new ImageIcon(this.getClass().getResource("/Cards/download.jpeg")).getImage();
		btnCardplayer_2.setIcon(new ImageIcon(playercard3));
		
		JButton btnCardplayer_3 = new JButton("CardPlayer4");
		btnCardplayer_3.setBounds(34, 87, 130, 180);
		frame.getContentPane().add(btnCardplayer_3);
		
		Image playercard4 = new ImageIcon(this.getClass().getResource("/Cards/download.jpeg")).getImage();
		btnCardplayer_3.setIcon(new ImageIcon(playercard4));
		
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
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 1500, 800);
		lblNewLabel_1.setForeground(Color.ORANGE);
		frame.getContentPane().add(lblNewLabel_1);
		Image img3 = new ImageIcon(this.getClass().getResource("/Cards/BoardBack.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img3));
		
	
		
	

		
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
