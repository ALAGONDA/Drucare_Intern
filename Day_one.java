package basics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day_one {

	public static void main(String[] args) {
		// name
		String name = "Arun";
		System.out.println(name);

		// name and id in same line
		int id = 123;
		String ename = "Arun";
		System.out.println("id is :" + id + " and name is :" + ename);

		// Add 5+3
		int a = 5;
		int b = 3;
		int sum = a + b;
		System.out.println("Sum is : " + sum);

		// college name
		String collegeName = "Trinity college of Engineering and Technology, Karimnagar";
		System.out.println("My college name is :" + collegeName);

		// Print hello 123
		int digits = 123;
		String word = "Hello";

		System.out.println(word + " " + digits);

		// Divide 2 numbers
		int firstDigit = 10;
		int secDigit = 5;

		int out = firstDigit / secDigit;
		System.out.println(out);

		// Addition of 20 and 10 is 30
		int fDigit = 20;
		int secoDigit = 10;
		int sum1 = fDigit + secoDigit;

		System.out.println("The Addition of First and Second Digit is :" + sum1);

		// Print

		String wel = "Welcome";
		String to = " To ";
		String world = "Coding World";

		System.out.println(wel);
		System.out.println(to);
		System.out.println(world);

		// byte <short <int< long

		String message = "That was great - lol.";

		String replace = message.replace("lol", "laugh out loud");
		System.out.println(replace);

		// ALEX to Alex
		String firstNameCaps = "ALEX";
		System.out.println(firstNameCaps);

		String firString = firstNameCaps.substring(1).toLowerCase();
		System.out.println(firstNameCaps.substring(0, 1) + firString);

		// Movie book

		String movie = "Nannaku Prematho";
		String book = "Mom,s Love";
		System.out.println(movie + " is my fav movie :" + book + " is my fav book ");

		// Animal Food
		String animal = "Lion";
		String food = "Biryani";
		System.out.println(animal + food);

		// + and concat metod for string

		String fWord = "Arun";
		String secWord = " Alagonda";
		System.out.println(fWord + " " + secWord);
		System.out.println(fWord.concat(secWord));
		
		//food and color
		String sname = "Julian";
        String color = "green";
        String cfood = "pizza";
        System.out.println("Julian's fav color is :"+color);
        System.out.println("Julian's fav food is :"+cfood);
        
        //+ for Strings
        String sWord = "Arun";
		String secoWord = " Alagonda";
		System.out.println(sWord + " " + secoWord);
		
		//Area
		int length = 30;
		int breadth = 20;
		int area =length*breadth;
		
		System.out.println("Area of the rectangle is :"+"length as :"+length+ " and breadth as :"+
		breadth+" is :"+area);
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "Arun");
		mp.put(2, "Raghu");
		
//		System.out.println(mp);
//		
//		 Set<Entry<Integer,String>> entrySet = mp.entrySet();
//		 Iterator<Entry<Integer, String>> ite = entrySet.iterator();
//		
//		
//		while (ite.hasNext()) {
//			
//			Entry<Integer, String> next = ite.next();
	/*		System.out.println("Key " + next.getKey() );*/
		
		Collection<String> values = mp.values();
		Iterator<String> iterator = values.iterator();
		
		while (iterator.hasNext()) {
			
			String string = iterator.next();
			System.out.println(string );
			
		}
			
			
			
		
	}

	

}
