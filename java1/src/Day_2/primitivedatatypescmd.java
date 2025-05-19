package Day_2;

public class primitivedatatypescmd {
	public static void main(String[] args){
		int a1=Integer.parseInt(args[0]);
		double a2=Double.parseDouble(args[1]);
		String a3=args[2];
		float a4=Float.parseFloat(args[3]);
		short a5=Short.parseShort(args[4]);
		char ch=args[3].charAt(0);
		long a6=Long.parseLong(args[5]);
		boolean a7=Boolean.parseBoolean(a3);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(ch);
		System.out.println(a6);
		System.out.println(a7);
	}
}
