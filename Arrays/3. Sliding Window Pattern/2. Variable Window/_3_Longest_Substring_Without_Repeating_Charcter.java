// Question 3
// Description
// Find the longest substring without repeating characters.
// Sample Input
// abcabcbb
// Sample Output
// 3
// Hint
// Use a set to track characters in the current window.

import java.util.*;

public class _1_without_repeat_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=0,r=0,maxlen=Integer.MIN_VALUE;
        HashSet<Character> set=new HashSet<>();
         while (r < s.length()) {
            char ch = s.charAt(r);
            if (!set.contains(ch)) {
                set.add(ch);
                maxlen = Math.max(maxlen, r - l + 1);
                r++;
            }
            else {
                set.remove(s.charAt(l));
                l++;
            }
        }
        System.out.println(maxlen);
    }
}

Q
