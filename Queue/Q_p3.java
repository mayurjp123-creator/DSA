package Queue;

import java.util.Scanner;

class Queue{
    int queue[];
    int rear1,front1,MaxSize,front2,rear2;
    void create_queue(int size){
        MaxSize=size;
        front1=0;
        rear1=-1;
        front2=MaxSize-1;
        rear2=MaxSize;
        queue = new int[MaxSize];
    }
    void enqueue(int e){
        queue[++rear1]=e;
    }
    void enqueue2(int e){
        queue[--rear2]=e;
    }
    boolean is_full(){
        return ((rear1+1)==rear2);  //(rear2-1)==rear1
    }
    int dequeue1(){

        return queue[front1++];
    }
    int dequeue2(){

        return queue[front2--];
    }

    boolean is_empty1(){
        return (rear1<front1);
    }

    boolean is_empty2(){
        return (rear2>front2);
    }
    void print_queue1(){
        for(int i=front1;i<=rear1;i++){
            System.out.print(queue[i]+"-");
        }
    }
    void print_queue2(){
        for(int i=front2;i>=rear2;i--){
            System.out.print(queue[i]+"-");
        }
    }
}
public class Q_p3{
    public static void main(String[] args) {
        
    }
}
/*
 * 
 */