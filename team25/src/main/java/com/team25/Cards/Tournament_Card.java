package com.team25.Cards;

public class Tournament_Card extends Cards {
	protected final int Bonus_Shields;
	public Tournament_Card(String Name, String Picture, int Bonus_Shields) {
		this.Type = "Tournament";
		this.Name = Name;
		this.Picture = Picture;
		this.Bonus_Shields = Bonus_Shields;
		}
	
	public int getBonus_Shields() {
		return Bonus_Shields;
	}
	

}
