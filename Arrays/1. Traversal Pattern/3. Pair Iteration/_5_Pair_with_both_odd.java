// Question 5

// Description
// Count pairs where both numbers are odd.
// Sample Input
// 5
// 1 3 4 7 8
// Sample Output
// 3
// Hint
// Check arr[i] % 2 != 0 and arr[j] % 2 != 0 .

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pair=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]%2!=0 && arr[j]%2!=0){
                    pair++;
                }
            }
        }
        System.out.print(pair);
    }
}
