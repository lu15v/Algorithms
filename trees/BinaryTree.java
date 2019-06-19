/*
*
*
* BASIC IMPLEMENTATION OF A BT
*
*
*/

class Node{
    int value;
    Node left, right;
    public Node(int value){
        this.value = value;
        left = right = null;
    }

    public void setLeft(int value){
        this.left = new Node(value);
    }
    public void setRight(int value){
        this.right = new Node(value);
    }

    public Node getLeft(){
        return this.left;
    }
    public Node getRight(){
        return this.right;
    }
  
    public int getValue(){
		return this.value;
    }
    
    @Override
    public String toString(){
        return "Node value: " + this.value;
    }

}

class BinaryTree{
    Node root;

    public BinaryTree(int value){
        root = new Node(value);
    }
    public Node getRoot(){
        return root;
    }
  
  public String printTree(Node node){
    String print = "";
     
    if(node == null){
     	return print;
    }else{
     	System.out.println(node.getValue());
     	print += node.getValue();
      	return printTree(node.getLeft()) + printTree(node.getRight());
    }
  }


}

public class Main{
  public static void main(String[] args){
    BinaryTree bt = new BinaryTree(1);
    bt.getRoot().setLeft(2);
    bt.getRoot().setRight(4);
    bt.getRoot().getLeft().setRight(3);
    
    
    System.out.println(bt.printTree(bt.getRoot()));
  }
}

