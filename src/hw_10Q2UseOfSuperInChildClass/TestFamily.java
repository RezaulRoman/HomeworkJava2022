package hw_10Q2UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("\n......default constractor initialized for Father class......\n");
		Father father1 = new Father();
		
		System.out.println("\n-----parameterizrd contructor initialized for Father class---\n");
		Father father2 = new Father("Mhabub",70,'M',false);
		
		System.out.println("\n........Void type method initialized for Father class......\n");
		father2.father();
		
		System.out.println("\n.........Void parameterized type initialized for Father class......\n");
		father2.fatherInfo("Mhommaed",60,'M',true);
		
		System.out.println("\n......default constractor initialized for Daughter class......\n");
		Daughter daughter1 = new Daughter();
		
		System.out.println("\n-----parameterizrd contructor initialized for Daughter class---\n");
		Daughter daughter2 = new Daughter("January",25);
		
		System.out.println("\n........Void type method initialized for Daughter class......\n");
        daughter2.daughter();
        
        System.out.println("\n.........Void parameterized type initialized for Daughter class......\n");
        daughter2.daughterInfo("December",20);
	}
}
