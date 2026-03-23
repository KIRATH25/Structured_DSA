// Question 6
// Description
// Find the first repeating element in the array.
// Sample Input
// 6
// 4 5 6 4 7 8
// Sample Output
// 4
// Hint
// Track elements seen so far.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i]);
                    break;
                }
            }
        }
    }
}
