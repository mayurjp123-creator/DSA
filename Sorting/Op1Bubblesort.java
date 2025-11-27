package Sorting;

public class Op1Bubblesort {
    static void optimized1_bubble_sort(int a[]){
	    boolean flag=true;
	    for(int i=a.length-1;i>0;i--) //limit passes
	    {
	        flag =true;
	        for(int j=0;j<i;j++) //j stops at second last
	        {
	            if(a[j]>a[j+1]){
	                int temp=a[j];
	                a[j]=a[j+1];
	                a[j+1]=temp;
	                flag=false;
	            }
	        }
	        if(flag==true){
	            break;
	        }
	    }
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a[]= {10,40,30,20};
	    optimized1_bubble_sort(a);
	    for(int b:a)
		{
		   System.out.print(b+" ");
	    }
	    
	}

}
