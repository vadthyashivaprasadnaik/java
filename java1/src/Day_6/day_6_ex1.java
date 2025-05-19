package Day_6;

public class day_6_ex1 extends Object{
	int a=89;
	void add() {
		int a=90;
		System.out.println(a);
	}
	void sub() {
		int a=89;
		System.out.println(this.a);
		this.add();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day_6_ex1 s=new day_6_ex1();
		s.sub();

	}

}
