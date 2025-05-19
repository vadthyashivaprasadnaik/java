package Day_4;

public class this_ex2 {
	int a=30;
	int b=40;
	
	public  this_ex2(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}
	public static void main(String[] args) {
		this_ex2 t1=new this_ex2(78,34);
		t1.add();
		//passing to constructor but applicable for method cause we used this

	}

}
