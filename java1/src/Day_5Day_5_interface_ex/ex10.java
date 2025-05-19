package Day_5Day_5_interface_ex;
interface m{
	void mm();
}
interface m1{
	void mm1();
}
interface m2{
	void mm2();
}
class o implements m{
	public void mm() {
		System.out.println("Hi");
	}
	public void q() {
		System.out.println("Hi1");
	}
}
class o1 implements m1{
	public void mm1() {
		System.out.println("Hello");
	}
	public void q1() {
		System.out.println("Hello1");
	}
}
class o2 implements m2{
	public void mm2() {
		System.out.println("How are you?");
	}
	public void q2() {
		System.out.println("How are you?1");
	}
}
public class ex10 {

	public static void main(String[] args) {

		o i=new o();
		o1 i1=new o1();
		o2 i2=new o2();
		i.mm();
		i.q();
		i1.mm1();
		i1.q1();
		i2.mm2();
		i2.q2();

	}

}
