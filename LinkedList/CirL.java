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
class Linked_List2
{
    Node root;
    Node last;
    void insert_left(int data){
        Node n= new Node(data); //created node
        if(root==null) {//not root
            last=root=n;
            last.next=root;} //1st becomes root
        else{
            n.next=root; //1
            root=n; //2
            last.next=root; //3
        }
    }
    void insert_right(int data){
        Node n= new Node(data); //created node
        if(root==null) {//not root
            root=n;
            last=n;
            last.next=root;} //1st becomes root
            else{
                last=n;
                root.next=last;
                last.next=root;
            }
        }
        void delete_left(){
            if(root==null){
                System.out.println("List is empty");
            }
            else{
                Node t= root;
                if(root==last)
                    last=root=null;
                else{
                root=root.next; 
                last.next=root; //next node point to root
                }
            System.out.println("Deleteed: "+t.data); //response message of deletion(AGC handels)
            }
        }
    void delete_right(){
        if(root==null){
            System.out.println("List is empty");
        }
        else{
        Node t=root;//1
        Node t1=root;//2
        if(last==root)
            root=last=null;
        else{
            while(t!=last){
                t1=t;//3
                t=t.next;//4
            }
            last=t1;
            last.next=root; //break a link
            }
        System.out.println("Deleted: "+t.data);           
        }
    }
    void print_list(){
        if(root==null){
            System.out.println("list is empty");
        }
        else{
            Node t=root;
            do{
                System.out.println(t.data+"=>");
                t=t.next;
            }while(t!=root);
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

public class CirL
 {
    public static void main(String[] args) {

        Linked_List2 obj= new Linked_List2();
        Scanner sc= new Scanner(System.in);
        int choice;
        do{
        System.out.println("\nList Menu");
            System.out.println("==========");
            System.out.println("1.Add element left");
            System.out.println("2.Delete left");
            System.out.println("3.Add element right");
            System.out.println("4.Delete right");
            System.out.println("5.Add element after");
            System.out.println("6.Delete key");
            System.out.println("7.Search key");
            System.out.println("8.Sort list");
            System.out.println("9.Print list");
            System.out.println("0.Exit");
            System.out.println("--------");
            System.out.print(":");
            choice=sc.nextInt();     

        switch(choice){
            case 1:
            System.out.print("Enter number to add too left: ");
            int data = sc.nextInt();
            obj.insert_left(data);
            break;
            case 2:
            obj.delete_left();
            break;
            case 3:
            System.out.print("Enter number to add too right: ");
            int data1 = sc.nextInt();
            obj.insert_right(data1);
            break;
            case 4:
            obj.delete_right();
            break;
            case 5:
            System.out.print("Enter Key after u want to add: ");
            int key = sc.nextInt();
            System.out.print("Enter number to add too after "+key+": ");
            int data2 = sc.nextInt();
            obj.insert_after(key, data2);;
            break;
            case 6:
            System.out.print("Enter number to add too delete: ");
            int data3 = sc.nextInt();
            obj.delete_key(data3);
            break;
            case 7:
            System.out.print("Enter number to add too Search: ");
            int data4 = sc.nextInt();
            obj.serach_list(data4);
            break;
            case 8:
            obj.sort_list();;
            break;
            case 9:
            obj.print_list();
            break;
            case 0:
            System.out.println("Thank You");
            default:
            System.out.println();
        }
    }while(choice!=0);
        sc.close();
        
    }
    
}
