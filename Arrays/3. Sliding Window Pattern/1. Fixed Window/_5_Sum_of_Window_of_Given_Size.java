// Question 5
// Description
// Find the maximum element in each window of size k.
// Sample Input
// 7
// 1 3 1 2 0 5 4
// 3
// Sample Output
// 3 3 2 5 5
// Hint
// Track max element in each window.

import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0; i<n;i++){
      arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    for(int i = 0; i <= n - k; i++){
      int max = arr[i];
      for(int j = i; j < i + k; j++){
        max = Math.max(max, arr[j]);
      }
      System.out.print(max + " ");
    }
  }
}
