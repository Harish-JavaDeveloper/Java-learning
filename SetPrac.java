package practce;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Integer> set  = new HashSet<Integer>();
		set.add(10);
		set.add(null);
		set.add(20);
		
		System.out.println(set);
		
		LinkedHashSet<Integer> set1  = new LinkedHashSet<Integer>();
		set1.add(10);
		set1.add(null);
		set1.add(20);
		System.out.println(set1);
		TreeSet<Integer> num1 = new TreeSet<Integer>();
		num1.add(10);
//		num1.add(null);
		num1.add(20);
		System.out.println(num1);
		for(int a:num1) {
			System.out.println(a);
		}
		System.out.println();
		
		
	}

}
