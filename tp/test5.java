package tp;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
public class test5 {
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
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number of elements in first list: ");
        int n=sc.nextInt();
        System.out.println("Enter your first list: ");
        for(int i=0;i<n;i++){
            list1.offer(sc.nextInt());
        }
        System.out.println("Enter your number of elements in Second list: ");
        int n1=sc.nextInt();
        System.out.println("Enter your Second list: ");
        for(int i=0;i<n1;i++){
            list2.add(sc.nextInt());
        }
        
        System.out.println(merge(list1, list2));
        
        
    }
    
}
