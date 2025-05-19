package Day_4;

public class copiedconstructor {
	int x;
	int y;
	//parameterized constructor
	public copiedconstructor(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public copiedconstructor(copiedconstructor t1) {
		this.x=t1.x;
		this.y=t1.y;
		System.out.println(x-y);
	}

	public static void main(String[] args) {
		copiedconstructor t1=new copiedconstructor(115,52);
		copiedconstructor t2= new copiedconstructor(t1);
	}

}
