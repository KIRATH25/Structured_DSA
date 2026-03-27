// Question 7
// Description
// Count the number of even numbers in every window of size k.
// Sample Input
// 6
// 1 2 4 5 6 8
// 3
// Sample Output
// 2 2 2 2
// Hint
// Increment when adding a new even number and decrement when removing one.

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
        int count = 0;
        for(int j = i; j < i + k; j++){
            if(arr[j] % 2 == 0){
                count++;
            }
        }
        System.out.print(count + " ");
    }
  }
}
