package com.team25.Cards;

public class Foe_Card extends Cards {
	protected int Strength;
	protected int Quest_Strength;

	public Foe_Card(String Name, String Picture, int Strength, int Quest_Strength) {
		this.Type = "Foe";
		this.Name = Name;
		this.Picture = Picture;
		this.Strength = Strength;
	}
	
	public int getStrength() {
		/*
		 * if current quest foe = Name && != null return Quest_Strenght;
		 * */
	return Strength;
	}

}
