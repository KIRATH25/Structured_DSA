// Question 7
// Description
// Reverse an array using the two pointer approach.
// Sample Input
// 5
// 1 2 3 4 5
// Sample Output
// 5 4 3 2 1
// Hint
// Swap elements at both pointers then move inward.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = n - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
