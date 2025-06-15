class A{
	void show(){
		System.out.println("A Is Show ");
		
	}
}

class B extends A{
	void show(){
		System.out.println("B Is Show");
	}
	
}

public class Test{
	public static void main(String args[]){
		A obj = new B();
		obj.show();
	}
}