package csd.uoc.gr.A23;

import java.util.concurrent.ThreadLocalRandom;

/*
Implement the “Swordman” class which extends the Solider class. A “Swordman” has NO extra traits.
*/
class Swordman extends Soldier {
	/*Creates a new swordman with a name, random health (takes values from [5, 10]) and default strength equal to 4.*/
	public Swordman(String firstName, String lastName) {
		this(firstName, lastName, ThreadLocalRandom.current().nextInt(5, 10));
	}

	/*Creates a new swordman with a name, health and default strength equal to 4.
	Restrictions:
		The swordman's health takes values [5, 10].*/
	public Swordman (String firstName, String lastName, int health) {		
		super(firstName, lastName, health, 4);		
		//assert(health>=5 && health<=10);
	}
	
	/*Assigns the WeaponCarrier a weapon.
	Restrictions:
		1. The weapon cannot be null.
		2. The weapon must be an instance of the “Sword” class.
	Aid:
	To make sure the object is of type “Sword” see how you can use instanceof.
	Beware of updating the Weapon holder field.*/
	@Override
	public void setWeapon(Weapon weapon) {
		assert(weapon!=null && weapon instanceof Sword);
		
		weapon.setHolder(this);
		this.weapon = weapon;
	}
	
	/*Returns all information about a Swordsman. Eg "The swordsman Eddard Stark has power 4 and health 5."*/
	@Override
    public String toString() {
    	return "The swordman "+getCallSign()+" has power "+getPower()+" and health "+getHealthCondition()+".";
    }
}
