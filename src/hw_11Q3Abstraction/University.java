package hw_11Q3Abstraction;
/*Here is i did interface(University)inherit more then one by extends keyword*/
public interface University extends College,Hospital {
	public int classSize();
	public String playGround();
    public void teacher();
    //default and static method.
    public default void gymnasium() {
    	System.out.println("This default method gymnasium from university");
    }
    public static void library() {
    	System.out.println("This static method library fromn University ");
    }
}   /* Static is a special method its belongs to class itself.
     * Static method cannot be call by object.
     * only one keyword its call extends.
     * An interface can inherit more then one interface by extends keyword.
     * But it cannot inherits regular class or abstract class by extends keyword.
     * More then one.
     */