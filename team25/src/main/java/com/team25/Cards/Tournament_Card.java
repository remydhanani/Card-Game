package com.team25.Cards;

public class Tournament_Card extends Story_Cards {
	protected final int Bonus_Sheilds;
	public Tournament_Card(String Name, String Picture, int Bonus_Sheilds) {
		this.Type = "Tournament";
		this.Name = Name;
		this.Picture = Picture;
		this.Bonus_Sheilds = Bonus_Sheilds;
		}
	
	public int getBonus_Sheilds() {
		return Bonus_Sheilds;
	}
	

}
