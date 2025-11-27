package tp;

import java.util.Scanner;

public class test7 {
    static int M[][];
    static int relation(int a,int[][] m){
        int sum=0;
        for(int i=0;i<a;i++){
            sum=0;
            for(int j=0;j<a;j++)
            if(knows(j,i)){
                sum++;
            }
            if(sum==a-1){
                return i;
            }
        }
        
        return -1;
    }

    static boolean knows(int a,int b){
        return M[a][b]==1;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter number of people coming....: ");
        int guest=sc.nextInt();
        M=new int[guest][guest];
        for(int i=0;i<guest;i++){
            for(int j=0;j<guest;j++){
                M[i][j]=sc.nextInt();
            }
        }
        System.out.println("=>"+relation(guest, M));
        sc.close();
    }
}
