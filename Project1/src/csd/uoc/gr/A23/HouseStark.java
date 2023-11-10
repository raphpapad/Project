package csd.uoc.gr.A23;

/*Implement the “HouseStark” class. “HouseStark” has NO extra traits. “houseStark” will be a Singleton Class as described above.*/
public class HouseStark extends GreatHouse{
	/*Creates the "unique" snapshot of houseStark.
	For initial values you can provide the following:
		name = “Stark”
		sigil = “A gray direwolf on a white field”
		words = “Winter Is Coming”
		lord = “Eddard Stark”*/
	public HouseStark(String name, String sigil, String words, String lord) {
		super("Stark", "A grey direwolf on a white field", "Winter Is Coming", "Eddard Stark");
	}
	
	private static HouseStark instance = null;
	
	// If not static it would be useless
	public static HouseStark getInstance() {
		if(instance == null) {
				instance = new HouseStark("Stark", "'A grey direwolf on a white field'", "'Winter Is Coming'", "Eddard Stark");
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
			HouseStark tmp = HouseStark.getInstance( );
			tmp.demoMethod( );
		}
	}*/
}
