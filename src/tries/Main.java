package tries;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;

public class Main {
    public static void main(String arg[]){
        String[] inp = {"zebra","dog","duck","dove"};
        trieNode root = new trieNode();
        String[] A = {"hack","hacker","hac","hak"};
        int[] B = {0,0,1,1};

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<A.length;i++){
            String s = A[i];
            if(B[i]==0){
                insert(root,s);
            }else{
                int reult = check(root,s);
                ans.add(reult);
            }
        }
        printlist(ans);
//        for(int i=0;i<inp.length;i++){
//            String s = inp[i];
//            insert(root,s);
//        }
//        for(int i=0;i<inp.length;i++){
//            String s = inp[i];
//            export(root,s,ans);
//        }
//        printlist(ans);


    }
    public static void insert(trieNode root,String s){
        trieNode temp = root;
        int l = s.length();
        for(int i=0;i<l;i++){
            char ind = s.charAt(i);
            if(!temp.child.containsKey(ind)) temp.child.put(ind,new trieNode());

            temp = temp.child.get(ind);
            temp.pfcount++;
        }
        temp.isEnd = 1;
    }
    public static int check(trieNode root,String s){
        trieNode temp = root;
        int l = s.length();
        for(int i=0;i<l;i++){
            char ind  = s.charAt(i);
            if(!temp.child.containsKey(ind)){
                return 0;
            }
            temp = temp.child.get(ind);
        }
        return temp.pfcount;

    }
    public static void export(trieNode root,String s,ArrayList<String> ans){
        StringBuilder sb = new StringBuilder();
        trieNode temp = root.child.get(s.charAt(0));
        int i = 0;
        while(temp.pfcount>1){
            if(temp.pfcount>1){
                sb.append(s.charAt(i));
                i++;
            }
            temp = temp.child.get(s.charAt(i));
        }
        sb.append(s.charAt(i));
        String s1 = sb.toString();
        ans.add(s1);
    }
    public static  void printlist(ArrayList<Integer>A){
        int n =A.size();
        for(int i=0;i<n;i++){
            System.out.print(A.get(i)+" ");
        }
    }
}
