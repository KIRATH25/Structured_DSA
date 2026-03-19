// Question 6

// Description
// Check whether the last element is the largest in the array.
// Sample Input
// 5
// 3 5 8 6 10
// Sample Output
// Yes
// Hint
// Compare last element with all others.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int last = arr[n - 1];
        boolean Largest = true;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > last){
                Largest = false;
                break;
            }
        }
        if(Largest){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
