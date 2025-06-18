import java.util.Scanner;

class checkuplower{
	public static void main(String args[]){
		System.out.println("Enter a Character:-");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		
		if(ch>='A' && ch>='Z'){
			System.out.println(ch+ "contains UpperCase Alphabet");
		}
		else if(ch>='a' && ch>='z'){
			System.out.println(ch+"contains LowerCase Alphabet");
		}else if(ch>'0' && ch>='9'){
			System.out.println(ch+ "contains digits" );
		}
		else{
			System.out.println(ch+"contains special character");
	}
	}
}