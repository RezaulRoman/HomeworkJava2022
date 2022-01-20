package hw5Q2Constructor;

public class Student {
	public String stName;
	public char sex;
	public int stId;
	public boolean isProgrammer;
	public float grade;

public Student() {
	System.out.println("This defualt constructor is from Student");
 
}
	public Student(String stName , char sex , int stId , boolean isProgrammer ,float grade) {
		this.stName=stName;
		this.sex=sex;
		this.stId=stId;
		this.isProgrammer=isProgrammer;
		this.grade=grade;
		System.out.println("Student name is:" +stName+ ",He is:" +sex+ ",His id is:" +stId+ ",is He programmer? Ans:" +isProgrammer+ ",His grade is:" +grade);
		
	}


	}


