package csd.uoc.gr.A23;

/*
Implement the abstract class “Weapon”. A “Weapon” has the following characteristics:
 power
 WeaponCarrier holder - The holder of the weapon (the class will be implemented in the next step “Step 4”).
 The power attribute cannot be changed after the initial value rendering (Must be marked with the final keyword).
*/
abstract class Weapon {
    private final int power;
    private WeaponCarrier holder = null;
    
	/*Creates a new weapon with power and no owner.*/
    public Weapon(int power) {
    	this.power = power;
    }
    
	/*Returns the weapon's power.*/
    public int getPower() {
    	return this.power;
    }
    
	/*Assigns the owner of the weapon.*/
    public void setHolder(final WeaponCarrier holder) {
    	this.holder = holder;
    }
    
	/*Returns the owner of the weapon, if the weapon has no owner it returns null.*/
    public WeaponCarrier getHolder() {
    	if(holder != null) {
    		return holder;
    	}
    	else {
    		return null;
    	}
    }
    
	/*Returns information about a weapon.*/
    @Override
    public String toString() {
    	return "The weapon has power "+getPower()+" and the holder is "
    			+getHolder()+".";
    }
} 
