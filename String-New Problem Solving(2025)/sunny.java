import java.util.Scanner;

class sunny{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n,i,a,c=0;
		System.out.print("Enter Your  Number:-");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			a=(i*i)-1;
			if(a==n)
				c=1;
		}
		if(c==1)
			System.out.print("It Is sunny Number:"+n);
		else
			System.out.print("It is not sunny Number:"+n);
	}
}