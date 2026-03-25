// Question 4
// Description
// Count how many subarrays of size k have sum greater than a given value.
// Sample Input
// 6
// 1 4 2 10 3 1
// 3
// 10
// Sample Output
// 3
// Hint
// Check window sum after each slide.

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
    int value=sc.nextInt();
    int sum=0;
    int count=0;
    for(int i=0;i<k;i++){
      sum+=arr[i];
    }
    for(int i=k;i<n;i++){
      sum=sum+arr[i]-arr[i-k];
      if(sum>=value){
          count++;
      }
    }
    System.out.print(count);
  }
}
