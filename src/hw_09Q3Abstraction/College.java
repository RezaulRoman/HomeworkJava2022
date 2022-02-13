package hw_09Q3Abstraction;

public interface College {
	public void commonRoom();
	public void laboratory();
	public void languageClub();
	
	public default void methoddorm() {		
	}
	public static void studyRoom() {		
	}	
}
