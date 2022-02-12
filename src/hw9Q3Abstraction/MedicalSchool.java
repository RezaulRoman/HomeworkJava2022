package hw9Q3Abstraction;
      /*An abstract class can inherit regular and abstract class by extends keyword
      and by implements more then one interface*/ 
public abstract class MedicalSchool extends NursingSchool implements Hospital,College {
	  public abstract void anatomyLab();
      public void biochemistryLab() {
	  System.out.println("This Is from  biochmistryLab non abstract method");
}	  //yes and this is default constructors
	  public MedicalSchool() {
  }   //Two keyword can inherit in java Abstract class. 
}     //Two keyword is extends and implements.
      /*An abstract class can inherit by extends keyword regular and abstract class
         but not interface*/
      /*An abstract class can inherit only one regular class
         or one abstract class by extends keyword*/
      // but with implements an abstract class can inherits interface more then one. 