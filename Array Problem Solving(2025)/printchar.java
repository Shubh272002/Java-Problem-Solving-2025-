import java.util.Scanner;

class printchar{
	public static void main(String args[]){
		char ch;
		System.out.print("Enter Character:-");
		Scanner sc = new Scanner(System.in);
		ch=sc.next().charAt(0);
		System.out.print(ch);
	}
}