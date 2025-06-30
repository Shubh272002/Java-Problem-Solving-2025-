import  java.util.Scanner;

class insertele{
	public static void main(String args[]){
		int size,loc,item,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size:-");
		size = sc.nextInt();
		
		int a[] = new int[size+1];
		System.out.print("Enter Array Elements:-");
		for(i=0; i<size;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter Array Location:-");
		loc=sc.nextInt();
		System.out.print("Enter New Item:-");
		item = sc.nextInt();
		
		for( i=size;i>loc;i--){
			a[i]=a[i-1];
		}
		a[loc]=item;
		size++;
		for(i=0;i<size;i++){
			System.out.print(a[i]+ " ");
		}
	}
}