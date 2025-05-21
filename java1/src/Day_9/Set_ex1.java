package Day_9;
import java.util.*;
public class Set_ex1 {

	public static void main(String[] args) {
		//hash set:used to insert the element but doesn't allow duplicate.
		//linked hash set:it maintain the insertion order as well as unique values
		//tree set:it is used to sort the elements according to some comparator then use the tree set.
		Set<Integer>q1=new HashSet<Integer>();
		q1.add(89);
		q1.add(null);
		q1.add(12);// in hash set  no duplicates are allowed
		System.out.println(q1);
		System.out.println(q1.getClass());

	}

}
