package com.team25.Cards;

public class Event_Card extends Cards {
	protected int number;
	
	public Event_Card(String Name, String Picture, int number) {
		this.Type = "Event";
		this.Name = Name;
		this.Picture = Picture;
		this.number = number;	// since we are using 1.7 cant use strings in a switch statement.
	}
	/*
	 * 1 -> Chivalrous Deed
	 * 2 -> Pox
	 * 3 -> Plague
	 * 4 -> King's recognition
	 * 5 -> Queen's Favor
	 * 6 -> Court Called to Camelot
	 * 7 -> King's Call to Arms
	 * 8->Prosperity Throughout the Realm 
	 * */
	public void Activate_Event() {
		switch(number){
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			case 7: break;
			case 8: break;
			default:
				System.out.println("You Done Shit The Bed, Somehow.");
		}
	}
}
