class perterson{
	public static void main(String arg[]){
		int num =147,temp,last,fact,sum=0;
		temp=num;
		while(temp!=0){
			last=temp%10;
			fact=1;
			for(int i=1;i<=last;i++){
				fact*=i;
			}
			sum+=fact;
			temp=temp/10;
			
	}
	if(num==sum)
		System.out.print(" It Is a Peterson Number:");
	else
		System.out.print(" It Is Not a Peterson Number:");
	}
}