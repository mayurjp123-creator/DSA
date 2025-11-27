package Sorting;

public class merge {
    static void merge_sort(int a[],int start,int end)
	{
	    if(start<end) // size-1 stop
	    {
	        int mid= (start+end)/2;
	        merge_sort(a,start,mid); // left half
	        merge_sort(a,mid+1,end); // right half
	        merger(a,start,mid,end);
	    }
	}
	static void merger(int a[],int start,int mid ,int end){
	    int i,j; // index for blocks
	    int tindex,temp[]; // temp array
	    
	    i=start;
	    tindex=start;
	    j=mid+1;
	    temp= new int[a.length];
	    
	    while(i<=mid && j<=end) // boundry conditions
	    {
	        if(a[i]<a[j])
	            temp[tindex++]=a[i++];
	        else
	            temp[tindex++]=a[j++];
	    }
	    while(i<=mid)
	        temp[tindex++]=a[i++];
	    while(j<=end)
	        temp[tindex++]=a[j++];
	   
	    //copy temp to a again for round i+1
	    
	    for(i=start;i<=end;i++)
	        a[i]=temp[i];
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a[]= {10,40,30,20,10,100,40};
	    merge_sort(a,0,a.length-1);
	    for(int b:a)
		{
		   System.out.print(b+" ");
	    }
	    
	}
}

