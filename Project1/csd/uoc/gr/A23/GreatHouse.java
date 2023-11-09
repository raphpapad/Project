package csd.uoc.gr.A23;

import java.util.ArrayList;

public abstract class GreatHouse {
	private final String name;
	private final String sigil;
	private final String words;
	private final String lord;
	private final ArrayList<Soldier> army = new ArrayList<Soldier>();
	
	public GreatHouse (String name, String sigil, String words, String lord) {
		//assert(name!=null && sigil !=null && words!=null && lord!=null);		
		this.name = name;
		this.sigil = sigil;
		this.words = words;
		this.lord = lord;
	}
	
	public void addSoldier(Soldier soldier) {
		//assert(soldier!=null); && soldier.getHealthCondition()>0
		if(soldier.getHealthCondition() >= 0) {
			this.army.add(soldier);
		}
	}
	
	public Soldier getSoldier() {
		int i=0;
		while(i < this.army.size()) {
			if(this.army.get(i).getHealthCondition()>0) {
				Soldier unit = this.army.get(i);			
				return unit;	
			}
		}		
		return null;
	}
	
	public boolean isDefeated() {
		for(int i=0; i<this.army.size(); i++) {
			if(this.army.get(i).getHealthCondition()>0) {
				return false;
			}	
		}
		return true;
	}
	
	@Override
    public String toString() {
    	return "The GreateHouse of "+this.name+" has lord "+this.lord+". Their sigil is a "+this.sigil+" and their words are "+this.words+".";
    }
}
