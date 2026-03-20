// Question 5
// Description
// Count how many pairs have a sum less than a given target.
// Sample Input

// 5
// 1 2 3 4 5
// 6
// Sample Output
// 4
// Hint
// When sum is less than target, multiple pairs can be counted.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if((arr[i] + arr[j]) < target){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
