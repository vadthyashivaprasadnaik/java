package Day_6;

public class final_ex1 {
	void show() {
		int a=23;//final int a=23;
		System.out.println(a);
		a=34;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final_ex1 s=new final_ex1();
		s.show();

	}

}
