// Question 1
// Description
// Given a sorted array, determine if there exists a pair whose sum equals a target value.
// Sample Input
// 6
// 1 2 3 4 6 8
// 10
// Sample Output
// Yes
// Hint
// Use one pointer at the start and one at the end. Move them based on the current sum.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean k=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])==target){
                    k=true;
                    break;
                }
            }
        }
        if(k==true){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}