package practce;

import java.util.ArrayList;
import java.util.List;

public class ListArray {

	public static void main(String args[]) {
		
		
		List<Integer> ls = new ArrayList<>();
		ls.add(10);
		ls.add(20);
		ls.add(0);
		System.out.println(ls.contains(20));
		System.out.println(ls.size());
		System.out.println(ls.indexOf(20));
		List<Integer> ls1 = new ArrayList<>();
		
		if(!ls1.isEmpty()) {
			System.out.println(ls1.get(0));
		}
		else {
			System.out.println("list is empty");
		}
		
		ls.set(2, 40);
		ls.add(2,30);
		System.out.println(ls);
		
		
		
	}
	
	
}
