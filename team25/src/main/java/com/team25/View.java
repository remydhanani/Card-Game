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
			
			JButton btnPlay = new JButton("Play");
			btnPlay.setBounds(6, 154, 85, 70);
			btnPlay.setForeground(Color.ORANGE);
			btnPlay.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					String playerStr = JOptionPane.showInputDialog("Enter Number of Players");
					if(playerStr.matches("[0-9]+")) {
						players = Integer.parseInt(playerStr);
						if(players <=4 && players>=2) {
							AppWindow newapp = new AppWindow(players);
							//newapp.newScreen();
						}else {
							JOptionPane.showMessageDialog(frame, "Players should be between 2 and 4", "Dialog", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
			});
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

