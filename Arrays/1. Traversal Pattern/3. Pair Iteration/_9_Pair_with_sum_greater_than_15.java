// Question 9
// Description
// Print pairs whose sum is greater than 15.
// Sample Input
// 5
// 4 8 10 6 12
// Sample Output
// 4 12
// 8 10
// 8 12
// 10 6
// 10 12
// 6 12
// Hint
// Use nested loops and check sum condition.

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
                if((arr[i]+arr[j])>15){
                    System.out.println(arr[i]+" "+arr[j]);           
                }
            }
        }
    }
}
