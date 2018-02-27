package com.team25.Cards;

public class Weapon_Card extends Cards {
	protected int Power;

	public Weapon_Card(String Name, String Picture, int Power) {
		this.Type = "Weapon";
		this.Name = Name;
		this.Picture = Picture;
		this.Power = Power;
	}
	
	public int getPower() {return Power;}

}
