// Question 2
// Description
// Find and print the pair of numbers whose sum equals the target in a sorted array.
// Sample Input
// 5
// 2 4 6 8 10
// 12
// Sample Output
// 2 10
// Hint
// If sum is greater than target move the right pointer left.

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
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println(arr[left] + " " + arr[right]);
                return;
            }
            else if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }
        System.out.println("No pair found");
    }
}
