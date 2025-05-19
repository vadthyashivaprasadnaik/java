package Day_6;

public class exception_handling_ex1 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);//int a=20;//exception
		int b=Integer.parseInt(args[1]);
		System.out.println("Hi");
		try {
			//int b=Integer.parseInt(args[1]);//exception
			int c=a/b;
			System.out.println(c);
		} catch(Exception e) {
			System.out.println(e);//e.printstackTrace//Sysout(.getmessage())//Sysout(.toString())
		}
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		

	}

}
