package exception;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CharCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email");
		String mail = sc.next();
		
		if (mail.contains("@")) {
			System.out.println("char present");
			
		} else {
			try{
				throw new InvalidDomainException("char not present");
			}
			catch (InvalidDomainException e) {
				System.out.println(e);
				
			}
			
			
			
			
			

		}

		

	}

}
