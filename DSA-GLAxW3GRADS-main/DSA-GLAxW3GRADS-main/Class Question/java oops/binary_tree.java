import java.util.*;


public class binary_tree {

    class Node{
        int data;
        Node left;
        Node right;


        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    private Node root=null;
    

private static Scanner sc=new Scanner(System.in);

    public Node createtree(){.....}
        int data=sc.nextInt();


        Node node=new node(data);


        int leftchild=sc.nextInt();
        if(leftchild==1){
            node.left=createtree();

        }

        
        int rightchild=sc.nextInt();
        if(rightchild==1){
            node.left=createtree();

        }
        
    }
    
