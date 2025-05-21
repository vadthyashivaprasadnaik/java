package Day_9;
import java.util.*;
public class Treeset_ex {

	public static void main(String[] args) {
		//Tree set doesn't allow the null value
		Set<Integer>q1=new TreeSet<Integer>();
		q1.add(89);
		q1.add(15);
		q1.add(12);
		q1.add(665);
		q1.add(88);//doesn't follow insertion order
		q1.add(55);
		q1.add(2);
		q1.add(59);

		System.out.println(q1);
		System.out.println(q1.getClass());
		//tree set time complexity=q(n)
	

	}

}
