package LinkedList;

import java.util.Scanner;

class Queue {
    Node front, rear;
    Linked_List list=new Linked_List();

    Queue() {
        front = rear = null;
    }

    void enqueue(int data){
        Node n= new Node(data); //created node
        if(front==null) //not root
            front=rear=n; //1st becomes root
        else{
            rear.next=n;
            rear=n;
        }
    }

    void dequeue(){
        if(front==null){
            System.out.println("List is empty");
        }

        else{
            Node t=front; //temp node
            if(front==rear)
                front=rear=null;
            front=front.next; //next node root
            System.out.println("Deleteed"+t.data); //response message of deletion(AGC handels)
        }
    }

    boolean is_empty() {
        return front == null;
    }

    void print_queue(){
        if(front==null){
            System.out.println("list is empty");
        }
        else{
            Node t=front;
            while(t!=null){
                System.out.print("|"+t.data+"|=>");
                t=t.next;
            }
        }
    }
}

public class L_Q{
    public static void main(String[] args) {
        
        Queue obj= new Queue();
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter your size of Queue");
        int choice;
        // obj.create_queue(size);
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
            // if(!obj.is_full()){
            System.out.print("Enter number: ");
            int e=sc.nextInt();
            obj.enqueue(e);
            // }else{System.out.println("Queue is full");}
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