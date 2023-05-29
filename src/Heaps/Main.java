package Heaps;


import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String arg[]){
        int[] A = {59,64,10,39};
        ArrayList ans = runningMedian(A);
        printList(ans);



    }
    public static ArrayList<Integer> runningMedian(int[] A){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = A.length;
        PriorityQueue<Integer>mxheap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer>mnheap = new PriorityQueue<>();
        mxheap.offer(A[0]);
        ans.add(A[0]);
        for(int i=1;i<n;i++){
            if(mxheap.peek()>A[i]){
                mxheap.offer(A[i]);
            }else{
                mnheap.offer(A[i]);
            }
            if(mxheap.size()< mnheap.size()){
                mxheap.offer(mnheap.poll());

            }else if(mxheap.size()- mnheap.size()>1){
                mnheap.offer(mxheap.poll());
            }

            int  s = mxheap.size()+mnheap.size();
            if(s%2==0){
                int med = mxheap.peek()+ mnheap.peek();
                ans.add(med/2);

            }else{
                ans.add(mxheap.peek());
            }
        }
        return ans;

    }
    public static void printList(ArrayList<Integer>A){
        int n = A.size();
        for(int i=0;i<n;i++){
            System.out.print(A.get(i)+" ");
        }
    }
}
