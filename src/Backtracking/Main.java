package Backtracking;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 4;

        int[][]A = new int[4][4];

        ArrayList<String> s1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            s1.add(".");
        }
        ArrayList<String> s3 = new ArrayList<>();
        for(int i=0;i<n;i++){
            s3.add(".");
        }
        ArrayList<String> s4 = new ArrayList<>();
        for(int i=0;i<n;i++){
            s4.add(".");
        }
        ArrayList<String> s5 = new ArrayList<>();
        for(int i=0;i<n;i++){
            s5.add(".");
        }



        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ans.add(s1);
        ans.add(s3);
        ans.add(s4);
        ans.add(s5);
        ArrayList<ArrayList<ArrayList<String>>>s2 = new ArrayList<>();

        nQueensList(s2,ans,0,n);

        for(int i=0;i<s2.size();i++){
            printlist(s2.get(i));
        }


        nQueens(A,4,0);

    }
//    placing n queens in n*n matrix
    public static void nQueens(int[][]A,int n,int i){
        if(i==n){
            print(A);
            System.out.println(" ");
            return;

        }

        for(int j=0;j<n;j++){
            if(isValid(A,i,j,n)){
                A[i][j] = 1;
                nQueens(A,n,i+1);
                A[i][j] = 0;
            }
        }
    }
    public static void nQueensList(ArrayList<ArrayList<ArrayList<String>>>A,ArrayList<ArrayList<String>>B,int x,int n){
        if(x==n){
            A.add(B);
            return;
        }

        for(int i=0;i<n;i++){
            if(isValidList(B,x,i,n)){
                B.get(x).set(i,"Q");
                nQueensList(A,B,x+1,n);
                B.get(x).set(i,".");
            }
        }
    }
    public static boolean isValid(int[][]A,int i,int j,int n){

        int k = i;
        int l = j;
        while(k>=0 && l>=0){
            if(A[k][l]==1)return false;
            k--;
            l--;
        }
        k = i;
        l = j;
        while(k>=0 && l<n){
            if(A[k][l]==1)return false;
            k--;
            l++;
        }
        k = i;
        l = j;
        while (k>=0){
            if(A[k][l]==1)return false;
            k--;
        }
        return true;
    }
    public static void print(int[][]A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printlist(ArrayList<ArrayList<String>>A){
        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.get(0).size();j++){
                System.out.print(A.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static boolean isValidList(ArrayList<ArrayList<String>>A,int x,int y,int n){
        int i = x;
        int j = y;
        while(i>=0 && j>=0){
            if(A.get(i).get(j).equals("Q"))return false;
            i--;
            j--;
        }
        i =x;
        j = y;
        while(i>=0 && j<n ){
            if(A.get(i).get(j).equals("Q"))return false;
            i--;
            j++;
        }
        i= x;
        j = y;
        while(i>=0){
            if(A.get(i).get(j).equals("Q"))return false;
            i--;

        }
        return true;
    }
}
