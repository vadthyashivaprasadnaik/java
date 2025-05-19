package Day_6;

class Test1{
	void show() {//final void show()
		System.out.println("Hi");
	}
}

public class final_ex2 extends Test1{
	void show() {
		int a=23;
		System.out.println(a);
		a=34;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final_ex2 s=new final_ex2();
		s.show();

	}

}
