package com.team25;

import java.io.*;
import java.net.*;

public class Server {
	
	static ServerSocket serverSocket;
	static Socket socket; 
	static DataOutputStream out;
	static DataInputStream in;
	static Users[] user = new Users[10];
	
   public static void main(String argv[]) throws Exception
      {
	   System.out.println("Starting server...");
	   serverSocket = new ServerSocket(7777);
	   System.out.println("Server started...");
	   while (true) {
	   socket = serverSocket.accept();
	   for (int i = 0; i < 10; i++) {
	   System.out.println("Connection from:" + socket.getInetAddress());
	   out = new DataOutputStream(socket.getOutputStream());
	   in = new DataInputStream(socket.getInputStream());
	   if (user[i] == null) {
		   user[i] = new Users(out,in,user);
		   Thread thread = new Thread(user[i]);
		   thread.start();
	   break;
	   }
	   }
	   }
    }
}
class Users implements Runnable { 
	
	DataOutputStream out;
	DataInputStream in;
	Users[] user = new Users[10];

	public Users(DataOutputStream out, DataInputStream in, Users[] user) {
		this.out = out;
		this.in = in;
		this.user = user;
	}
	public void run() {
		while (true) {
			try {
			String message = in.readUTF();
			for (int i = 0; i < 10; i++) {
				if (user[i] != null) {
					user[i].out.writeUTF(message);
				}
			}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
   }
 }