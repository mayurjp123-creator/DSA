package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StackAssig
{
    static int pre(char ch){
        if(ch=='+'||ch=='-'){
            return 1;
        }
        else if(ch=='*'||ch=='/'){
            return 2;
        }
        else if(ch=='('||ch==')'){
            return 0;
        }
        else{
            return 3;
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter pattern to check:");
        String str = in.next();
        String str1=" ";
        ArrayDeque<Character> stack=new ArrayDeque<>();

        for(char ch:str.toCharArray()){
            if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                
               while(!stack.isEmpty()&&stack.peek()!='(')
                {
                    str1+=stack.pop();
                }
                if (!stack.isEmpty()&&stack.peek()=='(')
                    stack.pop();
            }   
            
            else if(ch=='+' ||ch=='-' ||ch=='/' ||ch=='*' ||ch=='^' ){

                while (!stack.isEmpty()&&pre(ch)<=pre(stack.peek())) {
                    if (stack.peek() == '(')
                        break;
                        str1+=stack.pop();
                    }
                    stack.push(ch);
            }
            else{
                str1+=ch;
            }
        }
        while(!stack.isEmpty()){
            if(stack.peek()=='('){
                stack.pop();
            }
            else{
                str1+=stack.pop();
        }
    }
        System.out.println(stack);            
        System.out.println(str1);
        in.close();
    }

}

