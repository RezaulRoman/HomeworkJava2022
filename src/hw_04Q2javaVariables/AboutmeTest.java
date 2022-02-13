package hw_04Q2javaVariables;

public class AboutmeTest {

	public static void main(String[] args) {

		AboutMe me = new AboutMe();
		me.name = "Roman";
		me.gender = 'M';
		me.age = 28;
		me.myStudentLoan = 30000;
		me.myAnnualIncome = 500000000000l;
		me.usCitizen = true;
		me.myFatherAge = 100;
		me.myHighSchoolGrade = 3.14f;
		me.myAssociteGrade = 4.589805555;
		me.aboutMe();

		System.out.println("\nMy friend alex information below\n");

		AboutMe me2 = new AboutMe();
		me2.name = "Alex";
		me2.gender = 'M';
		me2.age = 30;
		me2.myStudentLoan = 30000;
		me2.myAnnualIncome = 500000000000l;
		me2.usCitizen = false;
		me2.myFatherAge = 60;
		me2.myHighSchoolGrade = 2.14f;
		me2.myAssociteGrade = 8.589805555;
		me2.aboutMe();

	}

}
