package Day_2;

public class cmdlineargs {

	public static void main(String[] args) {
		//int a=Integer.parseInt(args[0]);-->wrapper class//System.out.println(args[0]);-->cmdlinearg
		String a=args[0];//here it treats number as string but it cannot consider string as number
		System.out.println(a);//System.out.println(args[1]);-->cmdlinearg
	}

}
