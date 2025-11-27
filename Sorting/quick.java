package Sorting;

public class quick {
    static void quick_sort(int a[],int start,int end)
	{
	    int i,j,pivot,temp;
	    i=start;
	    pivot=a[(start+end)/2];
	    j=end;
	    
	    while(i<=j) // size-1 stop
	    {
	        while(a[i]<pivot)
	            i++;
	        while(a[j]>pivot)
	            j--;
	        if(i<=j){
	            temp = a[i];a[i]=a[j];a[j]=temp;i++;j--;
	        }
	    }
	    //if pivot in start
	    if(i<end){
	        quick_sort(a,i,end);
	    }
	    //if pivot in end
	    if(j>start){
	        quick_sort(a,start,j);
	    }

		// if(i<j){
		// 	while(a[i]<a[pivot])
	    //       i++;
	    //     while(a[j]>a[pivot])
	    //        j--;
	    //     if(i<=j){
	    //        temp = a[i];a[i]=a[j];a[j]=temp;i++;j--;
	    //     }
		// }
		// if(i<end)
		// 	quick_sort(a, i, end);
		// if(j>start)
		// 	quick_sort(a, start, j);
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a[]= {10,90,100,10,6,0,0,8,9,6,10,90,100,40,40,33};
	    quick_sort(a,0,a.length-1);
	    for(int b:a)
		{
		   System.out.print(b+" ");
	    }
	    
	}
}
