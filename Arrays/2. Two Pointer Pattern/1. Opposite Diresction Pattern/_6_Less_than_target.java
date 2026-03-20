// Question 6
// Description
// Find the maximum pair sum less than or equal to target.
// Sample Input
// 5
// 2 3 5 8 9
// 10
// Sample Output
// 10
// Hint
// Adjust pointers depending on sum.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int maxSum=-1;
        int target = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int sum=arr[i]+arr[j];
                
                if(sum<=target){
                    maxSum=Math.max(maxSum,sum);
                }
            }
        }
        System.out.print(maxSum);
    }
}
