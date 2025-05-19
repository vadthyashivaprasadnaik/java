package Day_4;

public class this_ex1 {
	int a=89;
	public void add() {
		System.out.println("add");
	}
	public void sub() {
		this.add();
		System.out.println(this.a);
		
		
	}

	public static void main(String[] args) {
		//this is a keyword.it is used to access the current class properties at any wherein entire class.//
		this_ex1 t1= new this_ex1();
		t1.add();
		t1.sub();
		
	}

}
