import java.util.Scanner;

class phonenum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	
		
		String pn= null;
		
		int i;
		for(i=0; i<=3;i++){
			System.out.println("Enter The Phone Number:-");
			pn=sc.next();
			
			String reg = "\\d{10}";
			
			System.out.println("\nThe Phone Number Is:-" +pn );
			System.out.println("\nIs The Above Phone Number Valid?"+pn.matches(reg));
			
			System.out.println();
		}
	}
	
}