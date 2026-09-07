package practce;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {
	public static void main(String args[]) {
		
		Queue<Integer> qu= new LinkedList<Integer>();
		qu.add(50);
		qu.offer(20);
		qu.offer(30);
		qu.offer(40);
		qu.offer(50);
		System.out.println(qu);
		System.out.println(qu.poll());
		System.out.println(qu.peek());
		
		PriorityQueue<Integer> pr1= new PriorityQueue<>(Collections.reverseOrder());
		pr1.add(55);
		pr1.offer(23);
		pr1.offer(45);
		pr1.add(89);
		System.out.println(pr1);
		System.out.println(pr1.poll());
		System.out.println(pr1.peek());
		
		
		
		
		
		
		
	}
	}
