// Question 9
// Description
// Count how many elements are greater than 10.
// Sample Input
// 6
// 5 12 18 7 3 20
// Sample Output
// 3
// Hint
// Use condition arr[i] > 10 .

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] k=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            k[i]=arr[i]*2;
            System.out.print(k[i]+" ");
        }
    }
}
