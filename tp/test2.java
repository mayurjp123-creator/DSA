package tp;
import java.util.*;
class E_Node
{
    String name;
    int eid;

    double salary;
    String gender;
    E_Node next;
    E_Node(int id,String name,  double salary, String gender)
    {
        this.eid=id;
        this.name = name;
        this.gender=gender;
        this.salary = salary;
        this.next=null;
    }

    void print()
    {
        System.out.println("\nID: " + eid + "\tName: "+name+"\tGender: "+gender+ "\tSalary: " + salary);
    }

}


public class test2
{
    static LinkedList<E_Node> list = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    static void register()
    {
        System.out.println("Enter ID: ");
        int id=sc.nextInt();
        System.out.println("Enter Name: ");
        String name = sc.next();
        System.out.println("Enter Gender: ");
        String gender = sc.next();
        System.out.println("Enter Salary: ");
        double salary = sc.nextInt();
        list.add(new E_Node(id,name,salary,gender));
        System.out.println("Employee added.");
    }
    static void delete(int id)
    {
        list.remove(id);
    }
    static void Display()
    {
        for(E_Node e:list)
        {
            e.print();

        }
    }
    static void search(int id)
    {
        boolean found = false;
        for(E_Node e:list)
        {
            if(e.eid==id)
            {
                e.print();
                found = true;
                break;
            }

        }
        if(!found)
        {
            System.out.println("Employee with id: " + id + " not found");
        }

    }
    static void update(int id)
    {
        boolean found = false;
        E_Node copy;
        for(E_Node e:list)
        {
            if(e.eid == id)
            {
                System.out.println("Enter name: ");
                String name = sc.next();
                System.out.println("Enter Salary: ");
                double salary = sc.nextInt();
                System.out.println("Enter Gender: ");
                String gender = sc.next();
                System.out.println("Employee updated.");
                copy=new E_Node(e.eid, name, salary, gender);
                list.remove(e);
                list.add(copy);
                found = true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Employee with id: " + id + " not found");
        }

    }
    public static void main(String args[])
    {

        int choice;
        do {
            System.out.println("-----------------------------------");
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("0. Exit");
            System.out.println("-----------------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1: register();
                        break;
                case 2: Display();
                        break;
                case 3:
                    System.out.println("Enter id to search: ");
                    int id = sc.nextInt();
                     search(id);
                    break;
                case 4:
                    System.out.println("Enter id to update: ");
                    int uid = sc.nextInt();
                     update(uid);
                    break;
                case 5:
                    System.out.println("Enter id to delete: ");
                    int did = sc.nextInt();
                    delete(did);
                    break;
                case 0:
                    System.out.println("Thank you for using the code");
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        }while(choice!=0);



    }
}