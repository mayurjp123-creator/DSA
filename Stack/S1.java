package Stack;

import java.util.Scanner;

class Stack{
    int stack[];
    int MaxSize,tos;
    void create_stack(int size){
        MaxSize=size;
        tos=-1;
        stack = new int[MaxSize];
    }
    void push(int e){
        stack[++tos]=e;
    
    }
    int peek(){
        return (stack[tos]);
    }
    boolean is_full(){
        return (tos==MaxSize-1);
    }
    int pop(){
        return stack[tos--];
    
    }
    boolean is_empty(){
        return (tos==-1);
    }
    void print_stack(){
        for(int i=tos;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}

public class S1{
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
            System.out.println("3.Peek");
            System.out.println("4.Print");
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
            System.out.println("pop");
            obj.pop();
            }else{
                System.out.println("Stack is empty");
            }
            break;
            case 3:
            if(!obj.is_empty()){
            System.out.println("print stack");
            obj.print_stack();
            }else{
                System.out.println("Stack is empty");
            }
            break;
            case 4:
            if(!obj.is_empty()){
            int e1=obj.peek();
            System.out.println("peek"+e1);
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