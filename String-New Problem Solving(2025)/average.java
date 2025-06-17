import java.util.Scanner;

class average{
	public static  void main(String args[]){
		int a[] = new int[5];int sum =0; double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array Elements:-");
		
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			
		}
		
		System.out.print("Array Elements..");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++){
			sum=a[i]+sum;
		}
		avg=sum/5;
		System.out.print("\n Addition:-"+sum+  "\n Average:-"+avg); 
	}
}