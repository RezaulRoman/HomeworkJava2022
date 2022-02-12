package hw9Q3Abstraction;
/*Here is i did interface(University)inherit more then one by extends keyword*/
public interface University extends College,Hospital {
	public void classSize();
	public void playGround();
    public void teacher();
    //default and static method.
    public default void gymnasium() {    	
    }
    public static void library() {    	
    }    
}   //only one keyword its call extends.
    //An interface can inherit more then one interface by extends keyword.
    //But it cannot inherits regular class or abstract class by extends keyword.
    //More then one.
