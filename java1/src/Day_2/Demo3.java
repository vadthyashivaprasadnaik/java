package Day_2;

public class Demo3 {
	public static void main(String[] args) {
		int a=18;
		if(a%2==0) {
			System.out.println("Div by 2");
			if((a+2)%2==0) {
				System.out.println("Div by 2 when added 2 also");
				if((a+4)%4==0) {
					System.out.println("Div by 4 when added 4 also");
				}else {
					System.out.println("Not Div by 4 when added 4");
				}
			}else {
				if((a+6)%2==0) {
					System.out.println("Div by 2 when added 6 also");
				}
				else {
					System.out.println("Not Div by 2 when added 6");
				}
			}
		}else {
			if(a%3==0) {
				System.out.println("Div by 3");
				if((a+3)%6==0) {
					System.out.println("Div by 6 when added 3");
				}else {
					System.out.println("Not Div by 6 when added 3");
				}
			} else {
				if((a+1)%3==0) {
					System.out.println("Div by 3 when added 1");
				} else {
					System.out.println("Not div by 3 when added 1");
				}
			}
		}
	}

}
