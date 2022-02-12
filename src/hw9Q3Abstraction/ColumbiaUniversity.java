package hw9Q3Abstraction;

public class ColumbiaUniversity extends MedicalSchool {
	// public abstract void chemistry(); so in regular class you cannot declared
	// method
	public void biology() {
		System.out.println("This is from bilogy non abstract method");
	}
	public ColumbiaUniversity() {
	}// A regular class can inherits by two keyword.
	 /* A regular class can inherits only one regular class or one abstract class by
	  extends keyword but a regular class cannot inherits interface by extends keyword*/
	 /*Only one can possible by extends keyword but by implements a regular class
	 can inherit more then one interface*/

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		}
    @Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
    	}
	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
	}
	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
	}
	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
    }
    @Override
	public void languageClub() {
		// TODO Auto-generated method stub
    }
	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
	}
	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
	}
} 