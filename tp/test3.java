package tp;
import java.util.*;
class Node_pol
{
    int coefficient;
    int power;
    
    Node_pol next;

    Node_pol(int coef, int pow)
    {
        coefficient = coef;
        power = pow;
        next = null;
    }
    void print()
    {
        System.out.print(coefficient+"x^" + power + " ");
    }
}


public class test3
{
    static LinkedList<Node_pol> poly_1 = new LinkedList<>();
    static LinkedList<Node_pol> poly_2 = new LinkedList<>();
    static LinkedList<Node_pol> poly_result = new LinkedList<>();
    static Scanner sc = new Scanner (System.in);

    static void input(int n)
    {
        for(int i=0;i<n;i++)
        {   
        System.out.println("Enter first pol");
        System.out.println("Enter cofficient: ");
        int c = sc.nextInt();
        System.out.println("Enter power: ");
        int p = sc.nextInt();
        poly_1.add(new Node_pol(c,p));
    }
    
    for(int i=0;i<n;i++)
    {
            System.out.println("Enter Second pol");
            System.out.println("Enter cofficient: ");
            int c = sc.nextInt();
            System.out.println("Enter power: ");
            int p = sc.nextInt();
            poly_2.add(new Node_pol(c,p));
        }

    }

    static void display(LinkedList<Node_pol> poly){
        for(Node_pol p:poly){
            p.print();
        }
        System.out.println();
    }

    static void add(LinkedList<Node_pol> poly,LinkedList<Node_pol> poly1){
        int temp=0;
        int temp1=0;
        for(Node_pol p:poly){
            for(Node_pol p1:poly1){
                if(p.power==p1.power){
                    temp=p.coefficient;
                    temp1=p1.coefficient;
                    poly_result.add(new Node_pol(temp+temp1,p.power));
                }
            }
        }
    }
    static void sort(LinkedList<Node_pol> poly){
        for(Node_pol p:poly){
            for(Node_pol p1:poly){
                if(p.power>p1.power){
                    Node_pol temp=p;
                    p=p1;
                    p1=temp;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter number of terms for polynomial: ");
        int n = sc.nextInt();
        input(n);
        System.out.println("First polynomial is: ");
        display(poly_1);
        System.out.println("Second polynomal is: ");
        display(poly_2);
        add(poly_1,poly_2);
        System.out.println("Result is: ");
        
        sort(poly_result);
        display(poly_result);

    }

}