package Day_5Day_5_interface_ex;
interface i{
	void in();
}
class class1{
	public void on() {
		System.out.println("Hi");
	}
}
class class2{
	public void on1(){
		System.out.println("Brother");
	}
}
class class3 extends class1 implements i{
	public void in() {
		System.out.println("Hello");
	}
	public void of() {
		System.out.println("Bro");
	}
}
class class4 extends class2{
	public void on2() {
		System.out.println("Namaste!");
	}
}
public class ex6 {

	public static void main(String[] args) {
		class3 c3=new class3();
		class4 c4=new class4();
		c3.on();
		c3.in();
		c3.of();
		c4.on1();
		c4.on2();

	}

}
