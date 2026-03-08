// Question 1

// Description
// Write a program to print all elements of an array in the same order they appear.

// Sample Input

// 5
// 1 2 3 4 5

// Sample Output

// 1 2 3 4 5

// Hint
// Use a loop starting from index 0 and go until n-1.


import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int err:arr){
            System.out.println(err);
        }
    }
}