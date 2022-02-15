package hw_11Q3Abstraction;

public interface Hospital {
	public void emergencyRoom();
	public String surgeryRoom();
	public void cafeteria();
	
	public default void morgue() {
	System.out.println("This default method morgue from Hospital interface class");
		
	}
	/* Static is a special method its belongs to class itself.
	 * Static method cannot be call by object.
	*/
	public static void pharmacy() {
	System.out.println("This static method pharmacy from Hospital interface class");
	}				
 }
