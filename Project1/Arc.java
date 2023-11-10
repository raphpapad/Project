package csd.uoc.gr.A23;

import java.util.concurrent.ThreadLocalRandom; 

class Arc extends Weapon{
	public Arc() {
		this(ThreadLocalRandom.current().nextInt(3, 4));
	}

	public Arc(int power) {
		super(power);
		if(power<1 && power>2) {
			System.out.println("Invalid Arch Power.");
		}
	}
	
	@Override
	public String toString() {
		return "The arc has power "+getPower()+" and is owned by "+getHolder()+".";
	}	
}
