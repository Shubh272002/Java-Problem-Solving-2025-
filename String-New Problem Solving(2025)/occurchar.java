class occurchar{
	public static void main(String args[]){
		String str ="Shubhhuuvermaarevvvhh";
		char ch ='h';
		int count = 0;
		for(int i=0;i<str.length();i++){
			char ch1 = str.charAt(i);
			if(ch==ch1){
				count++;
			}
			
		}
		System.out.println("character" +ch+ "occurs" +count+ "times in the Given String");
	}
}