import java.util.Scanner;

class deleteele{
	public static void main(String args[]){
		int size,loc,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size:-");
		size=sc.nextInt();
		
		int a[] = new int[size];
		System.out.print("Enter Array Elements:-");
		for(i=0;i<size;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter Array Location:-");
		loc=sc.nextInt();
		
		for(i=loc;i<size-1;i++){
			a[i]=a[i+1];
		}
		size--;
		
		for(i=0;i<size;i++){
			System.out.print(a[i]+" ");
		}
	}
}