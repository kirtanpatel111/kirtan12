package First.mavan.first;

import java.util.Scanner;

public class StudentDatabase extends Student {

	public static void main(String[] args) {
		
		Student sdetail1= new Student();
		sdetail1.setFirstname("Kirtan");
		sdetail1.setLastname("Patel");
		sdetail1.setRollnumber(12);
		sdetail1.setDateofbirth("4th june");
	
		sdetail1.printStudentDetails();
		
	}

}