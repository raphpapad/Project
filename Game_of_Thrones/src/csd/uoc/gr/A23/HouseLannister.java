package csd.uoc.gr.A23;

public class HouseLannister extends GreatHouse{

	public HouseLannister(String name, String sigil, String words, String lord) {
		super("Lannister", "A golden lion rampant on a crimson field", "A Lannister Always Pays His Debts", "Tywin Lannister");
	}
	
	private static HouseLannister instance = null;
	
	// If not static it would be useless
	public static HouseLannister getInstance() {
		if(instance == null) {
				instance = new HouseLannister("Lannister", "'A golden lion rampant on a crimson field'", "'A Lannister Always Pays His Debts'", "Tywin Lannister");
		}
		return instance;
	}
	
	/* A simple method
	public static void demoMethod( ) {
		System.out.println("demoMethod for singleton");
	}
	
	// File Name: SingletonDemo.java
	public class SingletonDemo {
		public void main(String[] args) {
			HouseLannister tmp = HouseLannister.getInstance( );
			tmp.demoMethod( );
		}
	}*/
}
