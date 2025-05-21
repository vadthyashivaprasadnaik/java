package Day_9;
import java.util.*;

public class Demo5 {

	public static void main(String[] args) {//Array to list
		List<Object>l1=new ArrayList<Object>();
		l1.add(15);
		l1.add("Hello");
		l1.add("%");
		l1.add("85.33");
		System.out.println(l1);
		List<Object>extra=Arrays.asList("HelloBro","RRR","OG");
		l1.addAll(1,extra);
		System.out.println(l1);
		System.out.println(l1.get(6));//to access particular index
		System.out.println(l1.indexOf("%"));//we know value but not index
	}

}
