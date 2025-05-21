package Day_9;
import java.util.*;
public class Queue_ex1 {

	public static void main(String[] args) {
		Queue<Integer>q1 =new PriorityQueue<Integer>();
		q1.offer(45);
		q1.offer(15);
		q1.offer(77);
		q1.offer(82);
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
	}

}
