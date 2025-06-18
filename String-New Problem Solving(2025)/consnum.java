import java.util.Scanner;
class consnum{
	void count(String str){
		int vowels = 0;
		int consonent = 0;
		 str = str.toUpperCase();
		 for(int i=0;i<str.length(); i++){
			 char ch = str.charAt(i);
			 if(ch =='A' || ch =='E'|| ch =='I' ||  ch =='O' ||  ch =='U')
				 vowels++;
			 else
				 consonent++;
		 }
		 System.out.println("Number Of Vowels:-" +vowels);
		 System.out.println("Number Of Consonent:- " +consonent);
		
	}
	public static void main(String args[]){
		consnum obj = new consnum();
		Scanner sc = new Scanner(System.in);
		System.out.print("input :");
		String str =sc.next();
		
		obj.count(str);
		
		
	}
}