// Question 3
// Description
// Remove all occurrences of a specific value from the array.
// Sample Input
// 6
// 3 2 2 3 4 2
// 2
// Sample Output
// 3 3 4
// Hint
// Use two pointers to overwrite unwanted elements.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target=sc.nextInt();
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=target){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
