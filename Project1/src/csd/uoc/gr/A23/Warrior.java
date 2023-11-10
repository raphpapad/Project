package csd.uoc.gr.A23;

public interface Warrior {
	public void attack(Warrior adversary);
	public boolean isDefeated();
	
	public int getHealthCondition();
	public void setHealthCondition(int condition);
	
	public int getPower();
	public String getCallSign();
}
