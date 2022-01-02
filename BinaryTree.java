

public class BinaryTree {
    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private  int data;
        private TreeNode(int data){
            this.data=data;
        }
    }
    public void createNode(){
        TreeNode first=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(3);
        TreeNode four=new TreeNode(4);
        TreeNode five=new TreeNode(5);

        root=first;
        first.left=second;
        first.right=third;
        second.left=four;
        second.right=five;
    }
    public void Inorder(TreeNode root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);
    }
    public void Postorder(TreeNode root){
        if(root==null) return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.println(root.data);
    }
    public void Preorder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        Preorder(root.left);
        Preorder(root.right);
    }
    public void Searchkey(TreeNode root,int key){
        if(root==null || root.data==key){
            return;
        }
        if(key<root.data){
            return(root.left,key);
        }
        else {
            return(root.right,key);
        }
    }
    public static void main(String[] args) {
BinaryTree bt=new BinaryTree();
bt.createNode();
//bt.Inorder(bt.root);
//bt.Postorder(bt.root);
        bt.Preorder(bt.root);
        bt.Searchkey(bt.root);
    }

}

