package access_specifier2;
import access_specifier1.new1;

public class new2 {

	public static void main(String[] args) { 
		new1 n1= new new1();/* here don't keep new2 . it reads this file. but we want another packages output .*/ 
		n1.add();/*we are getting error because we kept method as default not public.if we keep public we get desired output.*/

	}

}
