package Heaps.implementation;

import java.util.ArrayList;

public class main {
    public static void main(String arg[]){
        int[] ar = {20,14,11,10,8,9,4,5,6,2,3,1};
//        minHeapify(ar);
//        maxHeapify(ar);
        heapSort(ar);
        print(ar);
    }
    public static void minHeapify(int[] a){
        int n = a.length;
        for(int i=n-1;i>=0;i--){
            int ind = i;

            while (ind<n){
                int left = (2*ind)+1;
                int right = (2*ind)+2;
                int mindex=0;
                if(left>=n)break;
                if(left<n){
                    mindex = left;
                }
                if(right<n && a[right]<a[left]){
                    mindex = right;
                }
                if(a[ind]<a[mindex]){
                    break;
                }else{
                    int temp = a[ind];
                    a[ind] = a[mindex];
                    a[mindex] = temp;

                }
                ind = mindex;
            }



        }
    }
    public static void maxHeapify(int[] a){
        int n = a.length;
        for(int i=n-1;i>=0;i--){
            int ind = i;

            while (ind<n){
                int left = (2*ind)+1;
                int right = (2*ind)+2;
                int maxindex=0;
                if(left>=n)break;
                if(left<n){
                    maxindex = left;
                }
                if(right<n && a[right]>a[left]){
                    maxindex = right;
                }
                if(a[ind]>a[maxindex]){
                    break;
                }else{
                    int temp = a[ind];
                    a[ind] = a[maxindex];
                    a[maxindex] = temp;

                }
                ind = maxindex;
            }



        }
    }
    public static void heapSort(int[] a){
        minHeapify(a);
        int n = a.length;
        while (n>1){
            int temp = a[0];
            a[0] = a[n-1];
            a[n-1] = temp;
            n = n-1;
            int ind = 0;
            while (ind<n){
                int left = (2*ind)+1;
                int right = (2*ind)+2;
                int maxindex=0;
                if(left>=n)break;
                if(left<n){
                    maxindex = left;
                }
                if(right<n && a[right]<a[left]){
                    maxindex = right;
                }
                if(a[ind]<a[maxindex]){
                    break;
                }else{
                    int temp1 = a[ind];
                    a[ind] = a[maxindex];
                    a[maxindex] = temp1;

                }
                ind = maxindex;

            }
        }
    }
    public static void print(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }


}
