// Question 8
// Description
// Find two numbers whose difference equals a given value.
// Sample Input
// 5
// 1 3 5 8 10
// 2
// Sample Output
// 1 3
// Hint
// Compare absolute difference between elements.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(arr[i] - arr[j]) == target){
                    System.out.print(arr[i]+" "+arr[j]);
                    return;
                }
            }
        }
    }
}
