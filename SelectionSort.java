class SelectionSort{
	public static void main(String args[]){
		int a[]={23,8,10,5,14,9,4,1,19,20,13,11};
		int x=0;
		
	      for(int j=0;j<a.length;j++){
			int temp=a[j];
		for(int i=j+1;i<a.length;i++)
		{
		   
			if(a[i]<temp)
			{
			   temp=a[i];
			   x=i; 
			}
		}
  		int y=a[j];
		a[j]=a[x];
		a[x]=y;
	      }
		for(int k=0;k<a.length;k++){
		System.out.println(a[k]);
	      }
	}
}