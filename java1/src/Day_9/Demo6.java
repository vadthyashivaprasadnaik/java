package Day_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo6 {

	public static void main(String[] args) {//List to Array
		List<Object>l1=new ArrayList<Object>();
		l1.add(15);
		l1.add(34);
		l1.add(55);
		l1.add(95);
		System.out.println(l1);
		List<Object>extra=Arrays.asList(44,33,11);
		l1.addAll(1,extra);
		System.out.println(l1);
		System.out.println(l1.get(6));//to access particular index
		Object[] arr=l1.toArray();
		for(Object a1:arr) {
			System.out.println(a1);
		}

	}

}
