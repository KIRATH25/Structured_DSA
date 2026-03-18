// Question 7
// Description
// Print all negative numbers in the array.
// Sample Input
// 6
// -1 5 -3 2 -8 9
// Sample Output
// -1 -3 -8
// Hint
// Check if element < 0 .

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");    
            }
        }
    }
}
