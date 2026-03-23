// Question 10
// Description
// Find the longest increasing contiguous subarray length.
// Sample Input
// 7
// 1 2 3 1 2 3 4
// Sample Output
// 4
// Hint
// Reset start pointer when sequence breaks.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=1;
        int k=1;
        for(int i = 1; i < n; i++){
            if(arr[i]>arr[i-1]){
                k++;
            }
            else{
                k=1;
            }
        }
        j=Math.max(j,k);
        System.out.print(j);
    }
}
