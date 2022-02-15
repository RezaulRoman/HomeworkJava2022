package hw_11Q3Abstraction;

public interface LawSchool {
	public void lawInfo();
	
	public static void lawSchoolField() {
	System.out.println("This static method from LawSchool interface");
	}
	public default void lawSchoolRoom() {
	System.out.println("This default from LawSchool interface class");
	}
  }
