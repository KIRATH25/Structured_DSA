// Question 8
// Description
// Remove all negative numbers from the array.
// Sample Input
// 6
// 3 -1 4 -2 5 6
// Sample Output
// 3 4 5 6
// Hint
// Overwrite unwanted values.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i = 0; i < n; i++){
            if(arr[i]>0){
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
