package Day_7;
import java.util.*;
public class day_7_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a,b values:");
		try {
			int a= sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException|InputMismatchException e) {
			System.out.println(e.getMessage());
		}//catch(InputMismatchException e) {
			//System.out.println(e.getMessage());
		//}
		//finally is a block it execute whatever happens in the program 
		finally {
			System.out.println("Hi");
		}

	}

}
