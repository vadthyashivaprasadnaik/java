package Day_7;

public class day_7_ex7 {
	static void add(int a, int b){
		if(b==0) {
			throw new ArithmeticException("Maths Radha ra Niku?");
		}
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
