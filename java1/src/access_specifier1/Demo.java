package access_specifier1;

class Sample1{
	public void add() {
		System.out.println("Hi");
	}
}

public class Demo extends Sample1 {
	public static void main(String[] args) {
		Demo d= new Demo();
		d.add();
	}

	

}
