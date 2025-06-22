import java.util.Scanner;

class sum{
	public static void main(String args[]){
		int a,b,sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any  Two Number:-");
		a=sc.nextInt();
		b=sc.nextInt();
		
		sum = a+b;
		
		System.out.print("Addition:- " +sum);
	}
	
}