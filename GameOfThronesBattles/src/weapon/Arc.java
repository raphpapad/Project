package csd.uoc.gr.A23.weapon;

import java.util.concurrent.ThreadLocalRandom; 

/*
Implement the “Arc” class which extends the weapon class. An “Arc” has NO extra traits.
*/
public class Arc extends Weapon{
	/*Creates a new arc with random force (takes values from [1, 2]) , without an owner.*/
	public Arc() {
		this(ThreadLocalRandom.current().nextInt(3, 4));
	}

	/*Creates a new arc with force and no owner. Restrictions: The strength of the arc takes values [1, 2].*/
	public Arc(int power) {
		super(power);
		if(power<1 && power>2) {
			System.out.println("Invalid Arch Power.");
		}
	}
	
	/*Returns the arc strength and owner information. Eg "The arc has power 5 and is owned by Tywin Lannister."*/
	@Override
	public String toString() {
		return "The arc has power "+getPower()+" and is owned by "+getHolder()+".";
	}	
}
