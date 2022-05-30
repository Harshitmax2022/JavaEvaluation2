package question4;

public class Student extends Person {
  
	/*studentId : int
courseEnrolled : String
courseFee : int*/
	
	int studentId;
	String coursrEnrolled;
	int courseFee;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", coursrEnrolled=" + coursrEnrolled + ", courseFee=" + courseFee
				+ ", name=" + name + ", gender=" + gender + ", address=" + address + ",]";
	}
	
	
}
