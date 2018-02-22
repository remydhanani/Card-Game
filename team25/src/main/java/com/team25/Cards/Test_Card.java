package com.team25.Cards;

public class Test_Card extends Adventure_Cards {
	protected int Min_Bid;
	
	// Min_Bid and Special_Quest is 0/null if it doesn't Have One
	public Test_Card(String Name, String Picture, int Min_Bid) {
		this.Type = "Test";
		this.Name = Name;
		this.Picture = Picture;
		this.Min_Bid = Min_Bid;
	}
	
	@SuppressWarnings("unused")// temporary till we implement some logic
	public int getMin_Bid() {
		if(Name.toLowerCase() == "test of the questing beast" && false) { //&& current Quest is "search for the questing beast quest"
					return 4;	
		} else{// if(Active_Players == 1) {return 3;} else return Min_Bid;
		return Min_Bid;
		}
	}
}
