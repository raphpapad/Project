package csd.uoc.gr.A23.weapon;

import java.util.concurrent.ThreadLocalRandom; 

/*
Implement the “Sword” class which extends the weapon class. A “Sword” has NO extra traits.
*/
public class Sword extends Weapon {
	/*Creates a new sword with random power (takes values from [3, 4]).*/
	public Sword() {
		this(ThreadLocalRandom.current().nextInt(3, 4));
	}
	
	/*Creates a new sword with power. Restrictions: The power of the sword takes values [3, 4].*/
	public Sword(int power) {
		super(power);
		if(power<3 && power>4) {
			System.out.println("Invalid Sword Power.");
		}
	}
	
	/*Returns information about the sword's power and owner. Eg "The sword has power 10 and is owned by Eddard Stark."*/
	@Override
	public String toString() {
		return "The sword has power "+getPower()+" and is owned by "+getHolder()+".";
	}
}
