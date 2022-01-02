

public class BinarySearchTree {
    private TreeNode root;
    private class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data){
            this.data=data;
        }
    }
    public void insert(int value){
        root=insert(root, value);
    }
    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
return root;
    }
    public void inorder(){
        inorder(root);
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public  TreeNode search(int key){
        return search(root,key);
    }
public TreeNode search(TreeNode root, int key) {
    if (root == null || root.data == key) {
        return root;
    }
if (key<root.data){
    return search(root.left,key);
}else {
    return search(root.right, key);
}
}
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);

        bst.inorder();
        System.out.println();
        if(null!=bst.search(3)){
            System.out.println("key found!!");
        }else{
            System.out.println("key not found");
        }
    }




}
