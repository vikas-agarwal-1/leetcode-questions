// class Solution {
//     public int longestPalindrome(String s) {
//         Map<Character,Integer> map = new HashMap();

//         if(s.length() <= 1) {
//             return s.length();
//         }

//         int count = 0;
//         for(int i=0; i<s.length(); i++) {
//             char ch = s.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         for(int value : map.values()) {
//             if(value % 2 == 0) {
//                 count += value;
//             }
//             else if(value == 1) {
//                 count += 1;
//             }
//             else {
//                 int remainder = value % 2;
//                 count += (value-remainder);
//             }
//         }
//         return count;
//     }
// }

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = 0;
        boolean hasOdd = false;

        for (int value : map.values()) {
            if (value % 2 == 0) {
                count += value;
            } else {
                // Add the largest even part (e.g., for 3, add 2; for 1, add 0)
                count += (value - 1);
                hasOdd = true; // Remember that we have at least one leftover character
            }
        }

        // We can place one single leftover character in the middle of the palindrome
        if (hasOdd) {
            count += 1;
        }

        return count;
    }
}