package Day_4;

public class constructor_overloading {
	int x;
	int y;
	int z;
	public constructor_overloading() {
		System.out.println("Welcome to my profile");
	}
	public constructor_overloading(int x) {
		this.x=x;
		System.out.println("SSC marks: "+x);
	}
	public constructor_overloading(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("SSC marks: "+x+" Inter marks: "+y);
}
	public constructor_overloading(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println("SSC marks: "+x+" Inter marks: "+y+" Btech-I-I cgpa:"+z);
}


	public static void main(String[] args) {
		constructor_overloading t1= new constructor_overloading();//default constructor
		constructor_overloading t2= new constructor_overloading(900);//single parameterized constructor
		constructor_overloading t3= new constructor_overloading(900,900);//double parameterized constructor
		constructor_overloading t4= new constructor_overloading(900,900,9);//triple parameterized constructor
		
	}

}
