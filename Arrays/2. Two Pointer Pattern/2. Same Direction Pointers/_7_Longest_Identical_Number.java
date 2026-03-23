// Question 7
// Description
// Find the longest sequence of identical numbers.
// Sample Input
// 7
// 1 1 1 2 2 3 3
// Sample Output
// 3
// Hint
// Use one pointer for start and another for scanning.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxCount = 1;
        int currentCount = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] == arr[i - 1]){
                currentCount++;
            }else{
                currentCount=1;
            }
            maxCount = Math.max(maxCount, currentCount);
        }
        System.out.print(maxCount);

    }
}
