package task_28;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import OOPs.Employee;

public class MainEmployee {

	public static void main(String[] args) {
         
		List<Employeeee> list=Arrays.asList(new Employeeee(1, "Arun",2021, 25000, "Angular developer","male", "Hyderabad"),
				new Employeeee(2, "Raghu", 2023, 35000, "java Developer","female", "Hyderabad"),
				new Employeeee(3, "Prashanth", 2019, 45000, "Front Developer","male", "Banglore"),
				new Employeeee(3, "Hemanath", 2023, 35000, "java Developer","female", "Banglore")
				);
		
		
		//group the employees based on the gender and print the records
		Map<String, List<Employeeee>> collect = list.stream().collect(Collectors.groupingBy(Employeeee::getGender));
		collect.forEach((string,lists)->{
			System.out.println(string);
		lists.forEach(System.out::println);
		});
		
		//List down the employees of each department.
		Map<String,Long> collect2 = list.stream().collect(Collectors.groupingBy(Employeeee::getDept,Collectors.counting()));
		collect2.forEach((string1,count)->{
			System.out.println(string1+" "+count);
			
			});
		//Get the Names of employees who joined after 2022.
	Map<String,List<Employeeee>> collect3 = list.stream().filter(t->t.getDoj()>2022).collect(Collectors.groupingBy(Employeeee::getName));
	collect3.forEach((string2,list2)->{
		System.out.println(string2);
		list2.forEach(System.out::println);
	});
	
	//Write a program to print the names of all departments in the organization.
	Map<String,List<Employeeee>> collect4 = list.stream().collect(Collectors.groupingBy(Employeeee::getDept));
	collect4.forEach((t, u) -> {
		System.out.println(t);
		System.out.println(u);
	});
	
	
	
	
	
		
		
	}

}
