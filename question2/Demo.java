package question2;

import java.util.Scanner;

public class Demo {
 
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter the Number of Student Details you Want");
		int num= sc.nextInt();
		Student[] student = new Student[num];
	     int i=0;
		  while(num>i) {
			  System.out.println("Enter the Roll Number");
			  int roll=sc.nextInt();
			  
			  sc.nextLine();
			  System.out.println("Enter the Name");
			  String name= sc.nextLine();
			  
			  System.out.println("Enter the Address");
			  String addr= sc.nextLine();
			  
			  System.out.println("Enter the marks");
			  int marks= sc.nextInt();
			  
			  student[i]= new Student(roll,name,addr,marks);
			  
			  System.out.println("                              ");
			  
			  i++;
		  }
		  
		  int total =0;
		  int r=1;
		  for(Student st : student) {
			  System.out.println("Student :"+r);
			  System.out.println("Student Name :"+st.getName());
			  System.out.println("Student RollNumber :"+st.getRoll());
			  System.out.println("Student Address :"+st.getAddress());
			 System.out.println("Student Marks :"+st.getMarks());
			 
			 total +=st.getMarks();
			 r++;
		  }
		  
		  
		  System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  
		  double average= total/num;
		  System.out.println("Average od Total Marks :"+average);
		
	}
	
	
}
