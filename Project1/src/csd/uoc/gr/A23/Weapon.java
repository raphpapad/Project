package csd.uoc.gr.A23;

abstract class Weapon {
    private final int power;
    private WeaponCarrier holder = null;
    
    public Weapon(int power) {
    	this.power = power;
    }
    
    public int getPower() {
    	return this.power;
    }
    
    public void setHolder(final WeaponCarrier holder) {
    	this.holder = holder;
    }
    
    public WeaponCarrier getHolder() {
    	if(holder != null) {
    		return holder;
    	}
    	else {
    		return null;
    	}
    }
    
    @Override
    public String toString() {
    	return "The weapon has power "+getPower()+" and the holder is "
    			+getHolder()+".";
    }
} 
