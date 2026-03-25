// Question 2
// Description
// Find the minimum sum of any subarray of size k.
// Sample Input
// 5
// 3 7 2 9 1
// 2
// Sample Output
// 9
// Hint
// Slide the window and track the smallest sum.

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
    int minsum=sum;
    for(int i=k;i<n;i++){
      sum=sum+arr[i]-arr[i-k];
      minsum=Math.min(minsum,sum);
    }
    System.out.print(minsum);
  }
}
