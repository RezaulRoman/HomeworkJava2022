package hw_11Q3Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	// public abstract void chemistry(); so in regular class you cannot declared
	// method
	public void biology() {
	System.out.println("This is from bilogy non abstract method");
	}
	
	public String columbiaUniversityLocation() {
	String location = "NewYork";		
	System.out.println("This is from columbiaUniversity method");
	return location;
	} /* A regular class can inherits by two keyword.
	   * A regular class can inherits only one regular class or one abstract class by
	   * extends keyword but a regular class cannot inherits interface by extends keyword.
	   * Only one can possible by extends keyword but by implements a regular class
	   * can inherit more then one interface
	   */
	 public static void columbiaUniversityInfo() {
	 System.out.println("This static method from columbiaUnibersity");
	 }
	 
	 public final int columbiaUniversityField(int a,int x) {
	 int total  = a-x;
	 System.out.println("This final method is from columbiaUniversity: " + total);
	 return total;
	 }
	
	@Override
	public void emergencyRoom() {
	System.out.println("emergencyRoom method  from  hospital interfce class");
	}
	@Override
	public String surgeryRoom() {
	String name = "from Hospital";
	System.out.println("suergeryRoom located: " + name);
	return name;
	}
	@Override
	public void cafeteria() {
	System.out.println("cafeteria method from hospital interface class");
	}
	@Override
	public void commonRoom() {
	System.out.println("commonRoom method from college interface class");
	}
	@Override
	public String laboratory() {
	String name = "from college";
	System.out.println("laboratory from: " + name);
	return name;
	}
	@Override
	public void languageClub() {
	System.out.println("languageClub method from college Interfac class");
	}
	@Override
	public void anatomyLab() {
    System.out.println("anatomyLab method from Medical School abstract class");
	}
	@Override
	public void hygiene() {
	System.out.println("hygiene method from nursingSchool abstract class");
	}
	@Override
	public int vocationalInfo() {
	int room = 5;
	System.out.println("vocationalInfo value is: " + room );
	return room;
	}
	@Override
	public int classSize() {
	int size = 1000;
	System.out.println("classSize is: " + size);
	return size;
	}
	@Override
	public String playGround() {
	String name ="City Field";
	System.out.println("playGround method Name is: " + name);
	return name;
	}
	@Override
	public void teacher() {
	System.out.println("teacher method from University interface class");		
	}
	@Override
	public void lawInfo() {
    System.out.println("lawInfo method from LawSchool interface class");      	
   }
}