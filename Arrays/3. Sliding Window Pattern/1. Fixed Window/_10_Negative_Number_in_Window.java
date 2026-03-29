// Question 10
// Description
// Find how many windows of size k contain at least one negative numbe.
// Sample Input
// 6
// 2 -3 4 5 -1 6
// 3
// Sample Output
// 4
// Hint
// Check presence of negative numbers in each window.

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
    int count = 0;
    for(int i = 0; i <= n - k; i++){
        boolean hasNegative = false;
        for(int j = i; j < i + k; j++){
            if(arr[j] < 0){
                hasNegative = true;
                break;
            }
        }
        if(hasNegative){
            count++;
        }
    }
    System.out.print(count);
  }
}
