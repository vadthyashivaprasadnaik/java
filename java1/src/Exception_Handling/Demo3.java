package Exception_Handling;
import java.util.*;
public class Demo3{
	public static void main(String[] args) throws ArithmeticException,InputMismatchException  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		
			int a=sc.nextInt();
			System.out.println("Enter the value of b:");
			
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
	
	}
}