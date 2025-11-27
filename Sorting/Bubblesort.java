package Sorting;

public class Bubblesort {
    static void bubble_sort(int a[]){
	    for(int i=0;i<a.length-1;i++) //5-1=4 0,1,2,3,
	    {
	        for(int j=0;j<a.length-1;j++) //j stops at second last
	        {
	            if(a[j]>a[j+1]){
	                int temp=a[j];
	                a[j]=a[j+1];
	                a[j+1]=temp;
	            }
	        }
	    }
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a[]= {10,40,30,20};
		bubble_sort(a);
		for(int b:a)
		{
		   System.out.print(b+" ");
	    }
	    
	}
   
}
