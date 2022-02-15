package hw_11Q3Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {
	public void maths() {
		System.out.println("This is from maths non abstract method");
   }
	
	@Override
	public void aeronauticalInfo() {
	System.out.println("aeronuticalInfo Method from AeronauticalSchool interface class");
	}
	@Override
	public void mechanicalLab() {
	System.out.println("mechanicalLab method from EngineeringSchool abstract class");		
	}
}