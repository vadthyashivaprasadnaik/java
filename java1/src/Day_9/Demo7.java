package Day_9;
import java.util.*;
public class Demo7 {

	public static void main(String[] args) {
		LinkedList<Integer>l1=new LinkedList<Integer>();
		l1.add(55);
		l1.add(78);
		l1.add(33);
		l1.add(88);
		System.out.println(l1);
		l1.addFirst(25);
		System.out.println(l1);
		l1.addLast(44);
		System.out.println(l1);
		l1.add(3, 88);
		System.out.println(l1);
		l1.removeFirst();
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		l1.removeFirstOccurrence(88);
		System.out.println(l1);
		
		

	}

}
