package Day_5Day_5_interface_ex;
interface l{
	void ll();
}
interface l1{
	void ll1();
}

interface l2{
	void ll2();
}

interface l3 extends l,l1,l2{
	void ll3();
}

class p implements l3{
	public void ll() {
		System.out.println("Hi");
	}
	public void ll1() {
		System.out.println("Hindusthan");
	}
	public void ll2() {
		System.out.println("Zindabad");
	}
	public void ll3() {
		System.out.println("Brother");
	}
	public void p1() {
		System.out.println("!!");
	}
}

public class ex8 {

	public static void main(String[] args) {
		p p=new p();
		p.ll();
		p.ll1();
		p.ll2();
		p.ll3();
		p.p1();
		}

}
