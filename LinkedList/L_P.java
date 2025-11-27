package LinkedList;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class Linked_List
{
    Node root;
    void insert_left(int data){
        Node n= new Node(data); //created node
        if(root==null) //not root
            root=n; //1st becomes root
        else{
            n.next=root; //1
            root=n; //2
        }
    }
    void delete_left(){
        if(root==null){
            System.out.println("List is empty");
        }
        else{
            Node t= root; //temp node
            root=root.next; //next node root
            System.out.println("Deleteed"+t.data); //response message of deletion(AGC handels)
        }
    }
    void insert_right(int data){
        Node n= new Node(data); //created node
        if(root==null) //not root
            root=n; //1st becomes root
        else{
            Node t=root; //1
            while(t.next!=null){
                t=t.next; //2
            }
            t.next=n; // 3 connected

        }
    }
    void delete_right(){
        if(root==null){
            System.out.println("List is empty");
        }
        else if(root.next==null){
            root=null;
        }
        else{
            Node t=root;//1
            Node t1=t;//2
            while(t.next!=null){
                t1=t;//3
                t=t.next;//4
            }
            /*
             * if(t==root)
             *    root=null;
             */
            t1.next=null; //break a link
            System.out.println("Deleted"+t.data);           
        }
    }
    void print_list(){
        if(root==null){
            System.out.println("list is empty");
        }
        else{
            Node t=root;
            while(t!=null){
                System.out.print("| "+t.data+" |=>");
                t=t.next;
            }
        }
    }
    void serach_list(int key){
        if(root==null){
            System.out.println("list is empty");
        }
        else{
            Node t=root;
            while(t!=null){
                if(t.data==key){
                    System.out.println("yes it exists");
                    return;}
                else{
                t=t.next;
                }
            }
            System.out.println("No there in list");
        }
    }
    void delete_key(int key){
        if(root==null){
            System.out.println("List is empty");
        }
        // else if(root.data==key){
        //     Node t=root;
        //     System.out.println("Deleted "+ root.data);
        //     root=root.next;
        //     t=null;
        // }
        else
        {
            Node t1,t2;
            t1=t2=root;
            while(t1!=null)
            {
                if(t1.data==key){
                    System.out.println("found!!!!");
                    break;}
                t2=t1;
                t1=t1.next;
            }
            if(t1==null){
               System.out.println("not found");
            }
            else
            {
                System.out.println(" found");

                if(root==null){
                    root=root.next; //case1
                }  
                else if(t1.next==null){
                    t2.next=null; //case2
                } 
                else{
                    t2.next=t1.next; //case3
                    System.out.println("deleted"+t1.data);
                }                 
            } 
        }
    }
    void insert_after(int key, int data)
    {
        if(root == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node t;
            t=root;
            while(t!=null)
            {
                if(t.data ==key)
                {
                    break;
                }
                t=t.next;
            }
            if(t==null)
            {
                System.out.println("Not found");
            }
            else
            {
                Node n = new Node(data);
                n.next = t.next; 
                t.next = n; 
            }
        }
    }
    void sort_list(){
        for(Node i=root;i!=null;i=i.next)
        {
            for(Node t1=root,t2=root.next;t2!=null;t1=t1.next,t2=t2.next)
            {
                if(t1.data>t2.data){
                    int temp=t1.data;
                    t1.data=t2.data;
                    t2.data=temp;
                }
            }   
        }
    }
}

class Stack{
    Linked_List obj=new Linked_List();
    // int stack[];
    // int MaxSize,tos;
    void create_stack(int size){
        
    }
    void push(int e){
        obj.insert_left(e);
    }
    int peek(){
        Node tos = obj.root;
        return tos.data;

    }
    // boolean is_full(){
    //     return ();
    // }
    void pop(){
        if(obj.root==null){

        }
        obj.delete_left();
    
    }
    // boolean is_empty(){
    //     return (tos==-1);
    // }
    void print_stack(){
        
    }
}

public class L_P{
    public static void main(String[] args) {
        
        Stack obj= new Stack();
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter your size of stack");
        int size = sc.nextInt();
        int choice;
        obj.create_stack(size);
        do{
        System.out.println("\nStack Menu");
            System.out.println("==========");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.print");
            System.out.println("4.peek");
            System.out.println("0.Exit");
            System.out.println("--------");
            System.out.print(":");
            choice=sc.nextInt();     

        switch(choice){
            case 1:
            // if(!obj.is_full()){
            System.out.print("Enter number: ");
            int e=sc.nextInt();
            obj.push(e);
            // }else{System.out.println("Stack is full");}
            break;
            case 2:
            // if(!obj.is_empty()){
            System.out.println("pop");
            obj.pop();
            // }else{
            //     System.out.println("Stack is empty");
            // }
            break;
            case 3:
            // if(!obj.is_empty()){
            System.out.println("print stack");
            obj.print_stack();
            // }else{
            //     System.out.println("Stack is empty");
            // }
            break;
            case 4:
            // if(!obj.is_empty()){
            int e1=obj.peek();
            System.out.println("peek"+e1);
            // }else{
            //     System.out.println("Stack is empty");
            // }
            break;
            case 0:
            System.out.println("Thank You");
        }
    }while(choice!=0);
        sc.close();
    }
}