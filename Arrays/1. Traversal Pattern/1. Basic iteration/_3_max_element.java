// Question 3
// Description
// Find the maximum element in the array.

// Sample Input
// 6
// 3 8 1 9 4 7
// Sample Output
// 9
// Hint
// Start with the first element as max and compare it with each next element.

import java.util.*;

public class _3_max_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
