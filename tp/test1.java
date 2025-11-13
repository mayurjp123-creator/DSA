package tp;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Stack_queue{
    Deque<Integer> pri=new ArrayDeque<>();
    Deque<Integer> aux=new ArrayDeque<>();
    int MaxSize;
    void create_queue(int size){
        MaxSize=size;
    }
    void enqueue(int k){
        pri.push(k);
    }
    int dequeue(){
        while(!pri.isEmpty()){
            aux.push(pri.pop());
        }
        int num = aux.pop();
        while(!aux.isEmpty()){
            pri.push(aux.pop());
        }
        return num;
    }
    boolean is_empty(){
        return pri.isEmpty();
    }
    boolean is_full(){
        return pri.size()==MaxSize;
    }
    void print_queue(){
        while(!pri.isEmpty()){
            aux.push(pri.pop());
        }
        while(!aux.isEmpty()){
            System.out.print(aux.peek()+" - ");
            pri.push(aux.pop());
        }
    }
}
public class test1 {
    public static void main(String[] args) {
        Stack_queue obj= new Stack_queue();
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter your size of Queue");
        int size = sc.nextInt();
        int choice;
        obj.create_queue(size);
        do{
        System.out.println("\nStack Menu");
            System.out.println("==========");
            System.out.println("1.Enqueue");
            System.out.println("2.Dqueue");
            System.out.println("3.Print_Queue");
            System.out.println("0.Exit");
            System.out.println("--------");
            System.out.print(":");
            choice=sc.nextInt();

        switch(choice){
            case 1:
            if(!obj.is_full()){
            System.out.print("Enter number: ");
            int e=sc.nextInt();
            obj.enqueue(e);
            }else{System.out.println("Queue is full");}
            break;
            case 2:
            if(!obj.is_empty()){
            System.out.println("Dequeue");
            obj.dequeue();
            }else{
                System.out.println("queue is empty");
            }
            break;
            case 3:
            if(!obj.is_empty()){
                System.out.println("print Queue");
                obj.print_queue();
                
            }else{
                System.out.println("Queue is empty");
            }
            break;
            case 0:
            System.out.println("Thank You");
        }
    }while(choice!=0);
        sc.close();
    }
}
