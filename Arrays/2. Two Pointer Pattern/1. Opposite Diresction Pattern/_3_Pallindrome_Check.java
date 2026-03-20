// Question 3
// Description
// Check whether a string is a palindrome.
// Sample Input
// madam
// Sample Output
// Yes
// Hint
// Compare characters from both ends.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
