package Day_4;

public class constructor1 {
	int a=90;
		public constructor1(int a) {
			this.a=a;//b=a;
			System.out.println("Hello!"+a);//("Hello"+b);
		}
	public static void main(String[] args) {
		constructor1 c=new constructor1(45);
		constructor1 c1=new constructor1(45);
		constructor1 c2=new constructor1(45);
//this is a keyword.it is used to access the current class properties at any wherein entire class.//
	}

}
