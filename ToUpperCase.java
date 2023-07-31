package task_28;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
	
	public List<String> upperCase(List<String> list) {
		
		return list.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		}

	public static void main(String[] args) {
		List<String> list= Arrays.asList("Arun","Raghu","Hemanath","Prashanth");
		ToUpperCase case1 = new ToUpperCase();
		List<String> upperCase = case1.upperCase(list);
		System.out.println(upperCase);

	}

}
