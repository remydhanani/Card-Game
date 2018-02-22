package com.team25.Cards;

public class Ally_Card extends Adventure_Cards {
	protected int Power;
	protected int Bid = 0;
	protected int Quest_Power = 0;
	protected int Quest_Bid = 0;
	
	// Standard Ally
	public Ally_Card(String Name, String Picture, int Power, int Bid, int Quest_Power, int Quest_Bid) {
		this.Type = "Ally";
		this.Name = Name;
		this.Picture = Picture;
		this.Power = Power;
		this.Bid = Bid;
		this.Quest_Power = Quest_Power;
		this.Quest_Bid = Quest_Bid;
	}
	//Type = Amour
	public Ally_Card(String Name, String Picture) {
		this.Type = "Amour";
		this.Name = Name;
		this.Picture = Picture;
		this.Power = 10;
		this.Bid = 1;
	}

}
