// Question 10
// Description
// Find the maximum length substring where you can replace at most k characters to make
// all characters same.
// Sample Input
// AABABBA
// 1
// Sample Output
// 4
// Hint
// Track most frequent character in window.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int k = sc.nextInt();
        
        int count = 0;
        
        // first window
        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        
        int maxCount = count;
        
        // slide window
        for(int i = k; i < s.length(); i++){
            
            // add new char
            if(isVowel(s.charAt(i))){
                count++;
            }
            
            // remove old char
            if(isVowel(s.charAt(i - k))){
                count--;
            }
            
            maxCount = Math.max(maxCount, count);
        }
        
        System.out.println(maxCount);
    }
    
    static boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}
