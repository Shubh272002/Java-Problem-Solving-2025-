import java.util.Scanner;
class insert{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size");
		int length = sc.nextInt();
		
		
		int arr[] = new int [length];
		System.out.println("Enter the "+length+ "elements");
		for (int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			System.out.println("arr["+i+"]----->" +arr[i]);
		}
	}
}