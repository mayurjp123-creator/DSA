package Tree;
class TNode{
    int data;
    TNode right;
    TNode left;
    TNode(int data){
        this.data=data;
        right=null;
        left=null;
    }
}
public class BST {
    static TNode root;

    static void insert_node(TNode r,TNode n){
        if(root==null){
            root=n;
        }
        else{
            if(n.data<r.data){
                if(r.left==null){
                    r.left=n;
                    System.out.println("\n"+n.data+" insterted");
                }
                else
                    insert_node(r.left, n);
            }
            else{
                if(r.right==null){
                    r.right=n;
                    System.out.println("\n"+n.data+" insterted");
                }
                else
                    insert_node(r.right, n);
            }
        }
    }
    static void inorder(TNode r){
        if(r!=null){
            inorder(r.left);
            System.out.println(r.data);
            inorder(r.right);
        }
    }
    static void postorder(TNode r){
        if(r!=null){
            postorder(r.left);
            postorder(r.right);
            System.out.println(r.data);

        }
    }
    static void preorder(TNode r){
        if(r!=null){
            System.out.println(r.data);
            preorder(r.left);
            preorder(r.right);

        }
    }

    static int count_nodes(TNode r){
        if(r==null)
            return 0;
        return 1+count_nodes(r.left)+count_nodes(r.right);
    }
    static int count_leaf(TNode r){
        if(r==null){
            return 0;
        }
        else if(r!=null && r.right==null && r.left==null){
            return 1;
        }
        return count_leaf(r.right)+count_leaf(r.left);
    }
    static int sumofelements(TNode r){
        if(r==null)
            return 0;
        return r.data+sumofelements(r.left)+sumofelements(r.right);

    }
    static TNode get_node(){
        return root;
    }


    public static void main(String[] args) {
        insert_node(get_node(), new TNode(10));
        insert_node(get_node(), new TNode(5));
        insert_node(get_node(), new TNode(20));
        insert_node(get_node(), new TNode(15));
        insert_node(get_node(), new TNode(25));

        System.out.print("\nInorder: ");
        inorder(get_node());

        System.out.print("\nPreorder: ");
        preorder(get_node());

        System.out.print("\nPostorder: ");
        postorder(get_node());

        System.out.println("\nTotal nodes: " + count_nodes(get_node()));
        System.out.println("Leaf nodes: " + count_leaf(get_node()));
        System.out.println("Sum of Tree node is:" + sumofelements(get_node()));
    }
    
}
/*
public class BST_using_DLL
{
    static TNode root;


    static void insert_node(TNode r, TNode n)
    {
        // Case 1: First ever node → make root
        if (r == null)
        {
            root = n;
            System.out.println(n.data + " inserted");
            return;
        }

        // Case 2: Insert in left subtree
        if (n.data < r.data)
        {
            if (r.left == null)
            {
                r.left = n;
                System.out.println(n.data + " inserted");
            }
            else
            {
                insert_node(r.left, n);
            }
        }
        // Case 3: Insert in right subtree
        else if (n.data > r.data)
        {
            if (r.right == null)
            {
                r.right = n;
                System.out.println(n.data + " inserted");
            }
            else
            {
                insert_node(r.right, n);
            }
        }
    }


    static void inorder(TNode r)
    {
        if (r != null)
        {
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }
    }


    static void preorder(TNode r)
    {
        if (r != null)
        {
            System.out.print(r.data + " ");
            preorder(r.left);
            preorder(r.right);
        }
    }


    static void postorder(TNode r)
    {
        if (r != null)
        {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + " ");
        }
    }




    static int count_nodes(TNode r)
    {
        if (r == null)
            return 0;

        return 1 + count_nodes(r.left) + count_nodes(r.right);
    }


    static int count_leaf_nodes(TNode r)
    {
        if (r == null)
            return 0;



        if (r.left == null && r.right == null)
            return 1;

        return count_leaf_nodes(r.left) + count_leaf_nodes(r.right);

    }
    static int sum_of_element(TNode r)
    {
        if(r==null)
        {
            return 0;
        }
        return r.data + sum_of_element(r.left) + sum_of_element(r.right);
    }

    static TNode get_node()
    {
        return root;
    }



    public static void main()
    {
        insert_node(get_node(), new TNode(10));
        insert_node(get_node(), new TNode(5));
        insert_node(get_node(), new TNode(20));
        insert_node(get_node(), new TNode(15));
        insert_node(get_node(), new TNode(25));

        System.out.print("\nInorder: ");
        inorder(get_node());

        System.out.print("\nPreorder: ");
        preorder(get_node());

        System.out.print("\nPostorder: ");
        postorder(get_node());

        System.out.println("\nTotal nodes: " + count_nodes(get_node()));
        System.out.println("Leaf nodes: " + count_leaf_nodes(get_node()));
        System.out.println("Sum of Tree node is:" + sum_of_element(get_node()));
    }
} */