import java.util.Scanner;

class reverse{
	public static void main(String arg[]){
		int n,r;
		
		System.out.print("Enter Your Number:-");
		Scanner sc  = new Scanner(System.in);
		n=sc.nextInt();
		
		while(n>0){
			r=n%10;
			System.out.print(r);
			n=n/10;
		}
	}
}