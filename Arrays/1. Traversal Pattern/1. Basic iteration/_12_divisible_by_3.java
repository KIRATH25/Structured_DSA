// Question 12
// Description
// Count how many numbers are divisible by 3.
// Sample Input
// 5
// 3 7 9 12 10
// Sample Output
// 3
// Hint
// Use arr[i] % 3 == 0 .

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%3==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
