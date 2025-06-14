class commonele{
	public static void main(String args[]){
		int ar1[]= {12,13,14,15,34,67,56,90,45,58,94};
		int ar2[] = {15,34,13,56,43,23,14,65,34,67,87};
		System.out.println("Common Element Are...");
		for(int i=0;i<ar1.length;i++){
			for(int j=0;j<ar2.length;j++){
				if(ar1[i]==ar2[j]){
					System.out.println(ar1[i]);
					break;
				}
			}
		}
	}
}