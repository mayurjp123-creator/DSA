package tp;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Queue_stack{
    int MaxSize;
    Queue<Integer> queue=new ArrayDeque<>();
    void create_stack(int size){
        MaxSize=size;
    }
    void push(int e){
        queue.add(e);
    }
    int pop(){
        
        for(int i=0;i<queue.size()-1;i++){
            queue.add(queue.remove());
        }
        int temp=queue.peek();
        queue.remove();
        return temp;
    }
    int peek(){
        for(int i=0;i<queue.size()-1;i++){
            queue.add(queue.remove());
        }
        int temp=queue.peek();
        queue.add(queue.remove());
        return temp;
        
    }
    boolean is_empty(){
        return queue.isEmpty();
    }
    boolean is_full(){
        return MaxSize==queue.size();
    }
    void print_stack(){
        
        for(int j=0;j<queue.size();j++){
        for(int i=0;i<queue.size()-1;i++){
            queue.add(queue.remove());
        }
        System.out.println(queue.peek());
        }       
    }
}
public class test{
    
    public static void main(String[] args) {
        
        Queue_stack obj= new Queue_stack();
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter your size of Queue");
        int size = sc.nextInt();
        int choice;
        obj.create_stack(size);
        do{
        System.out.println("\nStack Menu");
            System.out.println("==========");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Print_Stack");
            System.out.println("0.Exit");
            System.out.println("--------");
            System.out.print(":");
            choice=sc.nextInt();

        switch(choice){
            case 1:
            if(!obj.is_full()){
            System.out.print("Enter number: ");
            int e=sc.nextInt();
            obj.push(e);
            }else{System.out.println("Stack is full");}
            break;
            case 2:
            if(!obj.is_empty()){
            int a=obj.pop();
            System.out.println(a+"====");
            }else{
                System.out.println("Stack is empty");
            }
            break;
            case 3:
            if(!obj.is_empty()){
                System.out.println(obj.peek()); 
            }else{
                System.out.println("Stack is empty");
            }
            break;
            case 4:
            if(!obj.is_empty()){
                obj.print_stack(); 
            }else{
                System.out.println("Stack is empty");
            }
            break;
            case 0:
            System.out.println("Thank You");
        }
    }while(choice!=0);
        sc.close();
    }
}

