package tp;

import java.util.HashSet;
import java.util.Scanner;


public class test4 {
    static int longest_substring(String s){
        int l=0;
        int r=0;
        int maxLength=0;

        HashSet<Character> set=new HashSet<>();

        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
                maxLength=Math.max(maxLength,r-l);
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int count=longest_substring(str);
        System.out.println(count);
        sc.close();
    }
}
