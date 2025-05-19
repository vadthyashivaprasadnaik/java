package Day_5Day_5_interface_ex;
interface modi{
	void add();
}
interface modi1 extends modi{
	void sub();
}
class modii implements modi1{
	public void add() {
		System.out.println("Hi");
	}
	public void sub() {
		System.out.println("Hello");
	}
	public void mul() {
		System.out.println("bro");
	}
}

class modii1 implements modi1{
	public void add() {
		System.out.println("Bharat");
	}
	public void sub() {
		System.out.println("Hindustan");
	}
	public void mul() {
		System.out.println("Brother");
	}
}
public class ex2 {

	public static void main(String[] args) {
		modii m=new modii();
		modii1 m1=new modii1();
		m.add();
		m.sub();
		m.mul();
		m1.add();
		m1.sub();
		m1.mul();
		

	}

}
