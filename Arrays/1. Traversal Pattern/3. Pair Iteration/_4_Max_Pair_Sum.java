// Question 4
// Description
// Find the maximum pair sum.
// Sample Input
// 4
// 5 1 7 3
// Sample Output
// 12
// Hint
// Check sum of every pair.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max1=0;
        int max2=0;
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max1){
              max2=max1;
              max1=arr[i];
            }else if(arr[i]>max2){
              max2=arr[i];
            }
        }
        sum=max1+max2;
        System.out.print(sum);
    }
}
