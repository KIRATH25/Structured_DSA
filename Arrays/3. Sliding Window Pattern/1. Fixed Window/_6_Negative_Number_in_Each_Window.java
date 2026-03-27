// Question 6
// Description
// Find the first negative number in every window of size k.
// Sample Input
// 7
// 12 -1 -7 8 -15 30 16
// 3
// Sample Output
// -1 -1 -7 -15 -15
// Hint
// Keep track of negative numbers inside the window.

import java.util.*;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    for(int i = 0; i <= n - k; i++){
        boolean found = false;
        for(int j = i; j < i + k; j++){
            if(arr[j] < 0){
                System.out.print(arr[j] + " ");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.print("0 ");
        }
    }
  }
}
