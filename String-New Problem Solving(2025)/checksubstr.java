import java.util.Scanner;

class checksubstr{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The String:-");
		
		String str = sc.nextLine();
		System.out.println("Enter The Substring Your Want:-");
		
		String str1 = sc.next();
		
		if(str.indexOf(str1)==-1){
			System.out.println("false");
			
		}else{
			System.out.println("true");
		}
		sc.close();
	}
}