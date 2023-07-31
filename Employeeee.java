package task_28;

import java.time.LocalDate;

public class Employeeee {
	
	private int id;
	private String name;
	private int doj;
	private double salary;
	private String dept;
	private String gender;
	private String place;
	
	
	public Employeeee(int id, String name, int doj, double salary, String dept, String gender, String place) {
		super();
		this.id = id;
		this.name = name;
		this.doj = doj;
		this.salary = salary;
		this.dept = dept;
		this.gender = gender;
		this.place = place;
	}
	@Override
	public String toString() {
		return "Employeeee [id=" + id + ", name=" + name + ", doj=" + doj + ", salary=" + salary + ", dept=" + dept
				+ ", gender=" + gender + ", place=" + place + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDoj() {
		return doj;
	}
	public void setDoj(int doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	
	
	

}
