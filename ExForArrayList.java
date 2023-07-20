package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ExForArrayList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(21);
		arrayList.add(31);
		arrayList.add(10);
		arrayList.add(8);
		arrayList.add(212);
		arrayList.add(21);
		arrayList.add(66);

		// iterate
		System.out.println(arrayList);

		Iterator<Integer> iterator = arrayList.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());

		}
		
		ListIterator<Integer> listIterator1 = arrayList.listIterator();
		while (listIterator1.hasNext()) {
			System.out.println(listIterator1.next());
			
		}
         
		System.out.println("<><><><><><>");
		while (listIterator1.hasPrevious()) {
			System.out.println(listIterator1.previous());
			
		}
		
		
	}

}
