package Day_9;
import java.util.*;

public class LinkedHashMap_ex {

	public static void main(String[] args) {
		//Time Complexity:O(n)
		//it contains the unique elements
		//-->it follows O(n)Time Complexity
		//-->hash map contains value based on the key
		//-->it contains only unique elements 
		//-->it may have one null key and multiple null values.
		//-->it maintain the insertion order
		Map<Integer,String> m1=new LinkedHashMap<Integer,String>();
		m1.put(1, "Narsimha Reddy Engineering College");
		m1.put(5, "ECE");
		m1.put(3, "CSE");
		m1.put(6, "EEE");
		m1.put(2, "NRCM");
		m1.put(4, "CS-AIML");
		m1.put(null, null);
		m1.put(null, null);
		System.out.println(m1);
		for(Map.Entry<Integer, String> i:m1.entrySet()) {
			System.out.println(i.getValue());
			System.out.println(i.getKey());
		}
	}

}
