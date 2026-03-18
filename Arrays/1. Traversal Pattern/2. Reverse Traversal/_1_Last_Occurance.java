// Question 2
// Description
// Find the last occurrence of a given number in the array.
// Sample Input
// 7
// 1 3 5 3 7 3 9
// 3
// Sample Output
// 5
// Hint
// Traverse from the end.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=n-1;i>=0;i--){
            if(arr[i]==k){
                System.out.println(i);
                break;
            }
        }
    }
}