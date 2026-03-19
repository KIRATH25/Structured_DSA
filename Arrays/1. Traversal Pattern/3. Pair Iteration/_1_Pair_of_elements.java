// Question 1
// Description
// Print all possible pairs of elements in the array.
// Sample Input
// 3
// 1 2 3
// Sample Output
// 1 2
// 1 3
// 2 3
// Hint
// Use two loops: i and j = i + 1

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}