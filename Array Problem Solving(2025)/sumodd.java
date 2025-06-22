
import java.util.Scanner;
class sumodd{
	public static void main(String args[]){
		int n,i,sum=0;
		
		System.out.print("Enter Range:-");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		if(n%2==0)
		{
			for(i=0;i<=n;i=i+2){
				sum=sum+i;
			}
			System.out.print("Sum Of Even..."+sum);
			
		}
		else
		{
			for(i=1;i<=n;i=i+2){
				sum=sum+i;
			}
			System.out.print("Sum Of Odd..."+sum);
			
		}
	}
}