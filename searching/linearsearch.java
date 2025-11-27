package searching;

public class linearsearch {
    static int sequential_search(int[] a,int key){
    
        for(int i=0;i<a.length;i++){
            if(key==a[i])
                return i;  //found
        }
        return -1;  //not found
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int a[]={10 ,20 ,30 ,40};
		System.out.println(sequential_search(a,30));
		System.out.println(sequential_search(a,50));
	}

}