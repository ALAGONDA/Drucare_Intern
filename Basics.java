package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basics 
{
	public static void main(String[] args) 
	{
		
		//list creating methods
		
		//this is an immutable list
	/*	List<Integer> list = List.of(10,20,12,54,560);*/
		
		
		//Arrays type list creation
		List<Integer> list2 = Arrays.asList(10,45,65,78,21,11,1);
		
		ArrayList<Integer> list3 = new ArrayList<>();	
		list3.add(10);
		list3.add(20);
		list3.add(45);
		list3.add(105);
		list3.add(150);
		list3.add(56);
		
		System.out.println(list3);
		
		Stream<Integer> stream = list3.stream();
		List<Integer> collect = stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(collect);
	}

}
