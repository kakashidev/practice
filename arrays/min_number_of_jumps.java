// { Driver Code Starts
    import java.lang.*;
    import java.io.*;
    import java.util.*;
    class GFG
     {
        public static void main (String[] args) throws IOException
         {
         
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            int t = Integer.parseInt(br.readLine()); 
    
            while(t-- > 0){
                int size = Integer.parseInt(br.readLine());
                String[] arrStr = ((String)br.readLine()).split("\\s+");
                int[] arr= new int[size];
                for(int i = 0;i<size;i++){
                    arr[i] = Integer.parseInt(arrStr[i]);
                }
                System.out.println(new Solution().minJumps(arr));
            }
         }
         
    }
    // } Driver Code Ends
    
    
    class Solution{
        static int minJumps(int[] arr){
            // your code here
            int currPos = 0;
            int maxidx = 0;
            int jumps = 0;
            int n=arr.length;
            for(int i=0;i<n-1;i++){
                maxidx = Math.max(maxidx, arr[i]+i);
                if(i==currPos){
                    currPos = maxidx;
                    jumps++;
                }
                if(arr[i]==0 && i==maxidx){
                    return -1;
                }
            }
            return jumps;
        }
    }