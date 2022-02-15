package hw_11Q2Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("<<<< From Sister calculator <<<<<< ");
		Sister sr = new Sister();
		sr.sister(62, 38);
		sr.sister(20, 30, 90);
		sr.sister(40, 50, "18");
		sr.sister(21, 25, "10", 29);
		Sister.sister(16, "17", 21, 24, 28);
		/* static a special method its belongs to class itself.
		 * static method can't  call by object
		 */
		sr.sister(17, 19, 22, "75", 32, 49);
		
		System.out.println("\n<<<< From Niece calculator <<<<<< ");
		Niece n = new Niece();
		n.sister(62, 38);
		n.sister(20, 30, 90);
		n.sister(40, 50, "18");
		n.sister(21, 25, "10", 29);
		n.sister(17, 19, 22, "75", 32, 49);
	}
}
