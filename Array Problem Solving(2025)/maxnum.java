import java.util.Scanner;

class maxnum{
	public static void main(String args[]){
		int a,b;
		System.out.print("Enter two NUmber:-");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		if(a>b){
			System.out.print(a);
		}
		else
		{
			System.out.print(b);
		}
	}
}