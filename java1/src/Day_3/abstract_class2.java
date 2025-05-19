package Day_3;

abstract class shiva2{
	abstract void add();
	abstract void sub();
	void mul() {
		System.out.println("How are you?");
	}
	static void div() {
		System.out.println("Did you ate lunch?");
		
	}
	static void mod() {
		System.out.println("Lets go out!!");
		
	}
}
class sample extends shiva2{
	public void add() {
		System.out.println("Hi");
	}
	public void sub() {
		System.out.println("Hello");
	}
}
class abstract_class2 {
	public static void main(String[] args) {
		sample a=new sample();
		a.add();
		a.sub();
		a.mul();
		shiva2.div();
		shiva2.mod();
	}

}
