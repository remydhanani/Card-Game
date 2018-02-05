package com.team25;

import java.awt.Color;

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
					window.frame.setSize(1280, 720);
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
		
		
			
			ImageIcon startpage = new ImageIcon("images//LOGO_ON-AIR_Quest-color.jpg");
			startpage.getImage();
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 0));
		
		Button button = new Button("Exit");
		
		frame.getContentPane().add(button, BorderLayout.SOUTH);
		button.setBackground(new Color(128,0,0));
		
		Button button_1 = new Button("Two Player");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppWindow newapp = new AppWindow();
				newapp.newScreen();
			}
		});
		

		
		
		frame.getContentPane().add(button_1, BorderLayout.NORTH);
		button_1.setBackground(new Color(128,0,0));
		
		JButton btnMultiplayer = new JButton("Multiplayer");

		btnMultiplayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AppWindow newapp = new AppWindow();
				//newapp.newScreen();
			}
		});
		frame.getContentPane().add(btnMultiplayer, BorderLayout.WEST);
		frame.setBounds(1500, 800, 1500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	


	
	
	

}
