package Sorting;

public class selection {
    static void selection_sort(int a[])
	{
	    int min,pos;
		for(int i=0;i<a.length-1;i++)
			{
				min=a[i];pos=i;//reference
				for(int j=i+1;j<a.length;j++)//j stops at second last
					{	
						if(a[j]<min)
							{//update
							  min=a[j];pos=j;
							}
					}
			//swap
			a[pos]=a[i];a[i]=min;
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
