// Question 9
// Description
// Find the subarray of size k with the highest product.
// Sample Input
// 5
// 1 2 3 4 5
// 2
// Sample Output
// 20
// Hint
// Multiply numbers in the window and update product when sliding.

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
    int maxProduct = Integer.MIN_VALUE;
    for(int i = 0; i <= n - k; i++){
        int product = 1;
        for(int j = i; j < i + k; j++){
            product *= arr[j];
        }
        maxProduct = Math.max(maxProduct, product);
    }
    System.out.print(maxProduct);
  }
}
