package LinkedList;

import java.util.Scanner;

class DNode{
    int data;
    DNode next;
    DNode prev;
    DNode(int data){
        this.data=data;
        next=null;
        prev=null;
    }
}
class Linked_List1
{
    DNode root;
    void insert_left(int data){
        DNode n= new DNode(data); //created node
        if(root==null) //not root
            root=n; //1st becomes root
        else{
            n.next=root; //1
            root.prev=n; //2
            root=n;
        }
    }
    void insert_right(int data){
        DNode n= new DNode(data); //created DNode
        if(root==null) //not root
            root=n; //1st becomes root
        else{
            DNode t=root; //1
            while(t.next!=null){
                t=t.next; //2
            }
            t.next=n;
            n.prev=t;
        }
    }
    void delete_left(){
        if(root==null){
            System.out.println("List is empty");
        }
        else{
            DNode t = root;
            root=root.next;
            if(root.prev!=null)
                root.prev=null;
            System.out.println("Deleteed"+t.data); //response message of deletion(AGC handels)
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
            DNode t=root;//1
            DNode t1;//2
            while(t.next!=null){
                t=t.next;//4
            }
            t1=t.prev;
            t1.next=null; //break a link
            System.out.println("Deleted"+t.data);           
        }
    }
    void print_list(){
        if(root==null){
            System.out.println("list is empty");
        }
        else{
            DNode t=root;
            while(t!=null){
                System.out.print("<=| "+t.data+" |=>");
                t=t.next;
            }
        }
    }
    void serach_list(int key){
        if(root==null){
            System.out.println("list is empty");
        }
        else{
            DNode t=root;
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
            DNode t1,t2;
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
            DNode t;
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
                DNode n = new DNode(data);
                n.next = t.next; 
                t.next = n; 
            }
        }
    }
    void sort_list(){
        for(DNode i=root;i!=null;i=i.next)
        {
            for(DNode t1=root,t2=root.next;t2!=null;t1=t1.next,t2=t2.next)
            {
                if(t1.data>t2.data){
                    int temp=t1.data;
                    t1.data=t2.data;
                    t2.data=temp;
                }
            }   
        }
    }
    void printreverse(){
        if(root==null){
            System.out.println("list is empty");
        }
        else{
            DNode t=root;
            while(t.next!=null){
                t=t.next;
            }
            while(t!=null){
                System.out.print("<=| "+t.data+" |=>");
                t=t.prev;
            }
        }
    }
}
public class L2 {
    public static void main(String[] args) {

        Linked_List1 obj= new Linked_List1();
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
            System.out.println("10.Reverse list");
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
            case 10:
            obj.printreverse();
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


    
