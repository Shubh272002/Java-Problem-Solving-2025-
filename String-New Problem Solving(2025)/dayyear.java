import java.util.Scanner;


class dayyear{
	public static void main(String args[]){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Day:-");
		int day = sc.nextInt();
		int year = day/365;
		int weeks = ((day%365)/7);
		int days = day -((year*365)+(weeks*7));
		
		
		System.out.println("The Number Of Year:"+year);
		System.out.println("The Number Of Weeks:"+weeks);
		System.out.println("The Number Of Days is:"+days);
	}
}