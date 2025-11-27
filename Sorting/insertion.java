package Sorting;

public class insertion {
    static void selection_sort(int a[])
	{
	    int element;
		for(int i=0;i<a.length-1;i++)
			{
				element=a[i+1];
				int j=i+1;
				while(j>0 && a[j-1]>element)
			    {
			        //move back
			        a[j]=a[j-1];
			        j--; //move ahead
			    }
			    
			    //insert
			    a[j]=element;
			}

	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a[]= {10,40,30,20};
	    selection_sort(a);
	    for(int b:a)
		{
		   System.out.print(b+" ");
	    }
	    
	}

}
