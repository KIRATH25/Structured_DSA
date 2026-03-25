// Question 3
// Description
// Print the average of every subarray of size k.
// Sample Input
// 5
// 1 3 2 6 4
// 3
// Sample Output
// 2 3.67 4
// Hint
// Divide window sum by k.

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
    System.out.print(((sum*1.0)/k)+" ");
    for(int i=k;i<n;i++){
      sum=sum+arr[i]-arr[i-k];
      double avg=(sum*1.0)/k;
      System.out.print(avg+" ");
    }
  }
}
