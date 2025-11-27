package tp;
import java.util.Scanner;
public class test9 {

    static void printprices(int[] prices){
        System.out.print("[");
        for(int a:prices){
            System.out.print(a+","); 
        }
        System.out.print("]");
    }

    static int binary_search(int []a,int start,int end,int key){
        if(start<=end){
            int mid=(start+end)/2;
            if(key==a[mid]){
                return mid;
            }
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

    static void quick_sort(int[] prices,int start,int end){
        int i,j,pivot,temp;
	    i=start;
	    pivot=end;
	    j=end;
	    
	    if(i<j) // size-1 stop
	    {
	        while(prices[i]<prices[pivot])
	            i++;
	        while(prices[j]>prices[pivot])
	            j--;
	        if(i<j){
	            temp = prices[i];prices[i]=prices[j];prices[j]=temp;
	        }
	    }
	    //if pivot in start
	    if(i<end){
	        quick_sort(prices,i+1,end);
	    }
	    //if pivot in end
	    if(j>start){
	        quick_sort(prices,start,j-1);
	    }
    }
    public static void main(String[] args) {
        System.out.println("========Welcome to Chips Crowd Mobiles========");

        Scanner sc = new Scanner(System.in);
        int prices[] = {14999, 8999, 12999, 19999, 9999, 17999, 7999};
        
        System.out.println("\nPrinting Unsorted array.......");
        System.out.println();
        printprices(prices);
        quick_sort(prices,0,prices.length-1);
        System.out.println();
        System.out.println("\nPrinting sorted array.......");
        System.out.println();
        printprices(prices);
        System.out.println();
        System.out.print("\nEnter amount of mobile u want too search: ");
        int key=sc.nextInt();
        System.out.print("\nMobile found on this Index: "+binary_search(prices,0,prices.length-1,key));
        sc.close();
    }
}
