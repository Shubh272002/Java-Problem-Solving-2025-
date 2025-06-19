import java.util.Scanner;

class ascivalue{
	public static void main(String args[]){
		char ch;
		System.out.print("Enter Any Character:-");
		Scanner sc = new Scanner(System.in);
		ch=sc.next().charAt(0);
		
		int a = ch;
		System.out.print("ASCI Value Of" +ch + "is:-" +a);
	}
}