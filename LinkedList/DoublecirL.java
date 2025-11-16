package LinkedList;

import java.util.Scanner;

class DCNode{
    int data;
    DCNode next;
    DCNode prev;
    DCNode(int data){
        this.data=data;
        next=null;
        prev=null;
    }
}
class Double_lin_cir
{
    DCNode root,last;
    void insert_left(int data){
        DCNode n= new DCNode(data); 
        if(root==null)
        { 
            last=root=n; 
            root.next=last.next=root;
            root.prev=last.prev=root;
        }   
        else
        {
            n.next=root; 
            root.prev=n;
            root=n;
            root.prev=last;
            last.next=root;
        }
    }
    void insert_right(int data){
        DCNode n= new DCNode(data); 
        if(root==null)
        { 
            last=root=n; 
            root.next=last.next=root;
            root.prev=last.prev=root;
        }
        else{
            last.next=n;
            n.prev=last;
            last=n;
            last.next=root;
            root.prev=n;
        }
    }
    void delete_left(){
        if(root==null){
            System.out.println("List is empty");
        }
        else
        {
            DCNode t = root;
            if(root==last)
                root=last=null;
            root=root.next;
            root.prev=last;
            last.next=root;
            System.out.println("Deleteed: "+t.data); 
        }
    }
    void delete_right(){
        if(root==null){
            System.out.println("List is empty");
        }
        else if(root==last){
            System.out.println("Deleted: "+root.data);
            last=root=null;
        }
        else{
            DCNode t=last;
            last=last.prev;
            last.next=root;
            root.prev=last;
            System.out.println("Deleted: "+t.data);            
        }
    }
    void print_list(){
        if(root==null){
            System.out.println("list is empty");
        }
        else{
            DCNode t=root;
            do{
                System.out.println("<=| "+t.data+" |=>");
                t=t.next;
            }while(t!=root);
        }
    }
    void printreverse(){
        if(root==null){
            System.out.println("list is empty");
        }
        else{
            DCNode t=last;
            do{
                System.out.println("<=| "+t.data+" |=>");
                t=t.prev;
            }while(t!=last);
        }
    }
}
public class DoublecirL {
    public static void main(String[] args) {

        Double_lin_cir obj= new Double_lin_cir();
        Scanner sc= new Scanner(System.in);
        int choice;
        do{
        System.out.println("\nList Menu");
            System.out.println("==========");
            System.out.println("1.Add element left");
            System.out.println("2.Delete left");
            System.out.println("3.Add element right");
            System.out.println("4.Delete right");
            System.out.println("5.Print list");
            System.out.println("6.Reverse");
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
            obj.print_list();
            break;
            case 6:
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


    
