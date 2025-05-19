package access_specifier1;

class Sample3{
	protected void add() {
		System.out.println("Hi");
	}
}
public class Demo2 extends Sample3{//for protected we have to use extends

	public static void main(String[] args) {
		Demo2 d2=new Demo2();
		d2.add();

	}

}
