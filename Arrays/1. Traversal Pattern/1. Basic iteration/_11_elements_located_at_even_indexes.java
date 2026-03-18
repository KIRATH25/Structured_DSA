// Question 11
// Description
// Print the elements located at even indexes.
// Sample Input
// 6
// 5 10 15 20 25 30
// Sample Output
// 5 15 25
// Hint
// Check if index % 2 == 0 .

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
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
