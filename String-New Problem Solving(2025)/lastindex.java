

class lastindex{
	public static void main(String args[]){
		String s1 = "Tech Vidya Is Best Institute Of Noida for Java and  Java developer";
		String s2 = "Java";
		int lastindex = s1.lastIndexOf((s2));
		System.out.println(lastindex);
		if(lastindex == -1){
			System.out.println("String is Not found!!");
		}else{
			System.out.println("Last Index of s2 in s1 Is :-"+lastindex);
		}
		}
	}
