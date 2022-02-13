package hw_03Q2javavariables;

public class AboutMe {
// Variable is declared I
	public String bangladesh;
// Variable is declared and initialized
	public String name = "Roman";
	public char gender = 'M';
	public int age = 28;
	public short myStudentLoan = 30000;
	public long myAnnualIncome = 500000000000l;
	public boolean usCitizen = true;
	public byte myFatherAge = 100;
	public float myHighSchoolGrade = 3.14f;
	public double myAssociteGrade = 4.589805555;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.name);
		System.out.println(aboutMe.gender);
		System.out.println(aboutMe.age);
		System.out.println(aboutMe.myStudentLoan);
		System.out.println(aboutMe.myAnnualIncome);
		System.out.println(aboutMe.usCitizen);
		System.out.println("\"Roman\"");
		
		System.out.println(aboutMe.myFatherAge);
		System.out.println(" My point:" + aboutMe.myHighSchoolGrade + ", myAssociteGrade" + aboutMe.myAssociteGrade);
		System.out.println(aboutMe.name);

	}

}
