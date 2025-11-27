package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StackAssig2 {
    static boolean isoperator(char ch){
        if(ch=='+' ||ch=='-' ||ch=='/' ||ch=='*' ||ch=='^' ){
            return true;
        }
        else{
            return false;
        }
    }
    static int evolution(String str){
        int a=0;
        int b=0;
        int len=str.length();
        Deque<Integer> stack=new ArrayDeque<>();
        char ch[]=str.toCharArray();
        for(int i=len-1;i>=0;i--){
            if(!isoperator(ch[i])){
                stack.push(ch[i]-'0');
            }
            else{
                a=stack.pop();
                b=stack.pop();
                stack.push(operation(a, b,ch[i] ));
            }
        }
        return stack.pop();
    }
    static int operation(int a,int b,char ch){
        switch (ch) {
            case '+':
                return a+b;
            case '^':
                return a^b;
            case '-':
                return a-b;
            case '/':
                return a/b;
            case '*':
                return a*b;
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();

        int result=evolution(str);
        System.out.println(result);


    }
}
