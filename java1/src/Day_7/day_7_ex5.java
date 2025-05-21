package Day_7;
import java.util.*;

public class day_7_ex5 {
	void add() throws ArithmeticException,InputMismatchException{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a,b values:");
		
			int a= sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day_7_ex5 s1=new day_7_ex5();
		s1.add();

	}

}
