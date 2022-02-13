
package hw_04Q2javaVariables;

public class AboutMe {
// variables declared
	public String name = "Roman";
	public char gender = 'M';
	public int age = 28;
	public short myStudentLoan = 30000;
	public long myAnnualIncome = 500000000000l;
	public boolean usCitizen = true;
	public byte myFatherAge = 100;
	public float myHighSchoolGrade = 3.14f;
	public double myAssociteGrade = 4.589805555;

	
	//Constructor declared
	public AboutMe() {
		System.out.println("My information is below");
	}
 // method implemented
	public void aboutMe() {
		//AboutMe aboutMe = new AboutMe();
		System.out.println("My Name is:"+name+ "\nMY gender:"+gender+ "\nMy age:"+age+ "\nMy StudentLoan:"+myStudentLoan+ "\nMy AnnualIncome:"+myAnnualIncome+ "\nUsCitizen:"+usCitizen+ "\nMy FatherAge:"+myFatherAge+"\nMy point:"+myHighSchoolGrade+ "\nMy AssociteGrade:"+ myAssociteGrade );
	}
		
	//public static void main(String[] args) {
	//AboutMe me = new AboutMe();
	//me.aboutMe(); 

	}


