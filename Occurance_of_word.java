package collections;

import java.util.HashMap;
import java.util.Map;

public class Occurance_of_word {

	public static void main(String[] args) {
		String word = "Arun Alagonda";

		Map<Character, Integer> mv = new HashMap<Character, Integer>();
		
		for(int i=0; i<word.length(); i++)
		{
			if(mv.containsKey(word.charAt(i)))
			{
				mv.put(word.charAt(i), mv.get(word.charAt(i))+1);
			}
			else
			{
				mv.put(word.charAt(i), 1);
			}
		}
		
		System.out.println(mv);

	}

}
