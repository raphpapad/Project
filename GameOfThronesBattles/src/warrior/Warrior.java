package csd.uoc.gr.A23.warrior;

public interface Warrior {
	/*
	Attacks an opponent.
	Restrictions:
		1. A warrior cannot attack himself.
		2. The warrior making the attack must have health >0.
		3. At the end of the attack it must be printed that the current warrior (his name) 
		attacked the adversary (his name) as well as the new state (health) of the adversary. 
		After the attack, the adversary's state must be less than its previous state.
	Algorithm (for calculating the force that will be removed from the adversary)
		1. We take the power of the attacker.
		2. If the attacker has a weapon, we take the weapon's power.
		3. The sum of steps 1, 2 is the total reduction that will be made to the defender's condition.
	*/
	public void attack(Warrior adversary);
	
	/*Returns if the warrior has been defeated (ie health is ≤ 0).*/
	public boolean isDefeated();
	
	/*Returns the warrior status.*/
	public int getHealthCondition();
	
	/*Assigns the status to the warrior.
		Restrictions:
			The warrior must not have been defeated.*/
	public void setHealthCondition(int condition);
	
	/*Returns the attack power the warrior has*/
	public int getPower();
	
	/*Returns the warrior's first name.*/
	public String getCallSign();
}
