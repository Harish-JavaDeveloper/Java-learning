package practce;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
	public static void main (String args[]) {
	Map<Integer, String> data = new HashMap<Integer, String>();
	data.put(1, null);
	data.put(2, "harish");
	System.out.println(data.get(1));
	System.out.println(data.containsKey(5));
	System.out.println(data.containsValue("Harish"));
	System.out.println(data);
	System.out.println(data.getOrDefault(3, "Not Exist"));
	data.putIfAbsent(3, "Zam");
	
	
	for(int key : data.keySet()) {
		System.out.println(key);
		if (key ==1) {
			data.put(1, "Harry");
		}
	}
	for(Map.Entry<Integer, String> entry: data.entrySet()) {
		
		System.out.println(entry.getKey()+"."+entry.getValue());
	}
	
	
	
	}
}
