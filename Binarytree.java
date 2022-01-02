import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Binarytree {
    private TreeNode root;
    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }
public void createBinaryatree(){
    TreeNode first=new TreeNode(1);
    TreeNode second=new TreeNode(10);
    TreeNode third=new TreeNode(15);
    TreeNode fourth=new TreeNode(11);
    TreeNode fifth=new TreeNode(18);

    root=first;
    first.left=second;
    first.right=third;
second.left=fourth;


}
public void preorder(TreeNode root) {
    if (root == null) {
        return;
    }

    System.out.println(root.data + "");
    preorder(root.left);
    preorder(root.right);
}
public void Iterativepreorder(){
        if(root==null){
            return;
        }
    Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp=stack.pop();
            System.out.println(temp.data+"");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if (temp.left!=null){
                stack.push(temp.left);
            }
        }
}
public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
    System.out.println(root.data+" ");
    inorder(root.right);
}
public void iteratveinorder(){
        if(root==null){
            return;
        }
        Stack<TreeNode>stack=new Stack<>();
        TreeNode temp=root;
        while (!stack.isEmpty()||temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp= temp.left;
            }
            else {
                temp=stack.pop();
                System.out.println(temp.data+" ");
                temp=temp.right;
            }
        }
}
public void levelOrder(){
        if(root==null){
            return;
        }
    Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            TreeNode temp=q.poll();
            System.out.println(temp.data+" ");
            if (temp.left!=null){
                q.offer(temp.left);
            }
            if (temp.right!=null){
                q.offer(temp.right);
            }
        }
}
/*public int findMax() {
    if (root == null) {
        return findMax(root);
    }
}
public
        int result=root.data;
        int left=findMax(root.left);
        int right=findMax(root.right);
        if(left>result){
            result=left;
        }
        if(right>result){
            result=right;
        }
        return result;
}*/


    public static void main(String[] args) {
Binarytree bt=new Binarytree();
bt.createBinaryatree();
//bt.preorder(bt.root);
//bt.Iterativepreorder();
//bt.inorder(bt.root);
//bt.iteratveinorder();
bt.levelOrder();
//bt.findMax();
    }
}