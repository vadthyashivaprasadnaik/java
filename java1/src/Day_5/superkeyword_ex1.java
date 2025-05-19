package Day_5;
class Sample77{
	public Sample77() {
		System.out.println("Good evening");
	}
}
public class superkeyword_ex1 extends Sample77{
	public superkeyword_ex1() {
		super();
	}
	void show() {
		
	}
	public static void main(String[] args) {
		superkeyword_ex1 s1=new superkeyword_ex1();
		s1.show();
		}

}
