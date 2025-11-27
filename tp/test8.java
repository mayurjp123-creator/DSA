package tp;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class test8
{
    static boolean checking(String s){
        Deque<Character> stack = new ArrayDeque<>();
        boolean Flag = true;
        for(char s1:s.toCharArray()){
            if(s1=='(' || s1=='[' || s1=='{' ){
                stack.push(s1);
            }
            else if(s1==')')
            {
                if(stack.isEmpty() || stack.peek()!='('){
                    Flag = false;
                    break;
                }
                else
                {
                    stack.pop();
                }   
            }
            else if(s1==']')
            {
                if(stack.isEmpty() || stack.peek()!='['){
                    Flag = false;
                    break;
                }
                else
                {
                    stack.pop();
                }   
            }
            else if(s1=='}')
            {
                if(stack.isEmpty() || stack.peek()!='{'){
                    Flag = false;
                    break;
                }
                else
                {
                    stack.pop();
                }   
            }
        }
        if(!stack.isEmpty()){
            Flag=false;
        }
            return Flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(checking(str));
    }
} 