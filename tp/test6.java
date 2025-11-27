package tp;

import java.util.LinkedList;
import java.util.Scanner;

public class test6 {
    static LinkedList<Integer> merge(LinkedList<Integer> list1,LinkedList<Integer> list2){
        LinkedList<Integer> list3 = new LinkedList<>();
        while(!list1.isEmpty() && !list2.isEmpty()){
            if(list1.peek()>list2.peek()){
                list3.offer(list2.poll());
            }
            else if(list1.peek()<list2.peek()){
                list3.offer(list1.poll());
            }
            else if(list1.peek()==list2.peek()){
                list3.offer(list1.poll());
                list3.offer(list2.poll());
            }
        }
        while(!list1.isEmpty()) {
            list3.offer(list1.poll());
        }
        while(!list2.isEmpty()) {
            list3.offer(list2.poll());
        }
        return list3;
    }

    static LinkedList<Integer> kList(LinkedList<LinkedList<Integer>> arr){
        LinkedList<LinkedList<Integer>> list=new LinkedList<>();
        while (arr.size()!=1) {
            arr.offer(merge(arr.poll(), arr.poll()));
        }

        return arr.poll();
    }
    
    public static void main(String[] args) {
        LinkedList<LinkedList<Integer>> list = new LinkedList<>();
        // LinkedList<Integer> list1 = new LinkedList<>();
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enetr number of linked list you want to merge: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            LinkedList<Integer> list1 = new LinkedList<>();
            System.out.print("Enter your number of elements in "+ i+" list: ");
            int n1 =sc.nextInt();
            System.out.println("Enter your"+ i +" list: ");
            for(int j=0;j<n1;j++){
            list1.offer(sc.nextInt());
            }
        list.offer(list1);
        }
        System.out.println(kList(list));
        sc.close();
        
    }
    
}
