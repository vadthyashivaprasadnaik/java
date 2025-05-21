package Day_7;

import java.util.InputMismatchException;

public class day_7_ex6 {
	static void add(int a, int b){
		
	int c=a/b;
	System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			add(10,0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
