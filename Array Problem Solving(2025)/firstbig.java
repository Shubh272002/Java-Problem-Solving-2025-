class firstbig{
	public static void main(String[] args){
		int arr[] = {43,23,232,223,233,300,550,800,700};
		int fbig= arr[0];
		int sbig= arr[1];
		for(int i=1;i<arr.length;i++){
			if(fbig<arr[i]){
				sbig=fbig;
				fbig=arr[i];
			}
			else if(sbig<arr[i])
			{
				sbig = arr[i];
			}
		}
		System.out.println("First Biggest Element Is :- "+fbig);
		System.out.println("Second Biggest Element Is :- "+sbig);
	}
}