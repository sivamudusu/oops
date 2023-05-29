package stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args){
//        Stacks st = new Stacks();
//        System.out.println(st.isEmpty());
//        st.push(10);
//        st.push(20);
//        st.push(30);
//        st.push(40);
//        System.out.println(st.peek());
//        System.out.println(st.pop());
//        System.out.println(st.peek());
//        System.out.println(Long.MIN_VALUE);
//        st.push(50);
//        st.push(60);
//        st.push(70);
//        st.push(80);
//        st.push(90);
//        st.push(100);
//        st.push(110);
//        st.push(120);
//        System.out.println(st.peek());
//        System.out.println(st.isFull());
        int[] input = {5,2,8,10,6,1};

        int[] ans = leftmin(input);
        int[] ans2 = leftminIndex(input);
        int []rmn = rightMin(input);
        printArray(ans);
        System.out.println();
        printArray(ans2);
        System.out.println("right min element");
        printArray(rmn);

    }
    public static  int[] leftmin(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= a[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                ans[i] = st.peek();
            } else {
                ans[i] = -1;
            }
            st.push(a[i]);
        }
        return ans;

    }
    public static  int[] leftminIndex(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && a[st.peek()] >= a[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                ans[i] = st.peek();
            } else {
                ans[i] = -1;
            }
            st.push(i);
        }
        return ans;

    }
    public static  int[] rightMin(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n-1; i >=0 ; i--) {
            while (!st.isEmpty() && st.peek() >= a[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                ans[i] = st.peek();
            } else {
                ans[i] = -1;
            }
            st.push(a[i]);
        }
        return ans;

    }
    public  static void printArray(int [] a){
        int  n = a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
