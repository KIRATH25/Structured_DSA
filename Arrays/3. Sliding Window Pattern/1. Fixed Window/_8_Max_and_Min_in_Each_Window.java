// Question 8
// Description
// Find the sum of the maximum and minimum elements in each window of size k.
// Sample Input
// 6
// 2 5 -1 7 -3 -1
// 4
// Sample Output
// 6 4 4
// Hint
// Determine max and min for each window.

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

        System.out.print((max + min) + " ");
    }
  }
}
