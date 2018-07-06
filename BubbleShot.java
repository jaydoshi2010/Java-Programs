public class BubbleShot{
public static void main(String args[]){
	int a[]={1,4,5,7,8,6,9,3};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			   if(a[i]<a[j])
			   {	int temp;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			   }
		}
	}
	for(int k=0;k<a.length;k++)
	{
		System.out.println(a[k]);
	}
	
	

																							
}
}