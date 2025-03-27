package csd.uoc.gr.A23.house;

/*
To complete the exercise we want to create two more classes "HouseStark" and "HouseLannister" and both extend the GreatHouse 
class. These two classes will belong to the category of Singleton Classes, which means that we will allow only one 
instantiation of each. You can see in the following piece of code, how we create a singleton class. For more details 
see the link https://www.tutorialspoint.com/java/java_using_singleton.htm .
*/

/*Implement the “HouseLannister” class. “HouseLannister” has NO extra traits. “houseLannister” will be a Singleton Class as described above.*/
public class HouseLannister extends GreatHouse{
	/*Creates the "unique" snapshot of houseLannister.
	For initial values you can provide the following:
		name = “Lannister”
		sigil = “A golden lion rampant on a crimson field”
		words = “A Lannister Always Pays His Debts”
		lord = “Tywin Lannister”*/
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
