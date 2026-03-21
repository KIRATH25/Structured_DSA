// Question 2
// Description
// Move all zeros to the end of the array while keeping non-zero elements in order.
// Sample Input
// 6
// 0 1 0 3 12 5
// Sample Output
// 1 3 12 5 0 0
// Hint
// Use one pointer to track placement of non-zero elements.

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
