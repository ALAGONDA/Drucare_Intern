package OOPs;

public class Member 
{
//	.Create a class named 'Member' having the following members:
//
//		Data members
//
//		1 - Name
//
//		2 - Age
//
//		3 - Phone number
//
//		4 - Address
//
//		5 - Salary
//
//		It also has a method named 'printSalary' which prints the salary of the members.
//		Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' 
//		classes have data members 'specialization' and 'department' respectively. Now, 
//		assign name, age, phone number, address and salary to an employee and a manager 
//		by making an object of both of these classes and print the same.
	
	public String name;
	public int age;
	public long phoneNumber;
	public String address;
	public double salary;
	
	public Member() {
		
	}
	
	public Member(String name, int age, long phoneNumber, String address, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}



	public void printSalary()
	{
		System.out.println(salary);
	}
	
	

}
