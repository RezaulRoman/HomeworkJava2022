package hw5Q2Constructor;

public class Computer {
// Variable is declared
	public String brandName;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeinUSA;

//Declared one default constructor and one parameterized constructor
	public Computer() {
		System.out.println("This is from default cronstractor of computer class ");
}       public Computer(String brandName, String model, String operatingSystem, int price, char grade, boolean MadeinUSA) {
		this.brandName = brandName;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeinUSA = madeinUSA;
		System.out.println("My brand: " + brandName + ",Model: " + model + ", Operating System: " + operatingSystem
				+ ",Price is: " + price + ", Grade is: " + grade + " and Made in USA? Ans: " + madeinUSA);
	}

}
