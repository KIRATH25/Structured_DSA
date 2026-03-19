// Question 5
// Description
// Print the indexes of odd numbers while traversing from the end.
// Sample Input
// 5
// 2 7 4 9 6
// Sample Output
// 3 1

// Hint
// Check arr[i] % 2 != 0 .

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
            if(arr[i]%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
