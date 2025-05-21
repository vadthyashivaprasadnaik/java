package Day_9;
import java.util.*;

public class Set_ex2 {

	public static void main(String[] args) {
		Set<Integer>q1=new LinkedHashSet<Integer>();
		q1.add(89);
		q1.add(null);//linked hash set follows insertion order.
		q1.add(12);
		q1.add(89);//in linked hash set also no duplicates are allowed
		System.out.println(q1);
		System.out.println(q1.getClass());
		

	}

}
