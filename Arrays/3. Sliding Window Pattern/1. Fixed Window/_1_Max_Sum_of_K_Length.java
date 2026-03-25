// Question 1
// Description
// Find the maximum sum of a subarray of size k.
// Sample Input
// 6
// 2 1 5 1 3 2
// 3
// Sample Output
// 9
// Hint
// Compute the first window sum, then subtract the outgoing element and add the incoming one.

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
    int sum=0;
    for(int i=0;i<k;i++){
      sum+=arr[i];
    }
    int maxsum=sum;
    for(int i=k;i<n;i++){
      sum=sum+arr[i]-arr[i-k];
      maxsum=Math.max(maxsum,sum);
    }
    System.out.print(maxsum);
  }
}
