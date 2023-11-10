package csd.uoc.gr.A23;

/*
Implement the abstract class “WeaponCarrier”. A “WeaponCarrier” has the trait:
	Weapon weapon – a weapon
*/
abstract class WeaponCarrier {
	public Weapon weapon;
	
	/*Creates a new weaponCarrier, which does not yet possess a weapon (weapon = null).*/
	public WeaponCarrier() {
		weapon = null;
	}
	
	/*WeaponCarrier's weapon returns.*/
	public Weapon getWeapon() {
		return weapon;
	}
	
	/*Assigns the WeaponCarrier a weapon.*/
	public abstract void setWeapon(Weapon weapon);
	
	/*Returns true if the WeaponCarrier has a weapon.*/
	public boolean hasWeapon() {
		if(weapon != null) {
			return true;
		}
		else {
			return false;
		}
	}
}
