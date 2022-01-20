package hw5Q2Constructor;

public class Computer {
// Variable is declared
	public String brandName;
	public char grade;
	public int price;
	public boolean madeinUSA;
	public String operatingSystem;
//Declared one default constructor and one parameterized constructor
	public Computer() {
	System.out.println("The default cronstractor is from computer class ");

	}
	
	public Computer(String brandName,char grade,int price,boolean madeinUSA,String operatingSystem) {
		this.brandName = brandName;
		this.grade=grade;
		this.price=price;
		this.madeinUSA=madeinUSA;
		this.operatingSystem=operatingSystem;
		System.out.println("The computer name is:" +brandName+ ",Grade is:" +grade+ ",price is:" +price+ ",Madein USA? Ans:" +madeinUSA+ ",operatingSystem is:" +operatingSystem);
	}


		
	}
