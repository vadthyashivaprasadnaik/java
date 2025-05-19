package Day_5Day_5_interface_ex;
interface r{
	void rr();
}
interface r1{
	void rr1();
}
interface r2{
	void rr2();
}
interface r3{
	void rr3();
}
class t implements r,r1,r2{
	public void rr() {
		System.out.println("Jai");
	}
	public void rr1() {
		System.out.println("Shree");
	}
	public void rr2() {
		System.out.println("Ram");
	}
	public void rrr() {
		System.out.println("!!");
	}
}
class t1 extends t implements r2{
	public void rr3() {
		System.out.println("Jai");
	}
	public void rrr1() {
		System.out.println("Hanuman");
	}
}
public class ex9 {

	public static void main(String[] args) {
		t1 t= new t1();
		t.rr();
		t.rr1();
		t.rr2();
		t.rrr();
		t.rr3();
		t.rrr1();

	}

}
