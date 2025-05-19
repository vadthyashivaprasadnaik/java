package access_specifier1;

class Sample23{
	public void add() {
		System.out.println("hello");
	}
}

public class new1 extends Sample23 {

	public static void main(String[] args) {
		new1 s1=new new1();
		s1.add();

	}

}
