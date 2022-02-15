package hw_11Q3Abstraction;

public abstract class NursingSchool extends RockefellerUniversity{
	
	public abstract void hygiene();
	public String caring() {
    String house = "from nursing Scool";
    System.out.println("This caring house is: " + house);
	return house;
  }
}