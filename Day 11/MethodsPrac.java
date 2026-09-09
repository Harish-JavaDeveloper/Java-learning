package practce;

import java.util.ArrayList;
import java.util.List;

public class MethodsPrac {

	public static List<Integer> listOfValues() {
		
		List<Integer> number = new ArrayList<Integer>();
		number.add(10);
		System.out.println(number);
		return number;
		
	}
	
	public static void checkValues(List<Integer> sample) {
		if(sample.isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("list s not empty"+sample);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		List<Integer> li=listOfValues();
	System.out.println(li.contains(20));
		checkValues(li);
		
	}
}
