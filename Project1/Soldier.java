package csd.uoc.gr.A23;

public abstract class Soldier extends WeaponCarrier implements Warrior {
	private String firstName;
	private String lastName;
	private int power;
	private int health;
	
	public Soldier (String firstName, String lastName, int health, int power) {
		assert(firstName!=null && lastName!=null);
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.power = power;
		this.health = health;
	}
	
	public boolean isDefeated() {
		if(health <= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void attack(Warrior adversary) {
		//assert(isDefeated()==false && getCallSign()!=adversary.getCallSign());
		
		adversary.setHealthCondition(adversary.getHealthCondition() - power);
		
		System.out.println("Warrior "+getCallSign()+ " has attacked "+
				adversary.getCallSign()+ " and his adversary now has "+
				adversary.getHealthCondition()+" health.");
	}
	
	@Override
	public int getHealthCondition() {
		return health;		
	}
	
	@Override
	public void setHealthCondition(int condition) {
		health = condition;
	}
	
	@Override
	public String getCallSign() {
		return (firstName+ " " +lastName);
	}
	
	@Override
	public int getPower() {
		return power;
	}
	
	@Override
    public void setWeapon(final Weapon weapon) {
        this.weapon = weapon;
    } 
	
	@Override
	public String toString() {
		return "The Soldier is called "+getCallSign()+", he has power "+
				getPower()+" and he has health "+getHealthCondition()+".";	
	}
}
