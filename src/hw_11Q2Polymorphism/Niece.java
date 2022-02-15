package hw_11Q2Polymorphism;
/*when same method name ,same parameter but logic is different its call overriding.
 *overriding method is used by only one person. method overriding occurs during run time.
 */
public class Niece extends Sister {
	
		@Override 
	    public int sister(int age1,int age2) {
			int total1 = age1+age2-20;
			System.out.println("Total amount from local calculator: " + total1);
			return total1;
		}
		@Override
		public	int sister(int age1, int age2, int age3) {
			int total2 = age1 + age2+ age3+30;
			System.out.println("total amount from local calculater: " + total2);
			return total2;	
		}
		@Override
		public int sister(int age1,int age2,String age4) {
			int total3 = age1+age2+Integer.parseInt(age4)+50;
			System.out.println("Total amount from local calculator: " + total3);
			return total3;
		}
		//final type method cannot be overriden bcz its final there other class.
		@Override
		public final int sister(int age1,int age2,String age4,int age5) {
			int total4 = age1+age2+Integer.parseInt(age4)+age5-40;
			System.out.println("Total amount from local calculator: " + total4);
			return total4;
		}
		/* @Override: static a special method its belongs to class itself.
		 * static method can't  call by object.
		 * public static int sister(int age1,String age4,int age2,int age3,int age5) {
		 * int total5 = age1+Integer.parseInt(age4)+age2+age3+age5+40;
		 * System.out.println("Total amount from local calculator: " + total5);
		 *return total5;
		 }*/
		@Override
		public void sister(int age1,int age2,int age3,String age4 , int age5, int age6) {
			int total6 = age1+age2+age3+Integer.parseInt(age4)+age5+age6-50;
			System.out.println("Total amount from local calculator: " + total6);
		}
	}


