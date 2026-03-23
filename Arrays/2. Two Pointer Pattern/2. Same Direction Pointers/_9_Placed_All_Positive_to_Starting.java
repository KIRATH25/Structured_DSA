// Question 9
// Description
// Group all positive numbers before negatives.
// Sample Input
// 6
// -3 4 -1 5 2 -7
// Sample Output
// 4 5 2 -3 -1 -7
// Hint
// Swap positions using two pointers.

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
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
