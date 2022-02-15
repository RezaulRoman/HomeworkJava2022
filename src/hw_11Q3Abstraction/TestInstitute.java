package hw_11Q3Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
	 System.out.println("<<<<<<<<Rrgular Class<<<<<<<<<<");
	 
	 ColumbiaUniversity columbiaUniversity =new ColumbiaUniversity();
	 columbiaUniversity.biology();
	 columbiaUniversity.columbiaUniversityLocation();
	 ColumbiaUniversity.columbiaUniversityInfo();
	 // Static method call by own class.
	 columbiaUniversity.columbiaUniversityField(50,20);
	 columbiaUniversity.emergencyRoom();
	 columbiaUniversity.surgeryRoom();
	 columbiaUniversity.cafeteria();
	 /* Static is a special method its belongs to class itself.
	  * Static method cannot be call by object.
	  * columbiaUniversity.pharmacy();
	  */
	 columbiaUniversity.commonRoom();
	 columbiaUniversity.laboratory();
	 columbiaUniversity.languageClub();
	 columbiaUniversity.anatomyLab();
	 columbiaUniversity.hygiene();
	 columbiaUniversity.vocationalInfo();
	 columbiaUniversity.classSize();
	 columbiaUniversity.playGround();
	 columbiaUniversity.teacher();
	 columbiaUniversity.lawInfo();
	 columbiaUniversity.aeronauticalInfo();
	 columbiaUniversity.methoddorm();
	 columbiaUniversity.computerLab();
	 columbiaUniversity.morgue();
	 //we can call also  default method here too morgue.
	 columbiaUniversity.biochemistryLab();
	 columbiaUniversity.caring();
	 columbiaUniversity.anthropology();
	 columbiaUniversity.maths();
	 columbiaUniversity.aeronauticalInfo();
	 columbiaUniversity.mechanicalLab();
	 columbiaUniversity.gymnasium();
	 
	 System.out.println("<<<<<<<<<<<interface class<<<<<<<<");
	 
	 University university = new ColumbiaUniversity();
	/* University university = new University();
	 * Cannot instantiate the University.
	 * an interface can't be instantiated, it needs the help of a concrete class,
	 * here ColumbiaUnivercity is a concrete class.
	 * Because ColumbiaUniversity implements University.	
	 */
	 university.classSize();
	 university.playGround();
	 university.teacher();
	//we can call also  default method here too gymnasium.
	 university.gymnasium();
	 /* Static is a special method its belongs to class itself.
	  * Static method cannot be call by object.
	  * university.library();
	  * Static method call by own class.
	  */
	 University.library();
	 university.commonRoom();
	 university.laboratory();
	 university.languageClub();
	 university.methoddorm();
	 //University.studyRoom();
	 //we cannot call static method from other class.
	 university.emergencyRoom();
	 university.surgeryRoom();
	 university.cafeteria();
	 university.morgue();
	 //university.pharmacy();
	//we cannot call static method from other class.
	 
	 System.out.println("<<<<<<<<<<abstract class<<<<<<<<");
	 
	/* MedicalSchool medicalSchool = new MedicalSchool();  
	 * Cannot instantiate the MedicalSchool.
	 * an abstract class can't be instantiated, it needs the help of a concrete class,
	 * here ColumbiaUnivercity is a concrete class.	
	 */
	 MedicalSchool medicalSchool = new ColumbiaUniversity();
	 medicalSchool.hygiene();
	 medicalSchool.caring();
	 medicalSchool.lawInfo();
	/* we cannot call static method from other class.
	 * Static is a special method its belongs to class itself.
	 * Static method cannot be call by object.
	 * MedicalSchool.lawSchoolField();
	 * Static method call by own class.
	 */
	 //medical.lawSchoolField();
	 medicalSchool.lawSchoolRoom();
	//we can call also  default method here too lawSchoolRoom.	 
 	}
}
