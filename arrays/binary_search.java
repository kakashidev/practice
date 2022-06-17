// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        return sol(arr,k,0,n-1);
    }
    
    int sol(int arr[], int k, int s, int e){
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid]==k){
                return mid;
            } else if(arr[mid]>k){
                return sol(arr,k,s,mid-1);
            } else{
                return sol(arr,k,mid+1,e);
            }
        }
        return -1;
    }
}