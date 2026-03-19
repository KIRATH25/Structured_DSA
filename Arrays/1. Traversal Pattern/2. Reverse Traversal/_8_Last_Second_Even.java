// Question 8
// Description
// Find the second last even number in the array.
// Sample Input
// 6
// 3 8 5 6 9 4
// Sample Output

// 6
// Hint
// Count even numbers during reverse traversal.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]%2==0){
                count++;
                if(count==2){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
