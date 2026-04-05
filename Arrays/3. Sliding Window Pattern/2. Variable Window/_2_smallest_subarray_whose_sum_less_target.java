// Question 2
// Description
// Find the smallest subarray whose sum ≥ target.
// Sample Input
// 6
// 2 3 1 2 4 3
// 7
// Sample Output
// 2
// Hint
// Shrink window once sum reaches target.

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int l=0,r=0,minlen=Integer.MAX_VALUE,sum=0;
         while(r<n){
            sum+=arr[r];
            while(sum>=k){
                minlen=Math.min(minlen,r-l+1);
                sum-=arr[l++];
            }
            r++;
        }
        System.out.println(minlen);
    }
}
