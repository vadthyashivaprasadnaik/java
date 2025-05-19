package Day_5;
class Sample97{
	int x=90;
}
public class superkeyword_ex3 extends Sample97 {
	void show() {
		int y=45;
		System.out.println(super.x);
		System.out.println(y);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superkeyword_ex3 s3= new superkeyword_ex3();
		s3.show();

	}

}
