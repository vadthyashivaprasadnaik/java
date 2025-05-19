package Day_3;

public class test {

	public static void main(String[] args) {
		String s1=new String("helloworld");
		int vowels=0,consonants=0;
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i)
;
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')vowels++;
			else if(ch>='a'&& ch<='z')consonants++;	
		}
		

		System.out.println("Vowels: "+vowels+" Consonants: "+consonants);
		
	}

}
