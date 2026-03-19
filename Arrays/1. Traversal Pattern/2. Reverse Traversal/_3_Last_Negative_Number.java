// Question 4
// Description
// Find the first negative number from the right side.
// Sample Input
// 6
// 5 8 -3 2 -9 4
// Sample Output
// -9
// Hint
// Reverse traverse and break when negative is found.

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
            if(arr[i]<0){
                System.out.print(arr[i]);
                break;
            }
        }
    }
}
