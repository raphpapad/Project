package csd.uoc.gr.A23;

import java.util.concurrent.ThreadLocalRandom; 

class Sword extends Weapon {
	public Sword() {
		this(ThreadLocalRandom.current().nextInt(3, 4));
	}
	
	public Sword(int power) {
		super(power);
		if(power<3 && power>4) {
			System.out.println("Invalid Sword Power.");
		}
	}
	
	@Override
	public String toString() {
		return "The sword has power "+getPower()+" and is owned by "+getHolder()+".";
	}
}
