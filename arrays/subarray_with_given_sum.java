// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int f=0;
        int e=0;
        int sum=arr[0];
        while(e<n){
            if(sum==s){
                ans.add(f+1);
                ans.add(e+1);
                return ans;
            }
            if(sum<s){
                e++;
                if(e==n){
                    ans.add(-1);
                    return ans;
                }
                sum+=arr[e];
            } else{
                sum-=arr[f];
                f++;
                if(f>e){
                    e++;
                    if(f==n){
                        ans.add(-1);
                        return ans;
                    }
                    sum+=arr[f];
                }
            }
        }
        ans.add(-1);
        return ans;
    }
}