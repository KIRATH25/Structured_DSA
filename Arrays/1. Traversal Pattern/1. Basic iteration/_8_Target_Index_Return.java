// Question 8

// Description
// Find the index of a given element in the array.
// Sample Input
// 5
// 10 20 30 40 50
// 30
// Sample Output
// 2
// Hint
// Compare each element with target.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.print(i);    
            }
        }
    }
}
