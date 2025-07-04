import java.util.*;

class spy{
	public static void main(String agr[]){
		Scanner sc = new Scanner(System.in);
		int n,p,rev,s=0,sum=1;
		System.out.println("Enter Your Number:-");
		n=sc.nextInt();
		p=n;
		while(n>0){
			rev = n%10;
			s=s+rev;
			sum = sum*rev;
			n=n/10;
		}
		if(sum==s)
			System.out.println("It Is SPY Number:-"+p);
		else
			System.out.println("It Is Not SPY:-"+p);	
		
	}
}