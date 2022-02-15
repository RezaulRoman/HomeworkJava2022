package hw_11Q3Abstraction;

public interface College {
	public void commonRoom();
	public String laboratory();
	public void languageClub();
	
	public default void methoddorm() {
	System.out.println("This default method from college interface");
	}
	public static void studyRoom() {
	System.out.println("This static method from college interface class");
	}	
}   /* Static is a special method its belongs to class itself.
     * Static method cannot be call by object.
     */
