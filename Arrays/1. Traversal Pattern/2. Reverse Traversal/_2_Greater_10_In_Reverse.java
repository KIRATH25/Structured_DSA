// Question 3
// Description
// Print all elements greater than 10 in reverse order.

// Sample Input
// 5
// 4 12 7 20 15
// Sample Output
// 15 20 12
// Hint
// Combine reverse loop with condition.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]>10){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
