// Question 11
// Description
// Find the difference between max and min element in each window of size k.
// Sample Input
// 5
// 4 2 7 3 9
// 3
// Sample Output
// 5 5 6
// Hint
// Compute max and min in each window.

import java.util.*;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    for(int i = 0; i <= n - k; i++){
        int max = arr[i];
        int min = arr[i];
        for(int j = i; j < i + k; j++){
            if(arr[j] > max){
                max = arr[j];
            }
            if(arr[j] < min){
                min = arr[j];
            }
        }
        System.out.print((max - min) + " ");
    }
  }
}
