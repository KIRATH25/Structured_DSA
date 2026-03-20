// Question 11
// Description
// Move all zeros to the end of the array while maintaining order.
// Sample Input
// 6
// 1 0 2 0 3 4
// Sample Output
// 1 2 3 4 0 0
// Hint
// Use two pointers to swap non-zero values forward.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
