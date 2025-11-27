package Queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q_p1 {
    public static void main(String[] args) {
        String bid;
        Scanner sc=new Scanner(System.in);
        List<Integer> bid_list = new ArrayList<>();
        
        while(true)
        {
            System.out.print("enter bid(blank to stop): ");
            bid=sc.nextLine().trim();
            if(bid.isEmpty())
            {break;
            }
            else{
                bid_list.add(Integer.parseInt(bid));
            }
        }
        System.out.print("Bids are: "+bid_list);
        System.out.println("Bids are: "+Collections.max(bid_list));
    }
    
}
/*
 * 
 * isEmpty()-in built 
 * Collentions.max()-in built
 * do not use ==" ";
 * use trim when u want to take blank too stop
 */