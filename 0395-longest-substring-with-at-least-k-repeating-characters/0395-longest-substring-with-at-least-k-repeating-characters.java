// class Solution {
//     public int longestSubstring(String s, int k) {
//         // Brute approach
//         // int maxi = 0;
//         // for(int i =0; i<s.length(); i++) {
//         //     Map<Character, Integer> map = new HashMap();

//         //     for(int j=i; j<s.length(); j++) {
//         //         char ch = s.charAt(j);
//         //         map.put(ch, map.getOrDefault(ch, 0) + 1);

//         //         boolean valid = true;

//         //         for(int freq : map.values()) {
//         //             if(freq < k) {
//         //                 valid = false;
//         //                 break;
//         //             }
//         //         }

//         //         if(valid) {
//         //             maxi = Math.max(maxi, j-i+1);
//         //         }
//         //     }
//         // }
//         // return maxi;

//         // optimal approach Divide and Conqueor

//         if (s.length() < k) {
//             return 0;
//         }

//         int maxi = 0;
//         Map<Character, Integer> map = new HashMap();
//         for(char ch : s.toCharArray()) {
//             map.put(ch, map.getOrDefault(ch, 0)+1);
//         }

//         for(int i=0; i<s.length(); i++) {
//             char c = s.charAt(i);
//             if(map.get(c) < k) {
//                 int left = longestSubstring(s.substring(0, i), k);
//                 int right = longestSubstring(s.substring(i+1), k);
//                 return Math.max(left, right);
//             }
//         }
//         return s.length();
//     }
// }



class Solution {
    public int longestSubstring(String s, int k) {
        if (s == null || s.length() < k) {
            return 0;
        }

        // Count total frequency of each character
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Find the first character that appears fewer than k times
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] < k) {
                // Split at the invalid character and check both halves
                int left = longestSubstring(s.substring(0, i), k);
                int right = longestSubstring(s.substring(i + 1), k);
                return Math.max(left, right);
            }
        }

        // Every character in s appears at least k times
        return s.length();
    }
}