package Day_3;

public class test1 {

	public static void main(String[] args) {
		String s1=new String("helloworld");
		String vowels="";
		String consonants="";
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i)
;
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')vowels+=ch;
			else if(ch>='a'&& ch<='z')consonants+=ch;	
		}
		

		System.out.println("Vowels: "+vowels+" Consonants: "+consonants);
		

	}

}
