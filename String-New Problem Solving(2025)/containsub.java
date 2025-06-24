class containsub{
	public static void main(String args[]){
		String s1 = "My Name is Shubh";
		String s2 = " Shubh";
		
		if(s1.contains(s2))
			System.out.println(s2+ " Is a Substring Of "+s1);
		else
			System.out.println(s2+ "Is not a Substring Of " +s1);
	}
}