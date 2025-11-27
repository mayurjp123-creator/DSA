package searching;

public class binarchsearch {
    static int binary_search(int[] a,int start,int end,int key)
    {
        if(start<=end){
            int mid=(start+end)/2;
            if(key==a[mid]){
                return mid;}
            else
            {
                if(key<a[mid]){
                    return binary_search(a,start,mid-1,key);}
                else{
                    return binary_search(a,mid+1,end,key);
                }
            }
        }
        else{
            return -1;  //not found
        }
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a[]={10 ,20 ,30 ,40};
		int start=0;
		int end=a.length-1;
		System.out.println(binary_search(a,start,end,30));
		System.out.println(binary_search(a,start,end,50));
	}


}
