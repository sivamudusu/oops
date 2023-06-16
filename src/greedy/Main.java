package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[][] mat = {
                { 39, 27, 11, 42 },
                { 10, 93, 91, 90 },
                { 54, 78, 56, 89 },
                { 24, 64, 20, 65 }
        };
        int[] A = {5, 1, 3, 0, 5, 8};



        int [] B = {9, 2, 4, 6, 7, 9};
        int n = A.length;

        int [] indices = new int[n];
        for(int i=0; i<n; i++){
            indices[i] = i;
        }

        sortbycol(mat,2);
        print(mat);
        System.out.println(" ............");



        printArr(A);
        System.out.println();
        printArr(B);


    }
    public static void sortbycol(int[][]A,int col){
        Arrays.sort(A,(a,b)->Integer.compare(a[col],b[col]));
    }
    public static void print(int[][]A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printArr(int[]A){
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
}
