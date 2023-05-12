package First.mavan.first;

import java.security.PublicKey;

import javax.xml.crypto.Data;

public class Student {
	private int rollnumber;
	private String firstname;
	private String lastname;
	private String	dateofbirth;
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
		public void printStudentDetails() {
			System.out.println("First Name:" +getFirstname()+ "\nLast Name:" +getLastname()+ "\nRoll Number:" +getRollnumber()+ "\nDate of  Birth:" +getDateofbirth());
		}

						
		
	
	
	
}