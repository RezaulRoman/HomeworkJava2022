package hw_11Q2Polymorphism;
 /* Same method name but different type of parameter or different combination of parameter .
  * Overloading has different name also like as Early binding or static binding or compile time.
  * When different methods exist with the same method name but with different parameters.
  * or signature, it is called method overloading. Method Overloading occurs during compile time.
  */
public class Sister {
	 public int sister(int age1,int age2) {
	 int total1 = age1+age2;
	 System.out.println("Total amount from local calculator: " + total1);
	 return total1;
	}	
	 public	int sister(int age1, int age2, int age3) {
	 int total2 = age1 + age2+ age3;
	 System.out.println("total amount from local calculater: " + total2);
	 return total2;	
	}
	public int sister(int age1,int age2,String age4) {
	int total3 = age1+age2+Integer.parseInt(age4);
	System.out.println("Total amount from local calculator: " + total3);
	return total3;
	}
	public  int sister(int age1,int age2,String age4,int age5) {
	int total4 = age1+age2+Integer.parseInt(age4)+age5;
	System.out.println("Total amount from local calculator: " + total4);
	return total4;
	}
	public static int sister(int age1,String age4,int age2,int age3,int age5) {
	int total5 = age1+Integer.parseInt(age4)+age2+age3+age5;
	System.out.println("Total amount from local calculator: " + total5);
	return total5;
	}
	public void sister(int age1,int age2,int age3,String age4 , int age5, int age6) {
	int total6 = age1+age2+age3+Integer.parseInt(age4)+age5+age6;
	System.out.println("Total amount from local calculator: " + total6);
	}
}
