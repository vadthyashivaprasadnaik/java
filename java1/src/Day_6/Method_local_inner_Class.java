package Day_6;

public class Method_local_inner_Class {
	void show() {
		System.out.println("Hello");
		class Test{
			void print() {
				System.out.println("Good Afternoon");
			}
	}
		Test t=new Test();
		t.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_local_inner_Class m= new Method_local_inner_Class();
		m.show();
		

	}

}
