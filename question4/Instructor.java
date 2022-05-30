package question4;

public class Instructor extends Person {
  
	/*instructorId : int
salary : int
*/
	
	int instructorId;
	int salary;
	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + ", name=" + name + ", gender="
				+ gender + ", address=" + address + "]";
	}
	
	
	
	
}
