// Question 10
// Description
// Check if any pair has equal elements.
// Sample Input
// 5
// 2 4 6 2 8
// Sample Output
// Yes
// Hint
// Compare each pair.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean k=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
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
