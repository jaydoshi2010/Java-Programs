class BinarySearch{
	public static void main(String args[]){
	 int c=4;
	 int a[]={1,3,4,5,6,8,9,10,11,14};

	 int f=0;
	 int l=a.length;
	 if(c<a[l-1]){
	 while(f<=l){
		int mid=(f+l)/2;
		if(a[mid]>c)
		{
			l=mid-1;
		}
		else if(a[mid]==c){
			System.out.println(c+" is at number "+ (mid+1));
			break;
		}
		else{
			f=mid+1;
		}

	 }
	}
	else{
		System.out.println(c+" is not found in array.");
	}
}
}