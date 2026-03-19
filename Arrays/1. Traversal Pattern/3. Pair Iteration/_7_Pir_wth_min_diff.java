// Question 7
// Description
// Find the pair with minimum difference.
// Sample Input

// 4
// 10 22 15 18
// Sample Output
// 15 18
// Hint
// Track minimum absolute difference.

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int a = 0, b = 0;
        for(int i = 0; i < n - 1; i++){
            int diff = arr[i + 1] - arr[i];
            if(diff < minDiff){
                minDiff = diff;
                a = arr[i];
                b = arr[i + 1];
            }
        }
        System.out.println(a + " " + b);
    }
}
