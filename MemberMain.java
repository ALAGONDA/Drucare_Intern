package OOPs;

public class MemberMain 
{
	public static void main(String[] args) 
	{
		Employee e1 =new Employee("Arun", 24, 9959488323L, "hyd", 23000, "Developer", "IT");
		e1.printSalary();
		System.out.println(e1);
		
		Manager m1 = new Manager("Raghu", 25, 9652448635L, "hyd", 40000, "devops", "IT");
		m1.printSalary();
		System.out.println(m1);
	}

}
