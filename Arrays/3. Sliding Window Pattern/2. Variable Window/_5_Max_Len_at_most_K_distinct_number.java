// Find the maximum length subarray with at most k distinct numbers.
// Sample Input
// 7
// 1 2 1 2 3 3 4
// 2
// Sample Output
// 4
// Hint
// Use a map to track frequencies.

import java.util.*;

public class _3_longest_with_k_distinct_num {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int k=sc.nextInt();
            HashMap<Integer,Integer> map=new HashMap<>();
            int l=0,maxLen=Integer.MIN_VALUE;
           for(int r = 0; r < n; r++){
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);
            while(map.size() > k){
                map.put(arr[l], map.get(arr[l]) - 1);
                if(map.get(arr[l]) == 0){
                    map.remove(arr[l]);
                }
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }
        System.out.println(maxLen);
        }
}
