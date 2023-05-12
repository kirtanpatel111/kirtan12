package First.mavan.first;

import java.awt.print.Printable;
import java.util.Scanner;

public class assignment2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 	int i = sc.nextInt();
				System.out.println("Number is : " + i);
			if (i % 5 ==0) {
				System.out.println(i+ " is multiple of 5");
				
			}else if(i % 7==0) {
				System.out.println(i+ "is multiple of 7");
			}
			else {
				System.out.println("Given number is not multiple of 5 and 7");
			}
			
	}
	
}
	
	

