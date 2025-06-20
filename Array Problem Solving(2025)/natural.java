import java.util.Scanner;

class natural{
	public static void main(String args[]){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter NO Of Term:-");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.print(i + " ");
		}
	}
}