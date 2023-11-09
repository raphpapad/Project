package csd.uoc.gr.A23;

abstract class WeaponCarrier {
	public Weapon weapon;
	
	public WeaponCarrier() {
		weapon = null;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	public abstract void setWeapon(Weapon weapon);
	
	public boolean hasWeapon() {
		if(weapon != null) {
			return true;
		}
		else {
			return false;
		}
	}
}
