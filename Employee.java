package OOPs;

public class Employee extends Member
{
	public String specialization;
	public String department;
	
	public Employee(String name, int age, long phoneNumber, String address, double salary, String specialization,
			String department) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [specialization=" + specialization + ", department=" + department + ", name=" + name + ", age="
				+ age + ", phoneNumber=" + phoneNumber + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
	
	
	
	

}
