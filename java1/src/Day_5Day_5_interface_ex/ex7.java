package Day_5Day_5_interface_ex;
interface f{
	void ff();
}
interface f1{
	void ff1();
}
interface f2 extends f,f1{
	void ff2();
}
class g1{
	public void gg1() {
		System.out.println("Hi");
	}
}
class g2 extends g1 implements f2{
	public void ff() {
		System.out.println("Hi");
	}
	public void ff1() {
		System.out.println("Hi");
	}
	public void ff2() {
		System.out.println("Hi");
	}
	public void gg2() {
		System.out.println("Hi");
	}
}

public class ex7 {

	public static void main(String[] args) {
		g2 g=new g2();
		g.ff();
		g.ff1();
		g.ff2();
		g.gg1();
		g.gg2();

	}

}
