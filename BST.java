public class BST {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(8);
        bst.insert(3);
        bst.insert(7);
        bst.insert(12);
        bst.insert(18);
        System.out.println("Inorder Traversal : ");
        bst.inorder();
        System.out.println();
        System.out.println("Preorder Traversal : ");
        bst.preorder();
        System.out.println();
        System.out.println("Postorder Traversal : ");
        bst.postorder();
    }    
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int n){
        this.data = n;
    }
}
class BinarySearchTree{
    Node root;
    public void insert(int n){
            root = insertRec(root, n);
        }
        public Node insertRec(Node root,int n){
            if(root == null)
        root = new Node(n);
        else if(n<root.data){
            root.left = insertRec(root.left,n);
        }
        else if(n>root.data){
            root.right = insertRec(root.right,n);
        }
        return root;
    }
    public void inorder(){
       inorderRec(root);
    }
    private void inorderRec(Node root) {
        if(root != null){
         inorderRec(root.left);
         System.out.print(root.data + " ");
         inorderRec(root.right);  
        }
        
    }
    public void preorder(){
       preorderRec(root);
    }
    private void preorderRec(Node root) {
        if(root != null){
         System.out.print(root.data + " ");
         preorderRec(root.left);
         preorderRec(root.right);   
        }
       
    }
    public void postorder(){
       postorderRec(root);
    }
    private void postorderRec(Node root) {
        if(root != null){
         postorderRec(root.left);
          postorderRec(root.right);
         System.out.print(root.data + " ");
        }
        
    }
}

