//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            // int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[0]);

            String line = br.readLine();
            String[] tokens = line.split(" ");
            int[] arr = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            boolean ans = new Solution().twoSum(arr, x);
            System.out.println(ans ? "true" : "false");
            // System.out.println("~");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
         // Time complexity=O(nlogn);
         int n = arr.length;
        // Arrays.sort(arr);
        // int low=0;
        // int high=n-1;
        // while(low<high){
        //     int sum=arr[low]+arr[high];
        //     if(sum==target){
        //         return true;
        //     }else if(sum>target){
        //         high--;
        //     }else{
        //         low++;
        //     }
        // }
        // return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < n ; i++){
            map.put(arr[i],i);
        }
        
        for(int i = 0 ; i < n ;i++ ){
           int completed = target - arr[i];
           
           if(map.containsKey(completed) && map.get(completed) != i){
               return true;
           }
        }
        return false;
    }
}