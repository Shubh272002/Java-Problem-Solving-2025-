class A{
	void greet(){
		System.out.println("Hello form A");
		
	}
}

class B extends A{
	void greet(String msg){
		System.out.println("Hello from B: "+msg);
	}
}

public class Test1{
	public static void main(String args[]){
		B obj = new  B();
		obj.greet();
	}
}