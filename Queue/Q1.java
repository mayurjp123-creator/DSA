package Queue;

import java.util.Scanner;

class Queue{
    int queue[];
    int rear,front,MaxSize;
    void create_queue(int size){
        MaxSize=size;
        front=0;
        rear=-1;
        queue = new int[MaxSize];
    }
    void enqueue(int e){
        queue[++rear]=e;
    }
    boolean is_full(){
        return (rear==MaxSize-1);
    }
    int dequeue(){
        return queue[front++];
    }
    boolean is_empty(){
        return (rear<front);
    }
    void print_queue(){
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+"-");
        }
    }
}
public class Q1{
    public static void main(String[] args) {
        
        Queue obj= new Queue();
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
/*
 * what decrements when dequeq?
 * Circular queue
 */