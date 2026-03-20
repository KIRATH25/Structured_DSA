// Question 9
// Description
// Determine whether an array contains a pair whose product equals target.
// Sample Input
// 5
// 1 2 3 4 6
// 12
// Sample Output
// Yes
// Hint
// Multiply values at both pointers.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target=sc.nextInt();
        boolean t=false;
        for(int i = 0; i < n; i++){
            for(int j=i+1;j<n;j++){
                if((arr[i] * arr[j]) == target){
                    t=true;
                }
            }
        }
        if(t=true){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
