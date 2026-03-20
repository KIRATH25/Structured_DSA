// Question 10
// Description
// Find the closest pair whose sum is nearest to the target.
// Sample Input
// 5
// 1 4 6 8 10
// 13
// Sample Output
// 4 8
// Hint
// Track minimum difference between target and current sum.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left = 0;
        int right = n - 1;
        int minDiff = Integer.MAX_VALUE;
        int ansL = 0, ansR = 0;
        while(left < right){
            int sum = arr[left] + arr[right];
            int diff = Math.abs(target - sum);
            if(diff < minDiff){
                minDiff = diff;
                ansL = left;
                ansR = right;
            }
            if(sum < target){
                left++;
            } else {
                right--;
            }
        }
        System.out.print(arr[ansL] + " " + arr[ansR]);
    }
}
