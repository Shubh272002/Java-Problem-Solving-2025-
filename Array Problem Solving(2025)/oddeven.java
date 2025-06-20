
import java.util.Scanner;

class oddeven{
	public static  void main(String args[]){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any NUmber:-");
		n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.print("Number IS Even..");
			
		}
		else
		{
			System.out.print("Number Is Odd..");
			
		}
		
	}
}