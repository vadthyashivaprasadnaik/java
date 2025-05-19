package Day_5;
class sample88{
	public sample88() {
		System.out.println("Hi");
	}
	int x=77;
	void print() {
		System.out.println("Hello");
	}
}
public class superkeyword_ex4 extends sample88 {
	public superkeyword_ex4() {
		super();
	}
	void show(){
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		superkeyword_ex4 s1=new superkeyword_ex4();
		s1.show();
		
	}

}
