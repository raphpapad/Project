package csd.uoc.gr.A23;

import java.util.concurrent.ThreadLocalRandom;

class Swordman extends Soldier {
	public Swordman(String firstName, String lastName) {
		this(firstName, lastName, ThreadLocalRandom.current().nextInt(5, 10));
	}

	public Swordman (String firstName, String lastName, int health) {		
		super(firstName, lastName, health, 4);		
		//assert(health>=5 && health<=10);
	}
	
	@Override
	public void setWeapon(Weapon weapon) {
		assert(weapon!=null && weapon instanceof Sword);
		
		weapon.setHolder(this);
		this.weapon = weapon;
	}
	
	@Override
    public String toString() {
    	return "The swordman "+getCallSign()+" has power "+getPower()+" and health "+getHealthCondition()+".";
    }
}
