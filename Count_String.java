package task_28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Count_String {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

		// Count of Strings
		long count = strList.stream().count();
		System.out.println(count);

		// Length more than three
		long count2 = strList.stream().filter(t -> t.length() > 3).count();
		System.out.println(count2);

		// count of String which starts with "a"
		List<String> collect = strList.stream().filter(t -> t.startsWith("a")).collect(Collectors.toList());
		System.out.println(collect);

		// Remove all Empty Strings from the list
		List<String> collect4 = strList.stream().filter(t->!t.contentEquals("")).collect(Collectors.toList());
		System.out.println(collect4);

		// Convert a list with String more than 2 chars
		List<String> asList = Arrays.asList("Arun", "is", "A", "good", "Boy");
		String collect2 = asList.stream().map(String::toUpperCase).collect(Collectors.joining(":"));
		System.out.println(collect2);
		
		//Create a List of the square of all distinct numbers
		List<Integer> asList2 = Arrays.asList(15,25,25,36,45,85,79,62,54,12,85);
		asList2.stream().distinct().map(t->t*t).forEach(System.out::println);
		
		//Get count, min, max, sum, and the average for numbers
		List<Integer> asList3 = Arrays.asList(15,25,25,36,45,85,79,62,54,12,85);
		IntSummaryStatistics collect3 = asList3.stream().collect(Collectors.summarizingInt(t->t.intValue()));
		System.out.println(collect3);
		
		
		

	}

}
