package Day_3;

public class array_ex3 {
	public static void main(String[] args) {
		int a[]= {4,7,1,9,2,7,1};
		int a1[]=new int[a.length];
		int index=0;
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				a1[index++]=a[i];
			}
		}
		System.out.println("No Repeated: ");
		for(int i=0;i<index;i++) {
			System.out.print(a[i]+" ");
		}
			
		
		 
	}

}
