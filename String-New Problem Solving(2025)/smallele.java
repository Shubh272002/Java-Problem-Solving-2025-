import java.util.Scanner;

class smallele{
	public static void main(String args[]){
		int a[]= new int[5]; int min;
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enetr the Element:-");
		
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		min=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.print("Smallest Element:-"+min);
		
	}
}