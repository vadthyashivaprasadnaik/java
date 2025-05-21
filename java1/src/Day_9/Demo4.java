package Day_9;
import java.util.*;

public class Demo4 {

	public static void main(String[] args) {
		List<Integer>l1=new ArrayList<Integer>();
		l1.add(55);
		l1.add(78);
		l1.add(33);
		List<Object>l2=new ArrayList<Object>();
		l2.add("Bro");
		l2.add(55.44);
		l2.add("$");
		l2.add("88");
		l2.add(l1);
		l2.add(null);
		System.out.println(l1);
		System.out.println(l2);
		Iterator i1=l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		Iterator i2=l2.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}

}
