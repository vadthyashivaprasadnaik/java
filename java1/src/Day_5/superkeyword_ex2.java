package Day_5;
class Sample78{
	void print() {
		System.out.println("Helloo");
	}
}
public class superkeyword_ex2 extends Sample78{
	void show() {
		super.print();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superkeyword_ex2 s2=new superkeyword_ex2();
		s2.show();

	}

}
