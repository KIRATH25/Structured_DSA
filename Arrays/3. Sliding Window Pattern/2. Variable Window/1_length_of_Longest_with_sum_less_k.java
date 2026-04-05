// Question 1
// Description
// Find the length of the longest subarray with sum ≤ k.
// Sample Input
// 6
// 1 2 3 4 5 6
// 8
// Sample Output
// 3
// Hint
// Expand window and shrink when sum exceeds k.

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
        int l=0,r=0,sum=0,maxlen=0;
        while(r<n){
            sum+=arr[r];
            while(sum>k){
                sum-=arr[l++];
            }
            if(sum<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        System.out.println(maxlen);
    }
}