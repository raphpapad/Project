package csd.uoc.gr.A23;

public class HouseStark extends GreatHouse{

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
