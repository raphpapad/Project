package csd.uoc.gr.A23;

/*
Implement the abstract class “Soldier” which extends the weaponCarrier class and implements the Warrior interface. A “Soldier” has the following traits:
	firstName - Must not be empty
	lastName - Must not be empty
	health - The health of the soldier. During the battle it can take a negative value, for any value health ≤ 0 it will mean that the soldier is killed)
	power
	The attributes firstName, lastName, power cannot be changed after initial value rendering. (They must be marked with the keyword final.)
*/
public abstract class Soldier extends WeaponCarrier implements Warrior {
	private String firstName;
	private String lastName;
	private int power;
	private int health;
	
	/*Creates a new soldier with a name, health and strength.
	Restrictions:
		The first and last name must not be blank.*/
	public Soldier (String firstName, String lastName, int health, int power) {
		assert(firstName!=null && lastName!=null);
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.power = power;
		this.health = health;
	}
	
	/*It returns true if the soldier has been killed (that is, when the value of health ≤ 0), otherwise it returns false.*/
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
	
	/*Returns the soldier status.*/
	@Override
	public int getHealthCondition() {
		return health;		
	}
	
	/*Assigns the situation to soldier.
	Restrictions:
		The soldier must not have been defeated.*/
	@Override
	public void setHealthCondition(int condition) {
		health = condition;
	}
	
	/*Returns the first name of the soldier.*/
	@Override
	public String getCallSign() {
		return (firstName+ " " +lastName);
	}
	
	/*Returns the attack power the soldier has*/
	@Override
	public int getPower() {
		return power;
	}
	
	@Override
    public void setWeapon(final Weapon weapon) {
        this.weapon = weapon;
    } 
	
	/*Returns all information about a soldier.*/
	@Override
	public String toString() {
		return "The Soldier is called "+getCallSign()+", he has power "+
				getPower()+" and he has health "+getHealthCondition()+".";	
	}
}
