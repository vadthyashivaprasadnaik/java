package Day_8;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class cursor_ex3 {
//enumerator
	public static void main(String[] args) {
		Vector<Integer>l1=new Vector<Integer>();
		l1.add(55);
		l1.add(78);
		l1.add(33);
		System.out.println(l1);
		Enumeration i1=l1.elements();
		while(i1.hasMoreElements()) {
			System.out.println(i1.nextElement());
		}

	}

}
