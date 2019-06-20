import java.util.ArrayList;

class Node{
    int value;
    Node left, right;
    public Node(int value){
        this.value = value;
        left = right = null;
    }

    @Override
    public String toString(){
        return "Node value: " + this.value;
    }
  
  public Node getLeft(){
    return this.left;
  }

  public Node getRight(){
    return this.right;
  }
}


public class BstTree{
    Node root;

    BinarySearchTree(){
        root = null;
    }
  
    public Node getRoot(){
      return root;
    }

    void insert(int value){
      root = recursiveInsertion(root, value);
    }
    Node recursiveInsertion(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(root.value > value){
            root.left = recursiveInsertion(root.left, value);
        }else if(root.value < value){
            root.right = recursiveInsertion(root.right, value);
        }
        return root;
    }
    Node search(int value){
        return recursiveSearch(root, value);
    }
    Node recursiveSearch(Node root, int value){
        if(root == null || root.value == value){
            return root;
        }

        if(root.value > value){
            return recursiveSearch(root.left, value);
        }
        return recursiveSearch(root.right, value);
    }
  
  
  public static void main(String[]  args){
        BstTree bst = new BstTree();
    	bst.insert(10);
    	bst.insert(9);
    	bst.insert(11);
    
    	System.out.println(bst.getRoot().toString());
    	System.out.println(bst.getRoot().getLeft().toString());
        System.out.println(bst.getRoot().getRight().toString());
        System.out.println("----------------------------");
        System.out.println(bst.search(10).toString());
        System.out.println(bst.search(11).toString());
        System.out.println(bst.search(9).toString());
  }
}