package task_28;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Average {
	
	public Double average(List<Integer> list) {
		
		Double collect = list.stream().collect(Collectors.averagingDouble(t->t.doubleValue()));
		return collect;
		
		}

	public static void main(String[] args) {
		
		List<Integer> integers= Arrays.asList(10,21,25,26,58,45,69,47,580);
		Average average = new Average();
		Double average2 = average.average(integers);
		System.out.println(average2);
		
		
		
		

	}

}
