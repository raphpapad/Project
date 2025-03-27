package csd.uoc.gr.A23.warrior;

import csd.uoc.gr.A23.weapon.Arc;
import csd.uoc.gr.A23.weapon.Weapon;

import java.util.concurrent.ThreadLocalRandom;

/*
Implement the “Archer” class. An “Archer” has NO extra traits.
*/
public class Archer extends Soldier {
	/*Creates a new archer with a name, random health (takes values from [1, 5]) and default strength equal to 2.*/
	public Archer (String firstName, String lastName) {
		this(firstName, lastName, ThreadLocalRandom.current().nextInt(1, 5));
	}
	
	/*Creates a new archer with a name, health and default strength equal to 2.
	Restrictions:
		The archer's health takes values [1, 5].*/
	public Archer (String firstName, String lastName, int health) {
		super(firstName, lastName, health, 2);
		//assert(health>=1 && health<=5);
	}

	/*Assigns the WeaponCarrier a weapon.
	Restrictions:
		1. The weapon cannot be null.
		2. The weapon must be an instance of the “Arc” class.
	Aid:
	To make sure the object is of type “Arc” see how you can use instanceof.
	Beware of updating the Weapon holder field.*/
	@Override
	public void setWeapon(Weapon weapon) {
		assert(weapon!= null && weapon instanceof Arc);
		
		weapon.setHolder(this);
		this.weapon = weapon;
	}
	
	/*Returns all information about an Archer. Eg “The archer Tywin Lannister has power 2 and health 1.”*/
	@Override
    public String toString() {
    	return "The archer "+getCallSign()+" has power "+getPower()+" and health "+getHealthCondition()+".";
    }
}
