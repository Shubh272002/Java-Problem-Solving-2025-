class Parent{
	void display(double a){
		System.out.println("int");
	}
}

class Child extends Parent{
	void display(double a){
		System.out.println("double");
	}
}

public class Test3{
	public static void main(String args[]){
		Parent obj  = new Child();
		obj.display(10);
	}
}