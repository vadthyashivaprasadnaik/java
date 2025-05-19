package Day_5Day_5_interface_ex;
interface j{
	void hi();
}
class bye {
	public void hi1() {
		System.out.println("hello");
	}
}
class bye1 extends bye implements j {
	public void hi2() {
		System.out.println("Hi");
	}
	public void hi() {
		System.out.println("Brother");
	}
	public void hello() {
		System.out.println("How are u?");
	}
	
}
class bye2 extends bye1{
	public void mul() {
		System.out.println("Fine?");
	}
	
}
public class ex3 {

	public static void main(String[] args) {
		bye2 b2=new bye2();
		b2.hi();
		b2.hi2();
		b2.hello();
		b2.mul();
	}

}
