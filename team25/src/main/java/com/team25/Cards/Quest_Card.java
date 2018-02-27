package com.team25.Cards;

public class Quest_Card extends Cards {
	protected final int Num_Stages;
	protected final String Quest_Foe;
		
	public Quest_Card(String Name, String Picture, int Num_Stages, String Quest_Foe) {
		this.Type = "Quest";
		this.Name = Name;
		this.Picture = Picture;
		this.Num_Stages = Num_Stages;
		this.Quest_Foe = Quest_Foe;
	}
	
	public int getNum_Stages() {
		return Num_Stages;
	}
	
	public String getQuest_Foe() {
		return Quest_Foe;
	}
}
