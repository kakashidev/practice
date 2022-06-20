// { Driver Code Starts
    import java.io.*;
    import java.util.*;
    class GFG
    {
        public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                int r = sc.nextInt();
                int c = sc.nextInt();
                
                int matrix[][] = new int[r][c];
                
                for(int i = 0; i < r; i++)
                {
                    for(int j = 0; j < c; j++)
                     matrix[i][j] = sc.nextInt();
                }
                Solution ob = new Solution();
                ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
                for (Integer val: ans) 
                    System.out.print(val+" "); 
                System.out.println();
            }
        }
    }// } Driver Code Ends
    
    
    class Solution
    {
        //Function to return a list of integers denoting spiral traversal of matrix.
        static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
        {
            // code here 
            ArrayList<Integer> result = new ArrayList<>();
            int left=0;
            int right = c-1;
            int up = 0;
            int down = r-1;
            int rotations = Math.min(r,c);
            for(int i=0;i<(rotations+1)/2;i++){
                if(up>down)
                    return result;
                for(int j=left;j<=right;j++){
                    result.add(matrix[up][j]);
                }
                up++;
                if(left>right)
                    return result;
                for(int j=up;j<=down;j++){
                    result.add(matrix[j][right]);
                }
                right--;
                if(up>down)
                    return result;
                for(int j=right;j>=left;j--){
                    result.add(matrix[down][j]);
                }
                down--;
                if(left>right)
                    return result;
                for(int j=down;j>=up;j--){
                    result.add(matrix[j][left]);
                }
                left++;
            }
            return result;
        }
    }
    