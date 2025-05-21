package Day_9;
import java.util.*;
public class Stack_ex {

	public static void main(String[] args) {
		Stack<Integer>s1=new Stack<Integer>();
		s1.push(34);
		s1.push(56);
		s1.push(78);
		s1.push(90);
		System.out.println(s1);
		System.out.println();
		System.out.println(s1.peek());
		System.out.println();
		System.out.println(s1.pop());
		System.out.println();
		Iterator i1=s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}//stack is a class
	}

}
