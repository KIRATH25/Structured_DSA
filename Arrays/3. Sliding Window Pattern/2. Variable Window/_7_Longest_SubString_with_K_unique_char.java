// Find the longest substring with exactly k unique characters.
// Sample Input
// aabacbebebe
// 3
// Sample Output
// 7
// Hint
// Expand until distinct characters exceed k.

import java.util.*;

public class _4_longest_subarray_with_sum_k {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s=sc.next();
            int k=sc.nextInt();
            HashMap<Character,Integer> map=new HashMap<>();
            int l=0,r=0,maxlen=0;
            while(r<s.length()){
                char ch=s.charAt(r);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.size()>k){
                    map.put(s.charAt(l),map.get(s.charAt(l))-1);
                    if(map.get(s.charAt(l))==0){
                        map.remove(s.charAt(l));
                    }
                    l++;
                }
                if(map.size()==k){
                    maxlen=Math.max(maxlen,r-l+1);
                }
                r++;
            }
            System.out.println(maxlen);
    }
}
