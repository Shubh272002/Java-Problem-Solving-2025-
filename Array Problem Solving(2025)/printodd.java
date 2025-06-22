import java.util.Scanner;

class printodd{
	public static void main(String args[]){
    
     int n;

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter No Of Item:-");
      n=sc.nextInt();

      for(int i=1;i<=n;i=i+2){
		  System.out.print(i);
	  }	  
	
	}
	
	
	
}