package Day_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class curor_ex_2 {
//ListIterator
	public static void main(String[] args) {
		List<Integer>l1=new ArrayList<Integer>();
		l1.add(55);
		l1.add(78);
		l1.add(33);
		System.out.println(l1);
		ListIterator i1=l1.listIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}
		
	}


	}


