package trees;

import java.security.KeyPair;
import java.util.*;


public class Main {
    public static void main(String[] args){
        tree t1 = new tree(2);
        tree t2 = new tree(1);
        tree t3 = new tree(4);
        tree t4 = new tree(5);
        tree t5 = new tree(6);
        tree t6 = new tree(7);
        tree t7 = new tree(8);
        tree t8 = new tree(3);
        tree t9 = new tree(9);
        tree t10 = new tree(10);


        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        t4.right = t8;
        t7.left = t9;
        t9.left = t10;

//        int ans = sum(t1);
//        System.out.println("inorder");
//        inorder(t1);
//        System.out.println("preorder");
//        preorder(t1);

//        levelorderline(t1);
//        System.out.println("left view");
//        leftView(t1);
//        verticalorder(t1);
//       int[] in = inord(t1);
//       int[] pre = preord(t1);
//       int[] pos = postord(t1);
//       print(in);
//       System.out.println();
//       print(pre);
//       System.out.println();
//       print(pos);
//       System.out.println();
//
//       System.out.println("inorder  pre order and postorder from arrays...........................");
//
//       tree b = construct(pre,0,pre.length-1,in,0,in.length-1);
//       tree c = constructpost(pos,0,pos.length-1,in,0,in.length-1);
//       inorder(b);
//       System.out.println();
//       preorder(b);
//       System.out.println();
//       postorder(c);
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<Integer> br = new ArrayList<>();
        ispresent(t1,10,ar);
        ispresent(t1,9,br);
        Collections.reverse(ar);
        Collections.reverse(br);
        printList(ar);
        System.out.println();
        printList(br);
        System.out.println();
        System.out.println(printLca(ar,br));






    }
    public  static int sum(tree a){
        if(a==null)return 0;
        int last = sum(a.left);
        int rst = sum(a.right);
        return last+rst+a.data;

    }
    public  static  void inorder(tree a){
        Stack<tree> st = new Stack<>();
        tree temp = a;
        while (!st.isEmpty() ||temp!=null){
            if(temp!=null){
                st.push(temp);
                temp = temp.left;
            }else{
                temp = st.pop();
                System.out.print(temp.data+" ");
                temp = temp.right;

            }
        }
    }
    public static void preorder(tree a){
        Stack<tree> st = new Stack<>();
        tree temp = a;
        while (!st.isEmpty() || temp!=null){
            if(temp!=null){
                st.push(temp);
                System.out.print(temp.data+" ");
                temp = temp.left;
            }else{
                temp = st.pop();
                temp = temp.right;
            }
        }
    }
    public static void postorder(tree a){
        Stack<tree>s = new Stack<>();
        tree current = a;
        while(current!=null || !s.isEmpty()){
            if(current!=null){
                s.push(current);
                current = current.left;
            }else{
                tree temp = s.peek().right;
                if(temp==null){
                    temp = s.pop();
                    System.out.print(temp.data+" ");
                    while(!s.isEmpty() && temp == s.peek().right){
                        temp = s.pop();
                        System.out.print(temp.data+" ");
                    }
                }else{
                    current = temp;
                }

            }
        }


    }
    public static  void levelorderline(tree a){
        Queue<tree> q = new LinkedList<>();
        q.offer(a);
        while (!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                tree temp = q.poll();
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
                System.out.print(temp.data+" ");
            }
            System.out.println();
        }
    }
    public static  void leftView(tree a){
        Queue<tree> q = new LinkedList<>();
        q.offer(a);
        while (!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                tree temp = q.poll();
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
                if(i==0){
                    System.out.print(temp.data);
                }
            }
            System.out.println();
        }
    }
    public static void verticalorder(tree a){
        int maxLevel = 0;
        int minLevel = 0;
        HashMap<Integer,ArrayList<tree>> hm = new HashMap<>();
        Pair pair = new Pair(0,a);
        Queue<Pair> q = new LinkedList<>();
        q.offer(pair);
        while (!q.isEmpty()){
            Pair p = q.peek();
            int level = p.getKey();
            minLevel = Math.min(level,minLevel);
            maxLevel = Math.max(level,maxLevel);
            if(p.getValue().left!=null){

                Pair x = new Pair(level-1,p.getValue().left);
                q.offer(x);

            }
            if(p.getValue().right!=null){

                Pair x = new Pair(level+1,p.getValue().right);
                q.offer(x);

            }
            int x = p.getKey();
            tree y = p.getValue();
            if(hm.containsKey(x)){
                hm.get(x).add(y);
            }else{
                hm.put(x,new ArrayList<>());
                hm.get(x).add(y);
            }
            q.poll();
        }
        for(int i=minLevel;i<=maxLevel;i++){
            int n = hm.get(i).size();
            for(int j=0;j<n;j++){
                System.out.print(hm.get(i).get(j).data+" ");
            }
            System.out.println();
        }



    }
    public static int size(tree a){
        if(a==null) return 0;
        int lst = size(a.left);
        int rst = size(a.right);
        return lst+rst+1;
    }
    public static int[] inord(tree a){
        int n = size(a);
        int[] ans = new int[n];
        int count = 0;
        Stack<tree> st = new Stack<>();
        while (!st.isEmpty() ||a!=null){
            if(a!=null){
                st.push(a);
                a = a.left;
            }else{
                a = st.pop();
                ans[count] = a.data;
                count++;
                a = a.right;
            }
        }
        return ans;
    }
    public static int[] preord(tree a){
        int n = size(a);
        Stack<tree> st = new Stack<>();
        int[] ans = new int[n];
        int count = 0;
        while (!st.isEmpty() || a!=null){
            if(a!=null){
                st.push(a);
                ans[count] = a.data;
                count++;
                a = a.left;
            }else {
                a = st.pop();
                a = a.right;
            }
        }
        return ans;
    }
    public static int[] postord(tree a){
        int n = size(a);
        int[] ans = new int[n];
        tree current = a;
        Stack<tree> s = new Stack<>();
        int count = 0;
        while(current!=null || !s.isEmpty()){
            if(current!=null){
                s.push(current);
                current = current.left;
            }else{
                tree temp = s.peek().right;
                if(temp==null){
                    temp = s.pop();
                    ans[count] = temp.data;
                    count++;
                    while(!s.isEmpty() && temp == s.peek().right){
                        temp = s.pop();
                        ans[count] = temp.data;
                        count++;
                    }
                }else{
                    current = temp;
                }

            }
        }
        return ans;
    }
    public static tree construct(int[]pre,int ps,int pe,int[]in,int ins,int ine){
        if(ps>pe)return null;
        int root = pre[ps];
        int ind = -1;
        for(int i=ins;i<=ine;i++){
            if(in[i]==pre[ps]){
                ind = i;
                break;
            }
        }
        int x = ind-ins;
        tree temp = new tree(root);
        temp.left = construct(pre,ps+1,ps+x,in,ins,ind-1);
        temp.right = construct(pre,ps+x+1,pe,in,ind+1,ine);
        return temp;
    }
    public static tree constructpost(int[]post,int pos,int poe,int[]in,int ins,int ine){
        if(poe<pos)return null;
        int root = post[poe];
        int indx = -1;
        for(int i=ins;i<=ine;i++){
            if(in[i]==post[poe]){
                indx = i;
                break;
            }
        }
        int x = indx-ins;
        tree temp = new tree(root);
        temp.left = constructpost(post,pos,pos+x-1,in,ins,indx-1);
        temp.right = constructpost(post,pos+x,poe-1,in,indx+1,ine);
        return  temp;
    }
    public static void print(int[] a){
        int n = a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void printList(ArrayList<Integer> a){
        int n = a.size();
        for(int i=0;i<n;i++){
            System.out.print(a.get(i)+" ");
        }
    }


    public static boolean ispresent(tree root,int k,ArrayList<Integer> S){
        if(root == null)return false;
        if(root.data == k){
            S.add(root.data);
            return true;
        }

        if(ispresent(root.left,k,S)||ispresent(root.right,k,S)){
            S.add(root.data);
            return true;
        }
        return false;
    }
    public static int printLca(ArrayList<Integer>a,ArrayList<Integer>b){
        int n = a.size();
        int m = b.size();
        int i = 0;
        while(i<Math.min(n,m) && a.get(i) == b.get(i)){
            i++;
        }
        return a.get(i-1);
    }

}
