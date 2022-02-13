package hw_10Q2UseOfSuperInChildClass;

public class Father {
	public String Name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String FamilyName;
	
	public Father() {
		System.out.println("This default constractor from Father class");
	}
	public Father(String name, int age, char sex, boolean usCitizen) {
		this.Name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father Name: " + name + ", \nAge: " + age + ", \nSex: " + sex + ", \nisUsCitizen?: " +usCitizen );
	}
	public void father() {
		System.out.println("This default void method from Father class");
	}
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.Name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father Name: " + name + ", \nAge: " + age + ", \nSex: " + sex + ", \nisUsCitizen?: " +usCitizen );
	}
}


