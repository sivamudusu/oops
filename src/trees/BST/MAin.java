package trees.BST;

public class MAin {
    public static void main(String[] args){
        tree t1 = new tree(50);
        tree t2 = new tree(30);
        tree t3 = new tree(90);
        tree t4 = new tree(20);
        tree t5 = new tree(40);
        tree t6 = new tree(70);
        tree t7 = new tree(100);
        tree t8 = new tree(10);
        tree t9 = new tree(25);
        tree t10 = new tree(35);
        tree t11 = new tree(45);
        tree t12 = new tree(60);
        tree t13 = new tree(80);
        tree t14 = new tree(90);
        tree t15 = new tree(110);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        t4.left = t8;
        t4.right = t9;
        t5.left = t10;
        t5.right = t11;
        t6.left = t12;
        t6.right = t13;
        t7.left = t14;
        t7.right = t15;

//        System.out.println(isprsent(t1,100));
//
//        System.out.println(maxOnlst(t1.left));
//        System.out.println(minOnrst(t1.right));
//        System.out.println(t1.data);
//        System.out.println(isbst(t1));
        System.out.println(leftLeavesSum(t1,t1));


    }
    public static boolean isprsent(tree root,int k){
        while (root!=null){ // tc here is o(n) and sc = o(1)
            if(root.data==k){
                return true;
            }else if(root.data>k){
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return false;
    }
    public  static int max(tree root){
        if(root==null)return 0;
        int lrmax = Math.max(max(root.left),max(root.right));
        return Math.max(root.data,lrmax);
    }
    public static boolean isbst(tree root){
        int lst = maxOnlst(root.left);
        int rst = minOnrst(root.right);
        if(lst< root.data && root.data<rst){
            return true;
        }
        return false;

    }
    public static int maxOnlst(tree root){
        if(root==null)return 0;
        int lr = Math.max(maxOnlst(root.left),maxOnlst(root.right));
        return Math.max(lr,root.data);
    }
    public static int minOnrst(tree root){
        if(root==null)return Integer.MAX_VALUE;
        int lr = Math.min(minOnrst(root.left),minOnrst(root.right));
        return Math.min(lr,root.data);
    }
    public static int leftLeavesSum(tree root,tree parent){
        if(root==null)return 0;
        if(root == parent.left && root.left == null && root.right == null) return root.data;

        int lst = leftLeavesSum(root.left,root);
        int rst = leftLeavesSum(root.right,root);
        return lst+rst;
    }
}
