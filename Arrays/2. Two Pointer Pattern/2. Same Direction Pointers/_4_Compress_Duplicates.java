// Question 4
// Description
// Compress the array by removing consecutive duplicates.
// Sample Input
// 7
// 1 1 1 2 2 3 3
// Sample Output
// 1 2 3
// Hint
// Check current and previous elements.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        if(n == 0) return;
        int j = 0;
        for(int i = 1; i < n; i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        for(int i=0;i<=j;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
