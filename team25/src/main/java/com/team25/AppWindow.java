package com.team25;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AppWindow {

	private JFrame frame;
	private UI ui;

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWindow window = new AppWindow();
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
	public AppWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ui = new UI();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 0));
		frame.setBounds(1500, 800, 1500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnShuffle = new JButton("SHUFFLE STORY");
		btnShuffle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Story Deck Shuffled");
				//add functionality of shuffling the story deck on Start (use random function)
				ui.shuffleStory();
			}
		});
		btnShuffle.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnShuffle.setBounds(625, 333, 160, 29);
		frame.getContentPane().add(btnShuffle);
		
		JLabel lblPlayer = new JLabel("PLAYER 1");
		lblPlayer.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblPlayer.setBounds(500, 30, 169, 16);
		frame.getContentPane().add(lblPlayer);
		
		JLabel lblPlayer_1 = new JLabel("PLAYER 2");
		lblPlayer_1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblPlayer_1.setBounds(500, 662, 169, 16);
		frame.getContentPane().add(lblPlayer_1);
		
		JButton btnShuffleAdventure = new JButton("SHUFFLE ADVENTURE");
		btnShuffleAdventure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Adventure Cards Shuffled");
				//add functionality of shuffling the adventure cards on Start (use random function)
				ui.shuffleAdventure();
			}
		});
		btnShuffleAdventure.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnShuffleAdventure.setBounds(1096, 333, 176, 30);
		frame.getContentPane().add(btnShuffleAdventure);
	}
}
