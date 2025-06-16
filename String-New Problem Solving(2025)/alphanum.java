class alphanumn{
	public static void main(String args[]){
		String str = "Neelkanth@1234Institute87363";
		int al= 0;
		int num = 0;
		for(int i=0;i<=str.length()-1;i++){
			char c = str.charAt(i);
			if((c>'a' && c<='z')|| (c>='A' && c<='Z'))
				al++;
			else if(c>='0' && c<='9')
				num++;
			
		}
		System.out.println("Total No Of alphabet is :-"+al);
		System.out.println("Total No Of numeric is :-"+num);
		System.out.println("Total No Of Alph-Numric is :-"+(al+num));
		
		
	}
}