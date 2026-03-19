// Question 3
// Description
// Print pairs whose product is even.
// Sample Input
// 4
// 1 2 3 4
// Sample Output
// 1 2
// 1 4
// 2 3
// 2 4
// 3 4
// Hint
// Product is even if at least one number is even.

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
                if((arr[i]*arr[j])%2==0){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
