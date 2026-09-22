package comparitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparitorMainClass {
	
	public static void main(String[] args) {
		Model m= new Model(1, "Harish", 25, 390);
		Model m1= new Model(2, "alice", 26, 450);
		Model m2= new Model(3, "Klee", 18, 389);
		Model m3= new Model(4, "Nefer", 24, 400);
		
		List<Model> prac = new ArrayList<Model>();
		prac.add(m);
		prac.add(m1);
		prac.add(m2);
		prac.add(m3);
		
		Comparator<Model> marksComparator = new Comparator<Model>() {
			
			@Override
			public int compare(Model o1, Model o2) {
				// TODO Auto-generated method stub
				return o1.marks - o2.marks;
			}
		};
		
		Collections.sort(prac,marksComparator);
		
		System.out.println(prac);
		
//		Comparator<Model> ageComparator = (a,b) -> a.age-b.age;
//		Collections.sort(prac,ageComparator);
//		System.out.println(prac);
//		
		Collections.sort(prac,(a,b)-> a.age - b.age);
		System.out.println(prac);
	}

}
