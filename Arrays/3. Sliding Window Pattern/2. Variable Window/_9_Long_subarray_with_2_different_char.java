// Question 9
// Description
// Find the longest subarray with at most two distinct elements.
// Sample Input
// 8
// 1 2 1 3 4 3 5 1
// Sample Output
// 3
// Hint
// Shrink window when distinct elements exceed two.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0, maxLen = 0;
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
