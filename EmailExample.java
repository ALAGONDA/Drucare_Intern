package exception;

import java.util.Arrays;

import java.util.List;
import java.util.Scanner;

public class EmailExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email");
		String mail = sc.next();

		List<String> asList = Arrays.asList("sagararun323@gmail.com", "arun@gmail.com", "sagar@gmail.com",
				"raghu@gmail.com", "hemanath@gmail.com");

		if (asList.contains(mail)) {

			System.out.println("mail found");

		} else {

			throw new EmailNotFoundException("Email not found");

		}

	}

}
