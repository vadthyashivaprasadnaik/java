package Day_4;

public class allconstructors {
	int x;
	int y;
	int z;
	public allconstructors() {
		System.out.println("Welcome to my profile");//default constructor
	}
	public allconstructors(int x,int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println("x:"+x+" y:"+y+" z:"+z);//parameterized constructor
	}
	public allconstructors(allconstructors t1) {
		this.x=t1.x;
		this.y=t1.y;
		this.z=t1.z;
		System.out.println(x+y+z);//copied constructor
	}

	public static void main(String[] args) {
		allconstructors t1= new allconstructors();//default constructor
		allconstructors t2= new allconstructors(45,78,32);//parameterized constructor
		allconstructors t3= new allconstructors(t2);//copied constructor
		
		

	}

}
