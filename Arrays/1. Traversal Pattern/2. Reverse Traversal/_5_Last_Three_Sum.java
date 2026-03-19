// Question 6
// Description
// Calculate the sum of the last three elements using reverse traversal.
// Sample Input
// 6
// 5 10 15 20 25 30
// Sample Output
// 75
// Hint
// Traverse last 3 positions.

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
        for(int i=n-1;i>n-4;i--){
            sum=sum+arr[i];
        }
        System.out.print(sum);
    }
}
