package hw_11Q3Abstraction;

public abstract class EngineeringSchool extends NYUniversity {
	public abstract void mechanicalLab();
	public String computerLab() {
		String name = "South";
		System.out.println("This  computerLab name is: " + name);
		return name;
     }	
}