package csd.uoc.gr.A23;

import java.util.concurrent.ThreadLocalRandom;

public class Archer extends Soldier {
	public Archer (String firstName, String lastName) {
		this(firstName, lastName, ThreadLocalRandom.current().nextInt(1, 5));
	}
	
	public Archer (String firstName, String lastName, int health) {
		super(firstName, lastName, health, 2);
		//assert(health>=1 && health<=5);
	}

	@Override
	public void setWeapon(Weapon weapon) {
		assert(weapon!= null && weapon instanceof Arc);
		
		weapon.setHolder(this);
		this.weapon = weapon;
	}
	
	@Override
    public String toString() {
    	return "The archer "+getCallSign()+" has power "+getPower()+" and health "+getHealthCondition();
    }
}
