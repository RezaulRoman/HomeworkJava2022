package hw_10Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;
	
	public Daughter() {
	super("Jack",50,'F',false);
	super.FamilyName="Jack";
	System.out.println("Name: "+ FamilyName);
	System.out.println("This default constractor came  from Daughter class");	
	}
	public Daughter(String birthMonth, int age) {
		super("Pitbull",80,'M',true);
		super.FamilyName="Jack";
		System.out.println("\nName: "+ FamilyName);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month: " + birthMonth + " \nAge: " + age);
	}
	public void daughter() {
		System.out.println("This default method came from Father class");
	}
	public void daughterInfo(String birthMonth, int age) {
		super.FamilyName="Alex";
		System.out.println("Name: "+ FamilyName);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month: " + birthMonth + " \nAge: " + age);
	}
}
