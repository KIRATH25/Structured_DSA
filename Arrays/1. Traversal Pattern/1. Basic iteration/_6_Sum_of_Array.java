//Question 6
//Description
//Find the average value of elements in the array.
//Sample Input
//4
//10 20 30 40
//Sample Output
//25
//Hint
//Average = sum / n .
  
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=arr[i]+sum;
        }
        System.out.println(sum);
    }
}
