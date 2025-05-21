package Day_8;
import java.util.*;
public class cursor_ex1 {
//Iterator
	public static void main(String[] args) {
		List<Integer>l1=new ArrayList<Integer>();//List is a interface
		l1.add(55);
		l1.add(78);
		l1.add(33);
		System.out.println(l1);
		Iterator i1=l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
	}

}
