package Day_3;

public class strings {

	public static void main(String[] args) {
		String s1="king";//String s1="lion";
		String s2="king";
		String s3=new String("king");
		String s4= new String("king");
		System.out.println(s1.equals(s2));//original content
		System.out.println(s1==s2);//true cause same content
		System.out.println(s1=s2);//it prints same content cause both strings have same content
		System.out.println(s3==s4);//false cause two different strings
		System.out.println(s2.equals(s3));//compares original content
		System.out.println(s2.equals(s4));//compares original content
		System.out.println(s1.compareTo(s4));
		//using literal string works as datatype
		//using new keyword string acts as class
		//scp:string constant pool
		
	}
	
}
