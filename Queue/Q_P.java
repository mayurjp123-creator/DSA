package Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Q_P {
    static void binary(int n){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("1");
        for(int i=1;i<=n;i++){
            // bin[i]=bin[i-1]+"0";
            // bin[i+1]=bin[i-1]+"1";
            String cur=queue.poll();
            System.out.print(cur+" ");

        queue.add(cur+"0");
        queue.add(cur+"1");
        }
    }
    static void stocks(int arr[]){
        int Max_profit=0;
        int sell_date=0,buy_date=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=arr.length-1;j>i;j--){
                int profit = arr[j]-arr[i];
                if(profit>Max_profit){
                    Max_profit=profit;
                    buy_date=i;
                    sell_date=j;
                }
            }
        }
        System.out.println(Max_profit+" "+buy_date+" "+sell_date+" ");

    }
    public static void main(String[] args) {
        int arr[] = {100 ,180 ,260 ,310 ,40 ,535, 695 ,30 ,50 ,70 ,20 ,40 ,60 ,90 ,10};
        stocks(arr);
    }
}
