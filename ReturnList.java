package task_28;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnList {
	
	
	
	public List<String> searList(List<String> list) {
		
		return list.stream().filter(t->t.startsWith("a")&&t.length()==3).collect(Collectors.toList());

		}
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Arun","Raghu","aru","taa","dfgh","kjh");
		ReturnList list1 = new ReturnList();
		List<String> searList = list1.searList(list);
		System.out.println(searList);
		
		
	}

}
