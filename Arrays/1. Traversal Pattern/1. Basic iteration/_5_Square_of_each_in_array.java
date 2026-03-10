// Question 5
// Description
// Print the square of each element in the array.
// Sample Input
// 4
// 2 3 4 5
// Sample Output
// 4 9 16 25

// Hint
// During traversal print arr[i] * arr[i] .

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]*arr[i]+" ");
        }
    }
}