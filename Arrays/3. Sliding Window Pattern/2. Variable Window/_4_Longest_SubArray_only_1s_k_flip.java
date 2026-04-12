// Find the longest subarray containing only 1s if you can flip at most k zero
// Sample Input
// 7
// 1 1 0 0 1 1 1
// 1
// Sample Output
// 4
// Hint
// Track number of zeros in the window.

import java.util.Scanner;

public class _2_max_1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int left = 0, zeros = 0, maxLen = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (arr[left] == 0) {
                    zeros--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        System.out.println(maxLen);
    }
}
