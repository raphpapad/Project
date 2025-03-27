package csd.uoc.gr.A23.house;

import csd.uoc.gr.A23.warrior.Soldier;

import java.util.ArrayList;

/*
Implement the abstract class “GreatHouse”. A "GreatHouse" has the following characteristics:
	name – Must not be empty
	sigil – Must not be empty
	words – Must not be empty
	lord – Must not be empty
	army – table that will hold the soldiers available to this GreatHouse
	
The attributes name, sigil, words, lord cannot be changed after the initial rendering of values (they must be marked with 
the keyword final). It is worth noting that the attribute army can also be characterized as final. This means that after 
the initial assignment to the army of an instance of, say, ArrayList, it is not possible to subsequently assign another 
instance of ArrayList type. However, the contents of the ArrayList can be changed. See below 
link https://stackoverflow.com/questions/10750791/what-is-the-sense-of-final-arraylist .
*/
public abstract class GreatHouse {
	private final String name;
	private final String sigil;
	private final String words;
	private final String lord;
	private final ArrayList<Soldier> army = new ArrayList<Soldier>();
	
	/*
	Creates a new greatHouse with name, crest, saying, lord. In this case a new instance should be created for the army 
	table but without soldiers in it.
	Restrictions:
		Name, sigil, words, lord must not be empty.*/
	public GreatHouse (String name, String sigil, String words, String lord) {
		//assert(name!=null && sigil !=null && words!=null && lord!=null);		
		this.name = name;
		this.sigil = sigil;
		this.words = words;
		this.lord = lord;
	}
	
	/*Adds a new soldier to the greatHouse army.
	Restrictions:
		Soldier must not be null.*/
	public void addSoldier(Soldier soldier) {
		//assert(soldier!=null); && soldier.getHealthCondition()>0
		if(soldier.getHealthCondition() >= 0) {
			this.army.add(soldier);
		}
	}
	
	/*A soldier returns from the army.
	Restrictions:
		The soldier must be alive*/
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
	
	/*Returns true if greatHouse has no other living soldiers available to fight, false otherwise. 
	If it returns true it means that greatHouse lost the battle and the war.*/
	public boolean isDefeated() {
		for(int i=0; i<this.army.size(); i++) {
			if(this.army.get(i).getHealthCondition()>0) {
				return false;
			}	
		}
		return true;
	}
	
	/*Returns all information for a greatHouse. Eg "The GreateHouse of Starks has lord Eddard Stark. Their sigil is a 'A gray direwolf on a white field' and their words are 'Winter Is Coming'."*/
	@Override
    public String toString() {
    	return "The GreateHouse of "+this.name+" has lord "+this.lord+". Their sigil is a "+this.sigil+" and their words are "+this.words+".";
    }
}
