package com.team25;

import java.awt.Color;

import java.awt.image.*;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

import java.awt.Image;
import javax.swing.JPanel;
import java.awt.Panel;

public class StartPage {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartPage window = new StartPage();
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
	public StartPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 0));
		frame.setBounds(1500, 800, 1500, 800);
		
		
		Button button = new Button("Exit");
		button.setBounds(6, 230, 85, 70);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().add(button);
		//button.setBackground(new Color(128,0,0));
		
		JButton btnMultiplayer = new JButton("Multiplayer");
		btnMultiplayer.setBounds(6, 154, 85, 70);
		btnMultiplayer.setForeground(Color.ORANGE);
		btnMultiplayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnMultiplayer);
		
		
		
		//frame.getContentPane().add(lblNewLabel);
		
		Button button_1 = new Button("Two Player");
		button_1.setBounds(10, 67, 85, 70);
		button_1.setForeground(Color.ORANGE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppWindow newapp = new AppWindow();
				newapp.newScreen();
			}
		});
		//button_1.setBackground(new Color(128, 0, 0));
		frame.getContentPane().add(button_1);
	
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 1500, 800);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setBounds(1500, 800, 1500, 800);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
Image img = new ImageIcon(this.getClass().getResource("/Cards/start-1.png")).getImage();
		
		lblNewLabel_1.setIcon(new ImageIcon(img));
		
		
	}
}
