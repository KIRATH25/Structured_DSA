// Question 7
// Description
// Print the array elements in reverse but skip multiples of 3.
// Sample Input
// 6
// 3 5 6 7 9 8
// Sample Output
// 8 7 5
// Hint
// Check arr[i] % 3 != 0 .

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
            if(arr[i]%3==0){
                continue;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
