package OOPs;

public class Manager extends Member
{
	public String specialization;
	public String department;
	
	
	public Manager(String name, int age, long phoneNumber, String address, double salary, String specialization,
			String department) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
		this.department = department;
	}


	@Override
	public String toString() {
		return "Manager [specialization=" + specialization + ", department=" + department + ", name=" + name + ", age="
				+ age + ", phoneNumber=" + phoneNumber + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
}
