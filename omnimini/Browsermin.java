package omnimini;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Browsermin {
    ArrayList<Tab> tabs;
    int currentTab;
    Queue<String> history;

    public Browsermin() {
        tabs=new ArrayList<>();
        currentTab=-1;
        history=new LinkedList<>();
    }

    void addtohistory(String url){
        if(history.size()==10){
            history.poll();
        }
        history.offer(url);
    }

    void newTab(String url){
        Tab t=new Tab(url);
        tabs.add(t);
        currentTab=tabs.size()-1;
        addtohistory(url);
        System.out.println("[Success] Tab"+(currentTab+1)+"created. Logging: "+url);
    }

    void visit(String url){
        if(tabs.isEmpty()){
            System.out.println("No Acitve Tabs....");
            return;
        }

        Tab t=tabs.get(currentTab);
        System.out.println("[Nav] Tab"+(currentTab+1)+": "+t.getcurrentpage()+" -> "+url);
        t.visit(url);
        addtohistory(url);
    }

    void back(){
        if(tabs.isEmpty()){
            System.out.println("No Acitve Tabs....");
            return;
        }

        Tab t=tabs.get(currentTab);
        if(!t.isback()){
            System.out.println("No Tabs to go back...");
            return;
        }
        System.out.println("[Back] Tab"+(currentTab+1)+": Now at "+t.getcurrentpage());
        addtohistory(t.getcurrentpage());
    }
    void front(){
        if(tabs.isEmpty()){
            System.out.println("No Acitve Tabs....");
            return;
        }

        Tab t=tabs.get(currentTab);
        if(!t.isfront()){
            System.out.println("No Tabs to go Forward...");
            return;
        }
        System.out.println("[FWD] Tab"+(currentTab+1)+": Now at "+t.getcurrentpage());
        addtohistory(t.getcurrentpage());
    }

    void printhistory(){
        if(history.isEmpty()){
            System.out.println("No history.....");
            return;
        }

        System.out.println("History:----");
        int i=0;
        for(String a:history){
            System.out.println(i++ + ". "+a);
        }   
    }

    void closeTab(){
        if(tabs.isEmpty()){
            System.out.println("No Acitve Tabs....");
            return;
        }
        System.out.println("[Close] Closing Tab"+(currentTab+1));
        tabs.remove(currentTab);

        if(tabs.isEmpty()){
            currentTab=-1;
            return;
        }

        if(currentTab==tabs.size()){
            currentTab--;
        }
        System.out.println("[Switch] switching Tab"+(currentTab+1)+". Current: "+tabs.get(currentTab).getcurrentpage());
    }


    void switchTab(int index){
        if(index<1 || index>tabs.size()){
            System.out.println("Invalid Tab Index!!!");
            return;
        }

        currentTab=index-1;

        System.out.println("[Switch] switching Tab"+index+". Current: "+tabs.get(currentTab).getcurrentpage());

    }
}
