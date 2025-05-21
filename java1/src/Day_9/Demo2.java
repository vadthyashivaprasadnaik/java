package Day_9;
import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
	List<Integer>l1=new ArrayList<Integer>();
	l1.add(15);
	l1.add(70);
	l1.add(85);
	l1.add(90);
	List<Integer>l2=new ArrayList<Integer>();
	l2.add(15);
	l2.add(70);
	l2.add(85);
	l2.add(90);
	l2.addAll(l1);
	System.out.println(l2);

	}

}
