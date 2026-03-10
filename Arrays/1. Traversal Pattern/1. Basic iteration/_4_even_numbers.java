// Question 4
// Description
// Count how many even numbers are present in the array.
// Sample Input
// 5
// 2 7 4 9 6
// Sample Output
// 3
// Hint
// Check arr[i] % 2 == 0 .
import java.util.*;

public class _4_even_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count++;
            }
            else{
                continue;
            }
        }
        System.out.print(count);

    }
}
