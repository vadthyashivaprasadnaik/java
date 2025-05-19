package Day_3;

public class array_ex2 {

	public static void main(String[] args) {
		int a[]= {23,45,56,78};
		int min=0,max=0;
		//System.out.println(a);// it prints hash code
		//int count=0;
		//for(int i=0;i<a.length;i++) {
			//count++;
			//System.out.println(a[i]);
		//}
		//System.out.println(count);
		
		for(int j=0 ;j<a.length;j++) {
			if(a[j]<min) {
				min=a[j];
			}
		}
		System.out.println("Min: "+ min);

		for(int k=0 ;k<a.length;k++) {
			if(a[k]>min) {
				max=a[k];
			}
		}
		System.out.println("Max: "+max);
	}

}
