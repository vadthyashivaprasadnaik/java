package Day_5Day_5_interface_ex;
interface st{
	void stt();
}
interface st1{
	void stt1();
}
class cl{
	public void cll1(){
		System.out.println("hello");
	}
}
class cl1 extends cl implements st,st1{
	public void stt() {
		System.out.println("Hi");
	}
	public void stt1() {
		System.out.println("Brother");
	}
	public void bro() {
		System.out.println("Namaste");
	}
	
}
class cl2 extends cl1{
	public void sis() {
		System.out.println("Hi Sister");
	}
}

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cl2 c=new cl2();
		c.stt();
		c.stt1();
		c.cll1();
		c.bro();
		c.sis();

	}

}
