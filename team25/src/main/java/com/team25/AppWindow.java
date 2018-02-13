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
		
		
		JLabel lblPlayer = new JLabel("PLAYER 1");
		lblPlayer.setForeground(Color.ORANGE);
		lblPlayer.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblPlayer.setBounds(500, 29, 169, 16);
		frame.getContentPane().add(lblPlayer);
		
		JLabel lblPlayer_1 = new JLabel("PLAYER 2");
		lblPlayer_1.setForeground(Color.ORANGE);
		lblPlayer_1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
	
		lblPlayer_1.setBounds(500, 662, 169, 16);
		frame.getContentPane().add(lblPlayer_1);
		
		JButton lblNewLabel = new JButton("Adventure cards");
		lblNewLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		lblNewLabel.setBounds(1319, 99, 130, 180);
		frame.getContentPane().add(lblNewLabel);
Image img = new ImageIcon(this.getClass().getResource("/Cards/Card2.jpg")).getImage();
		
lblNewLabel.setIcon(new ImageIcon(img));
		
		JButton label = new JButton("Story cards");
		label.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		label.setBounds(1319, 446, 130, 180);
		frame.getContentPane().add(label);
		
		Image img2 = new ImageIcon(this.getClass().getResource("/Cards/Card1.png")).getImage();
		
		label.setIcon(new ImageIcon(img2));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 1500, 800);
		frame.getContentPane().add(lblNewLabel_1);
		
		Image img3 = new ImageIcon(this.getClass().getResource("/Cards/BoardBack.png")).getImage();
		
		lblNewLabel_1.setIcon(new ImageIcon(img3));
		
		
	}
}
