package omnimini;

import java.util.ArrayDeque;
import java.util.Deque;

public class Tab {
    String currentpage;
    Deque<String> Backward;
    Deque<String> Forward;

    public Tab(String url) {
        Backward=new ArrayDeque<>();
        Forward=new ArrayDeque<>();
        currentpage=url;
    }

    public String getcurrentpage(){
        return this.currentpage;
    }

    public void visit(String url){
        Backward.push(currentpage);
        currentpage=url;
        Forward.clear();
    }

    public boolean isback(){
        if(Backward.isEmpty())
            return false;

        Forward.push(currentpage);
        currentpage=Backward.pop();
        return true;
    }
    public boolean isfront(){
        if(Forward.isEmpty())
            return false;

        Backward.push(currentpage);
        currentpage=Forward.pop();
        return true;
    }

}
